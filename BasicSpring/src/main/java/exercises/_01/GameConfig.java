package exercises._01;

import exercises._01.items.Potion;
import exercises._01.items.Sword;
import exercises._01.quests.RescueCatQuest;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "exercises._01")
@EnableAspectJAutoProxy
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
    @Bean
    public RescueCatQuest catQuest(){
        return new RescueCatQuest();
    }
}
