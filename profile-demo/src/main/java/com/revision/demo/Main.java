package com.revision.demo;


import com.revision.demo.action.ComplexAction;
import com.revision.demo.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.registerShutdownHook();
//        context.register(AppConfig.class);
//        context.getEnvironment().setActiveProfiles("file");
//        context.refresh();
        ComplexAction action = context.getBean(ComplexAction.class);
        action.createAction();
        context.close();


    }
}