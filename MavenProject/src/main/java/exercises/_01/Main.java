package exercises._01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context =
                new AnnotationConfigApplicationContext(GameConfig.class);

        var sword = context.getBean(Sword.class);

        System.out.println(sword.getType());

        for(String beanName : context.getBeanDefinitionNames())
        System.out.println(beanName);
    }
}
