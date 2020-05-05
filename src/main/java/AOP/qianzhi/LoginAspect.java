package AOP.qianzhi;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//切面类，需要放到IOC容器中
@Aspect
@Component
public class LoginAspect {

    @Before("execution(public int AOP.qianzhi.QZhiFirst.get(int,int))")//声明该方法是一个前置通知
    public void beforeMethod() {
        System.out.println("开始前置通知");
    }

    @After("")
    public void afterMethod() {

    }
}
