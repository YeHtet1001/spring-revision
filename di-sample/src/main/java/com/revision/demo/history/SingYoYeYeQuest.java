package com.revision.demo.history;

import com.revision.demo.annotation.Quest;
import com.revision.demo.questInterface.QuestType;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

import static com.revision.demo.annotation.Quest.QuestType.Sing;

@Quest( questType = Sing)
@Component
public class SingYoYeYeQuest implements QuestType {


    @Override
    public void goQuest() {

        System.out.println("Knight is singing YoYeYe ...........");

    }
}
