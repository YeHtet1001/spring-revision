package com.revision.demo;

import com.revision.demo.beans.SpringBean1;
import com.revision.demo.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.registerShutdownHook();


        SpringBean1 bean = context.getBean(SpringBean1.class);
        bean.sayHello();

        context.close();

    }
}