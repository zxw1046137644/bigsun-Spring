package mybatisday1;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class mybatisTest {


    @Test//初始化配置mybatis
    public void test1() throws IOException {
        Doctor doct = new Doctor();
        doct.setPassword("skdjk22d");
        doct.setUnionId("29");
        doct.setPhoneNum("1213123");
        doct.setId(30860);
        InputStream resourceAsStream = Resources.getResourceAsStream("MybatisCofig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        sqlSession.insert("DoctorsMapper.insertDoct",doct);//插入操作
        sqlSession.update("DoctorsMapper.updataDoct",doct);//修改操作
//        List<Doctor> doctors = sqlSession.selectList("DoctorsMapper.getDoctors");//查询操作
//        System.out.println(doctors);
        sqlSession.commit();
        sqlSession.close();
    }


}
