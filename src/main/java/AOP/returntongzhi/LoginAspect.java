package AOP.returntongzhi;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//切面类，需要放到IOC容器中
@Component
@Aspect
public class LoginAspect {

    @Before("execution(public * *(..))")//声明该方法是一个前置通知
    public void beforeMethod(JoinPoint point)
    {
        String methodName = point.getSignature().getName();

        System.out.println("开始前置通知"+methodName);
    }

//    @After("")
//    public void afterMethod() {
//
//    }
}
