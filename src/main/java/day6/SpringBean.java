package day6;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import mybatisday1.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

@PropertySource("classpath:c3p0dataday4.properties")

public class SpringBean {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.username}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public ComboPooledDataSource getDataSources() throws PropertyVetoException{

        System.out.println("我正在初始化sql");
        System.out.println(driver);
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    @Scope("singleton")
    public User getUserBean(){
        User doctor = new User();
        return doctor;
    }


}
