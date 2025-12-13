package exercises._01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "exercises._01")
public class GameConfig {

    @Bean(name = "magicPotion")
    public Potion potion(){
        var b = new Potion();
        b.setName("Magic Potion");
        return b;
    }
    @Bean
    @Primary
    public Sword sword1(){
        var sword = new Sword();
        sword.setType("SuperNova");
        return sword;
    }
}
