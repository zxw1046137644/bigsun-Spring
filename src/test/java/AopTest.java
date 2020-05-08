import AOP.baseProxy.AopFirst;
import AOP.baseProxy.AopInterface;
import AOP.baseProxy.AopProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import AOP.qianzhi.QianZhiImpl;

public class AopTest {

    /**
     * baseFirstTest AOP下baseProxy包中代理方法实现SpringAOP
     */
    @Test
    public void test(){
        AopInterface target = new AopFirst();
        AopInterface proxy = new AopProxy(target).getAopFirstProxy();
        System.out.println(proxy.get(1,3));
        System.out.println(proxy.add(2,4));
    }

    /**
     * 前置通知
     */
    @Test
  public void qianzhi(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-qian.xml");
        QianZhiImpl q = ctx.getBean(QianZhiImpl.class);
//        LoginAspect l =  ctx.getBean(LoginAspect.class);
//        System.out.println(l);
        System.out.println(q.add(1,2));
  }

    /**
     * 后置通知
     */
    @Test
    public void houzhi(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-qian.xml");
        QianZhiImpl q = (QianZhiImpl) ctx.getBean("QianZhiImpl");
        System.out.println(q);
    }


}
