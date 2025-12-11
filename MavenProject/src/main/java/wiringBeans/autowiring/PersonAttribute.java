package wiringBeans.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonAttribute {
    private String name = "Ana";
    @Autowired   // autowired on attribute has a problem
    private  Parrot parrot; // you can't define the attribute a final, because you don't have a starting value

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot(){
        return this.parrot;
    }
}
