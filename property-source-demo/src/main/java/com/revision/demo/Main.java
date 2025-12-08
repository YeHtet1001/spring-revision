package com.revision.demo;

import com.revision.demo.config.BeanConfig;
import com.revision.demo.models.Model1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Model1 model1 = context.getBean(Model1.class);

        System.out.println(model1);

        context.close();

    }

}