import Entry.Crr;
import Entry.User;
import SpringCRCS.Component.SpringBase;
import SpringCRCS.Controller.SpringController;
import SpringCRCS.Repository.SpringRepository;
import SpringCRCS.Service.SpringService;
import generic.di.BaseRepository;
import generic.di.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.nio.cs.US_ASCII;

public class HelloTest {

    public static void main(String[] args) {
        //创建SpringIOC容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanlife.xml");
        User user = (User) ctx.getBean("user");
//        User user2 = (User) ctx.getBean("user");
        System.out.println(user.toString());
        ctx.close();
    }

    @Test
    public void staticFactoryTest() {
        ApplicationContext ctr = new ClassPathXmlApplicationContext("bean-factory.xml");
        Crr car1 = (Crr) ctr.getBean("car1");
        System.out.println(car1);
    }

    @Test
    public void instanceCarFactoryTest() {
        ApplicationContext ctr = new ClassPathXmlApplicationContext("bean-factory.xml");
        Crr car1 = (Crr) ctr.getBean("car2");
        System.out.println(car1);
    }

    @Test
    public void SpringCRCS() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annota.xml");
        SpringBase base = (SpringBase) ctx.getBean("springBase");
        SpringController controller = (SpringController) ctx.getBean("springController");
        SpringRepository repository = (SpringRepository) ctx.getBean("springRepository");
        SpringService service = (SpringService) ctx.getBean("springService");
        System.out.println(base);
        System.out.println(controller);
        System.out.println(repository);
        System.out.println(service);
        controller.add();


    }




    /**
     * 泛型依赖注入
     */
    @Test
    public void di(){
        ApplicationContext ctx =new ClassPathXmlApplicationContext("di.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.add();


    }
}
