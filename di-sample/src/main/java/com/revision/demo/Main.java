package com.revision.demo;

import com.revision.demo.config.AppConfig;
import com.revision.demo.history.Knight;
import com.revision.demo.history.RescuingThePrincessQuest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Knight knight = context.getBean(Knight.class);

        knight.goQuest();

    }

}