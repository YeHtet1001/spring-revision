package com.revision.demo.history;

import com.revision.demo.annotation.Quest;
import com.revision.demo.questInterface.QuestType;
import org.springframework.stereotype.Component;

@Quest()
@Component
public class RescuingThePrincessQuest implements QuestType {

    @Override
    public void goQuest(){

        System.out.println("Knight is going to rescue the princess.");

    }

}
