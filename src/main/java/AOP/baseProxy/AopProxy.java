package AOP.baseProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class AopProxy {


    /**
     * 代理方法实现Aop的配置
     */
    //要代理的对象
    private AopInterface target;

    public AopProxy(AopInterface target){
        this.target=target;
    }

    public AopInterface getAopFirstProxy(){
        AopInterface proxy = null;

        //代理对象从哪个类加载器加载
        ClassLoader loader = target.getClass().getClassLoader();

        //获取代理对象中的方法
        Class[] intface = new Class[]{AopInterface.class};

        InvocationHandler h = new InvocationHandler() {
            /**
             * proxy:正在被使用的对象
             * method:正在被调用的方法
             * args:传入的参数
             * @param proxy
             * @param method
             * @param args
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                System.out.println(name+"***"+ Arrays.asList(args));
                Object value = method.invoke(target,args);
                return value;
            }
        };
        proxy= (AopInterface) Proxy.newProxyInstance(loader,intface,h);

        return proxy;
    }


}
