package test;

import Entry.Crr;
import Entry.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class beanPostProcessor implements BeanPostProcessor {
    /**
     * 实现BeanPostProcessor接口,配置bean的后置处理器
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanBeforeInitialization:" + bean + beanName);
        return null;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanAfterInitialization:" + bean + beanName);
        User user = new User();
        user.setName("zxw");
        user.setCar(new Crr("BMW",2222222.2));
        return user;
    }
}
