package day7;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import day6.SpringConfiguration;
import day6.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * JDBC初始用
 */
public class day7JDBCTEST {


    public JdbcTemplate jdbcTemplate;


    @Test
    public void test1() throws SQLException {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        jdbcTemplate = new JdbcTemplate();
//        jdbcTemplate.setDataSource(app.getBean(ComboPooledDataSource.class));
        jdbcTemplate.setDataSource(app.getBean(DruidDataSource.class));
//        jdbcTemplate.update("insert into user values (?,?,?)", 1, "zxw", 222);
//        jdbcTemplate.update("update user set balance=? where id=?", 5000,1);
//        List<User> query = jdbcTemplate.query("select * from user ", new BeanPropertyRowMapper<User>(User.class));

        User user = jdbcTemplate.queryForObject("select * from user where id=?", new BeanPropertyRowMapper<User>(User.class),1);
        System.out.println(user);

    }
}
