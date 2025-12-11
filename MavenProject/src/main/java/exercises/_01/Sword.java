package exercises._01;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Sword {
    private String type;

    @PostConstruct
    public void init(){
        this.type = "Excalibur";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
