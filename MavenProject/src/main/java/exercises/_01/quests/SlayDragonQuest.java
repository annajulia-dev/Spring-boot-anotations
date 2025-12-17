package exercises._01.quests;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SlayDragonQuest implements Quest {
    @Override
    public String description() {
        return "Slaying the red dragon";
    }
}
