package wiringBeans.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class PersonSetter {
    private String name;
    private Parrot parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Autowired // you can use here too, but it's a bad option
    public void setParrot(Parrot parrot){ // you can't define the attribute final, and it's harder to read
        this.parrot = parrot;
    }
}
