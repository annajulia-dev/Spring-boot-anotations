package wiringBeans.wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("Giovana");
        person.setParrot(parrot()); // here we wired the beans
        return person;
    }
    @Bean
    public Parrot parrot(){
        Parrot parrot = new Parrot();
        parrot.setName("Kika");
        return parrot;
    }
}
