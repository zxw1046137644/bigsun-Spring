package day3;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Day3Test {

    /**
     * set方式来描述依赖注入
     */
    @Test
    public void day3Test() {
        ApplicationContext app = new ClassPathXmlApplicationContext("application-day3.xml");
//        ApplicationContext app1 = new FileSystemXmlApplicationContext("");
//        ApplicationContext app2 = new AnnotationConfigApplicationContext("");
        Day3Service day3Service = app.getBean(Day3Service.class);
//        Day3Service day3Service = (Day3Service) app.getBean("day3Service");
        day3Service.save();

    }
}
