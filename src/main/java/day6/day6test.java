package day6;


import mybatisday1.Doctor;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class day6test {


    @Test
    public void test1() {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        User bean1 = app.getBean(User.class);
        AutowiredService bean2 = (AutowiredService) app.getBean("autowiredservice");
//        System.out.println(app.getBean(ComboPooledDataSource.class));
        bean2.getUser();

    }
}
