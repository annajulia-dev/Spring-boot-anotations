package createBeans.stereotype_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        var p = context.getBean(Parrot.class);

        System.out.println(p.getName());
        System.out.println(p);
    }
}
