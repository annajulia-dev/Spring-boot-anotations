package exercises._01;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Dagger implements Weapon{
    private String type;

    @PostConstruct
    public void init(){
        if (this.type == null){
            this.type = "Thief knife";
        }
    }


    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String getType(){
        return this.type;
    }
}
