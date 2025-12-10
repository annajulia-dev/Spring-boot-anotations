package stereotype_annotation;

import org.springframework.stereotype.Component;

@Component // create a bean for context
public class Parrot {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
