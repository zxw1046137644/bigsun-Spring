package AOP.fivetongzhi;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//切面类，需要放到IOC容器中
@Component
@Aspect
public class LoginAspect {

    @Before("execution(public * *(..))")//声明该方法是一个前置通知
    public void beforeMethod(JoinPoint point) {
        String methodName = point.getSignature().getName();

        System.out.println("开始前置通知" + methodName);
    }


    /**
     * 后置通知不论方法是否出现异常都会执行
     * JoinPoint 连接点
     *
     * @param point
     */
    @After("execution(public * *(..))")//声明该方法是一个后置通知
    public void afterMethod(JoinPoint point) {
        String methodName = point.getSignature().getName();
        System.out.println("开始后置通知" + methodName);
    }


    /**
     * dev3切换看书打卡解放路卡机放得开了骄傲了客服即可了
     * 返回通知，获取方法返回值
     *
     * @param point
     */
    @AfterReturning(value = "execution(public * *(..))", returning = "result")
    public void afterReturning(JoinPoint point, Object result) {
        String methodName = point.getSignature().getName();
        System.out.println("返回通知" + methodName + "返回结果：" + result);
    }

    /**
     * 异常通知，获取方法所产生的异常
     *
     * @param point
     */
    @AfterThrowing(value = "execution(public * *(..))", throwing = "result")
    public void afterReturning(JoinPoint point, Exception result) {
        String methodName = point.getSignature().getName();
        System.out.println("异常通知" + methodName + "返回异常：" + result);
    }


}
