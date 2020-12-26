package day6;


import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class day6test {


    @Test
    public void test1() throws SQLException {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        User bean2 = app.getBean(User.class);
//        ComboPooledDataSource bean3 = app.getBean(ComboPooledDataSource.class);
        DruidDataSource bean4 = app.getBean(DruidDataSource.class);
//        AutowiredService bean2 = (AutowiredService) app.getBean("autowiredservice");
        System.out.println(app.getBean(ComboPooledDataSource.class));
        System.out.println(bean4);
//        System.out.println(bean2);

    }
}
