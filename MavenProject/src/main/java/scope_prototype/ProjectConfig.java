package scope_prototype;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ProjectConfig {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)   // everytime springs call it, a new Bean is created.
    public CommentService commentService(){  // default is Singleton (every instance of a bean is the same).
        return new CommentService();         // basically you will use it when the class is mutable, if not use Singleton.
    }
}
