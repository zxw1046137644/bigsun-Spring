import AOP.baseProxy.AopFirst;
import AOP.baseProxy.AopInterface;
import AOP.baseProxy.AopProxy;
import SpringCRCS.Service.SpringService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import AOP.fivetongzhi.QianZhiImpl;

public class AopTest {

    /**
     * baseFirstTest AOP下baseProxy包中代理方法实现SpringAOP
     */
    @Test
    public void test() {
        AopInterface target = new AopFirst();
        AopInterface proxy = new AopProxy(target).getAopFirstProxy();
        System.out.println(proxy.get(1, 3));
        System.out.println(proxy.add(2, 4));
    }



    /**
     * 通知
     */
    @Test
    public void houzhi() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-qian.xml");
        QianZhiImpl q = (QianZhiImpl) ctx.getBean(QianZhiImpl.class);
        System.out.println("调用方法：" + q.add(1, 2));

    }


}
