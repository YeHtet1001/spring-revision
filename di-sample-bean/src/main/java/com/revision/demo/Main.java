package com.revision.demo;

import com.revision.demo.config.AppConfig;
import com.revision.demo.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        //xml config
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//        Person person = (Person) context.getBean("person");
//
//        System.out.println(person);

        //annotation config
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Person person = context.getBean(Person.class);
//        System.out.println(person);

        //java config
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);

    }

}