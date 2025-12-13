package wiringBeans.wiringbyparameter;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig2 {
    @Bean
    public Person person(@Qualifier("parrot2") Parrot parrot2){ // it's the same thing but easier to read
        Person person = new Person();
        person.setName("Giovana");
        person.setParrot(parrot2);
        return person;
    }
    @Bean
    public Parrot parrot1(){
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
