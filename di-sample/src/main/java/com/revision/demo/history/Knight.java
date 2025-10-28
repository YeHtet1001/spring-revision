package com.revision.demo.history;

import com.revision.demo.questInterface.Quest;

public class Knight {

    private Quest quest;

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public Quest getQuest() {
        return quest;
    }

    public void goQuest(){

        quest.goQuest();

    }

}
