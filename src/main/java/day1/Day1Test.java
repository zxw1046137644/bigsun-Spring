package day1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Day1Test {


    //获取配置文件总配置的ioc容器给我们创建的对象
    @Test
    public void day1Test() {
        ApplicationContext app = new ClassPathXmlApplicationContext("application-day1.xml");
        Day1Dao day1Dao = (Day1Dao) app.getBean("day1Dao");
        Day1Dao day2Dao = (Day1Dao) app.getBean("day1Dao");
        System.out.println(day1Dao == day2Dao);
        day1Dao.save();
    }
}
