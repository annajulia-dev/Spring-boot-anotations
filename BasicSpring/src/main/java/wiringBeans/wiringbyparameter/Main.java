package wiringBeans.wiringbyparameter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var parrot = context.getBean("parrot",Parrot.class);
        var person = context.getBean(Person.class);


        System.out.println(person.getName());
        System.out.println(parrot.getName());
        System.out.println(person.getParrot());
    }
}
