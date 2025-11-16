package com.revision.demo.models;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component //@Lazy(false)
public class Person03 {

    public Person03() {

        System.out.println("Person03's constructor!!!!!!!");

    }
}
