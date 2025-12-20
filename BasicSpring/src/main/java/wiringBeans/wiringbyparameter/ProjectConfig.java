package wiringBeans.wiringbyparameter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Person person(Parrot parrot2){ // The name of the variable is the name of the bean you want.
        Person person = new Person();   // With that method you can inject beans created by...
        person.setName("Giovana");     // stereotype_annotation(@Component) too
        person.setParrot(parrot2);
        return person;
    }
    @Bean
    public Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.setName("Kika");
        return parrot;
    }
    @Bean public Parrot parrot2(){
        Parrot parrot = new Parrot();
        parrot.setName("Lola");
        return parrot;
    }
}
