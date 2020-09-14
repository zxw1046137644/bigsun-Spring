import Entry.Crr;
import Entry.User;


import day5.Component.SpringBase;
import day5.Controller.SpringController;
import day5.Repository.SpringRepository;
import day5.Service.SpringService;
import generic.di.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {

    /**
     * xml方式配置SpringIOC 容器  application.xml
     * @param args
     */
    public static void main(String[] args) {
        //创建SpringIOC容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = (User) ctx.getBean("user");
//        User user2 = (User) ctx.getBean("user");
        System.out.println(user.toString());
        ctx.close();
    }

    /**
     * 静态工厂方式创建Bean
     */
    @Test
    public void staticFactoryTest() {
        ApplicationContext ctr = new ClassPathXmlApplicationContext("bean-factory-day2.xml");
        Crr car1 = (Crr) ctr.getBean("car1");
        System.out.println(car1);
    }

    /**
     * 动态工厂方式创建Bean
     */
    @Test
    public void instanceCarFactoryTest() {
        ApplicationContext ctr = new ClassPathXmlApplicationContext("bean-factory-day2.xml");
        Crr car1 = (Crr) ctr.getBean("car2");
        System.out.println(car1);
    }

    /**
     * 注解方式把类交给Spring容器管理 SpringCRCS包，开启容器自动扫描
     */
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
        ApplicationContext ctx =new ClassPathXmlApplicationContext("bean-di.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        userService.add();


    }

}
