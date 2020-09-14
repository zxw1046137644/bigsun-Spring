package day4;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.DataSources;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * 数据源配置，数据源抽取
 */
public class datasource {


    //获取c3p0配置文件数据
    @Test
    public void getC3p0() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("c3p0dataday4");
        String driver = resourceBundle.getString("driver");
        System.out.println(driver);
    }

    //获取c3p0数据源
    @Test
    public void test1() throws PropertyVetoException, SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://rdsj56325f0xdcn346hn.mysql.rds.aliyuncs.com:3306/doct");
        dataSource.setUser("doct");
        dataSource.setPassword("Yuantu123");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    //spring文件获取数据库连接
    @Test
    public void getSpringConn() {
        ApplicationContext app = new ClassPathXmlApplicationContext("application-day4.xml");
        System.out.println(app.getBean(ComboPooledDataSource.class));
    }
}
