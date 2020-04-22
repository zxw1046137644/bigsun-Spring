import AOP.baseProxy.AopFirst;
import AOP.baseProxy.AopInterface;
import AOP.baseProxy.AopProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import qianzhi.QianZhiFirst;

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
  public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-qian.xml");
        QianZhiFirst q = (QianZhiFirst) ctx.getBean("qianZhiFirst");
        System.out.println(q);
  }

}
