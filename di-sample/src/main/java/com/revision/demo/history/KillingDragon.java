package com.revision.demo.history;

import com.revision.demo.annotation.Quest;
import com.revision.demo.questInterface.QuestType;
import org.springframework.stereotype.Component;

import static com.revision.demo.annotation.Quest.QuestType.Kill_Dragon;

@Quest(questType = Kill_Dragon)
@Component
public class KillingDragon implements QuestType {

    @Override
    public void goQuest() {

        System.out.println("Knight has killed dragon!");

    }

}
