package exercises._01;

import exercises._01.models.GuildMaster;
import exercises._01.models.Knight;
import exercises._01.models.Mercenary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context =
                new AnnotationConfigApplicationContext(GameConfig.class);
//
//        var knight = context.getBean(Knight.class);
//
//
//        knight.attack();

        var guildMaster = context.getBean(GuildMaster.class);

        guildMaster.command();

        var mercenary1 = context.getBean(Mercenary.class);
        var mercenary2 = context.getBean(Mercenary.class);

        System.out.println(mercenary1 == mercenary2);

//        for(String beanName : context.getBeanDefinitionNames())
//        System.out.println(beanName);
    }
}
