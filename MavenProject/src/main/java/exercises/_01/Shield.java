package exercises._01;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Shield {
    public Shield(){
        System.out.println("Heavy shield ir forged!");
    }
}
