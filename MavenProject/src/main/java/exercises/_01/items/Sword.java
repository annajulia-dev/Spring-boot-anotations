package exercises._01.items;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Sword implements Weapon{
    private String type;

    @PostConstruct
    public void init(){
        if (this.type == null){
        this.type = "Excalibur";
        }
    }
    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
