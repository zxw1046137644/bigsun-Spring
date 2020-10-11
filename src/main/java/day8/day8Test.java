package day8;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class day8Test {


    @Test
    public void eightTest() {
        ApplicationContext app = new ClassPathXmlApplicationContext("application-day8.xml");
        TransactionServer transactionServer =  app.getBean(TransactionServer.class);
        transactionServer.transfer(100);
    }
}
