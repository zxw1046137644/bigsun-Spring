import AOP.baseProxy.AopFirst;
import AOP.baseProxy.AopInterface;
import AOP.baseProxy.AopProxy;
import org.junit.Test;

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
     * AnnotationTest
     */
    @Test
  public void test2(){

  }

}
