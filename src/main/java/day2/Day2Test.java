package day2;

import day1.Day1Dao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Day2Test {

    /**
     * 通过静态工厂方式和动态工厂方式让Spring帮我们创建对象
     */


    @Test
    public void day2Test() {
        ApplicationContext app = new ClassPathXmlApplicationContext("bean-factory-day2.xml");
        app.getBean("day2JT");




    }
}
