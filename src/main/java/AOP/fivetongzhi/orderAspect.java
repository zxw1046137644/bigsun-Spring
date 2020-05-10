package AOP.fivetongzhi;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class orderAspect {

    @Before("execution(public * *(..))")
    public void beforeAspect() {
        System.out.println("切面优先级");
    }
}
