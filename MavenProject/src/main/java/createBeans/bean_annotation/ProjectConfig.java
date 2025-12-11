package createBeans.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean("Koko")  // Bean name is "Koko" not parrot1 anymore
    @Primary       // Default bean, if don't specified
    Parrot parrot1(){
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    Parrot parrot2(){
        var p = new Parrot();
        p.setName("Priquito");
        return p;
    }
    @Bean
    Integer ten(){
        return 10;
    }

}
