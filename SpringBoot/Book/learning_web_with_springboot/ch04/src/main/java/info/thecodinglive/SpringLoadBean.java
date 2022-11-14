package info.thecodinglive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class SpringLoadBean {
    public static void main(String ar[]){
        ApplicationContext ctx = SpringApplication.run(SpringLoadBean.class, ar);
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String beanName : beanNames){
            System.out.println(beanName);
        }
    }
}
