package com.revision.demo;

import com.revision.demo.no_aop.action.ComplexAction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        ComplexAction action = context.getBean(ComplexAction.class);

        action.doAction();

        context.close();

    }
}