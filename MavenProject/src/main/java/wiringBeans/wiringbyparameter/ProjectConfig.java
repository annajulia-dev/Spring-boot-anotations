package wiringBeans.wiringbyparameter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Person person(Parrot parrot){ // here is the difference between the two methods
        Person person = new Person();   // with that method you can inject beans created by...
        person.setName("Giovana");     // stereotype_annotation(@Component) too
        person.setParrot(parrot);
        return person;
    }
    @Bean
    public Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.setName("Kika");
        return parrot;
    }
}
