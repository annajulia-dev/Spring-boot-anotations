package exercises._01.models;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Mercenary {

    @PostConstruct
    public void init(){
        System.out.println("Mercenary is ready!");
    }
}
