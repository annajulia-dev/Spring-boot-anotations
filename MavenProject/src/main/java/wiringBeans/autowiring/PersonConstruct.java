package wiringBeans.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonConstruct {
    private String name = "Homura";
    private final Parrot parrot; // with this method you can use the final attribute

    @Autowired // autowired on constructor method
    public PersonConstruct(Parrot parrot){
        this.parrot = parrot;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
