package AOP.fivetongzhi;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class orderAspect {

    @Pointcut("execution(public * *(..))")
    public void pointcut() {

    }


    @Before("pointcut()")
    public void beforeAspect() {
        System.out.println("切面优先级");
    }
}
