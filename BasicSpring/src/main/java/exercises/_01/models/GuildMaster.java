package exercises._01.models;

import exercises._01.MagicLog;
import exercises._01.quests.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GuildMaster {
    private Quest quest;

    @Autowired
    public GuildMaster(@Qualifier("catQuest") Quest quest){
        this.quest = quest;
    }

    @MagicLog
    public void command(){
        System.out.println(quest.description());
    }
}
