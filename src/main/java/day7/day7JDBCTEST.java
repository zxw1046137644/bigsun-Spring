package day7;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import day6.SpringConfiguration;
import day6.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.Date;

public class day7JDBCTEST {

    public JdbcTemplate jdbcTemplate;


    @Test
    public void test1() throws SQLException {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        jdbcTemplate = new JdbcTemplate();
        ComboPooledDataSource bean = app.getBean(ComboPooledDataSource.class);
        System.out.println(bean.getConnection());
//        jdbcTemplate.setDataSource(app.getBean(ComboPooledDataSource.class));
//        jdbcTemplate.update("insert into user values (?,?,?,?,?,?)", "111", "222", 22, 22222, "zxw", new Date());
    }
}
