package day6;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("day6")
@Import(SpringBean.class)
public class SpringConfiguration {


}
