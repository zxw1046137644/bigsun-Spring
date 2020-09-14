package day5;

import day5.Component.SpringBase;
import day5.Controller.SpringController;
import day5.Repository.SpringRepository;
import day5.Service.SpringService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class day5test {

    @Autowired
    @Qualifier("springRepository")
    public SpringRepository springRepository;
    @Test
    public void test1() {
        ApplicationContext app = new ClassPathXmlApplicationContext("application-day5.xml");
        SpringService springService = (SpringService) app.getBean("doct");

        springService.service();
        System.out.println(springRepository);
    }
}
