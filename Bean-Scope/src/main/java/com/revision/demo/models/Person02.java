package com.revision.demo.models;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person02 {

    public Person02() {

        System.out.println("Person02's constructor!!!!!!");

    }

}
