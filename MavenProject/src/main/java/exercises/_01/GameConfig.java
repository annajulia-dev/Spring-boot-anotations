package exercises._01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "exercises._01")
public class GameConfig {

    @Bean(name = "magicPotion")
    public Potion potion(){
        var b = new Potion();
        b.setName("Magic Potion");
        return b;
    }
}
