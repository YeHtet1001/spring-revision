package com.revision.demo.annotations;

import org.springframework.stereotype.Component;


@ExpertType
@Component //("java")
public class JavaExperties implements IExperties{

    @Override
    public void display() {

        System.out.println("Java Experties");

    }

}
