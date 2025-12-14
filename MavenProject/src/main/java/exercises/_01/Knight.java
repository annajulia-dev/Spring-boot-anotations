package exercises._01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
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
