package exercises._01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class Knight {

    private final Weapon weapon;

    @Autowired
    public Knight(@Qualifier("dagger") Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        System.out.println("Knights attack with " + weapon.getType());
    }
}
