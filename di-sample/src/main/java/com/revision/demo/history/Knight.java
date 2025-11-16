package com.revision.demo.history;

import com.revision.demo.annotation.Quest;
import com.revision.demo.questInterface.QuestType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import static com.revision.demo.annotation.Quest.QuestType.*;

@Component
@Getter
@Setter
public class Knight {


    @Autowired
    @Quest(questType = Sing)
    private QuestType quest;

    public void goQuest() {

        quest.goQuest();

    }

}
