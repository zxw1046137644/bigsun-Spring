package day5.Service;

import day5.Repository.SpringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("doct")
public class SpringService {

    @Autowired
    private SpringRepository springRepository;


    @Value("${jdbc.driver}")
    private String driver;



    public void service() {
        System.out.println("SpringService .....");
        springRepository.save();
        System.out.println(driver);
    }
}
