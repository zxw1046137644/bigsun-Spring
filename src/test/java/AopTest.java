import AOP.baseProxy.AopFirst;
import AOP.baseProxy.AopInterface;
import AOP.baseProxy.AopProxy;
import AOP.qianzhi.LoginAspect;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import AOP.qianzhi.QZhiFirst;

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
        QZhiFirst q = (QZhiFirst) ctx.getBean("QZhiFirst");
        LoginAspect l = (LoginAspect) ctx.getBean("loginAspect");
        System.out.println(l);
        System.out.println(q.get(1,2));
  }

    /**
     * 后置通知
     */
    @Test
    public void houzhi(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-qian.xml");
        QZhiFirst q = (QZhiFirst) ctx.getBean("QZhiFirst");
        System.out.println(q);
    }


}
