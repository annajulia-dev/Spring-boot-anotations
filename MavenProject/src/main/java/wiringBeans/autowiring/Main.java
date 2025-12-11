package wiringBeans.autowiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


        var person = context.getBean(PersonAttribute.class);

        System.out.println(person.getName());
        System.out.println(person.getParrot());

    }
}
