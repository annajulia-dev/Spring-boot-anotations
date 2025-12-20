package createBeans.stereotype_annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component // create a bean for context
public class Parrot {
    private String name;

    @PostConstruct
    public void init(){
        this.name = "Kiki";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
