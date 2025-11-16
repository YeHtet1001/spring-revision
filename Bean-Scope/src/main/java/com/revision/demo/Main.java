package com.revision.demo;

import com.revision.demo.config.AppConfig;
import com.revision.demo.models.Person01;
import com.revision.demo.models.Person02;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.registerShutdownHook();

//        Person01 person01_0 = context.getBean(Person01.class);
//        Person01 person01_1 = context.getBean(Person01.class);
//        Person01 person01_2 = context.getBean(Person01.class);
//        System.out.println(person01_0);
//        System.out.println(person01_1);
//        System.out.println(person01_2);
//
//        Person02 person02_0 = context.getBean(Person02.class);
//        Person02 person02_1 = context.getBean(Person02.class);
//        Person02 person02_2 = context.getBean(Person02.class);
//        System.out.println(person02_0);
//        System.out.println(person02_1);
//        System.out.println(person02_2);

        context.close();

    }

}