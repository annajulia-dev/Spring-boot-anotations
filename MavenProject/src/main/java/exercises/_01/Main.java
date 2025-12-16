package exercises._01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context =
                new AnnotationConfigApplicationContext(GameConfig.class);

        var knight = context.getBean(Knight.class);


        knight.attack();


//        for(String beanName : context.getBeanDefinitionNames())
//        System.out.println(beanName);
    }
}
