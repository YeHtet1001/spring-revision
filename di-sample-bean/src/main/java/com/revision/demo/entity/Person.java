package com.revision.demo.entity;

import com.revision.demo.annotations.ExpertType;
import com.revision.demo.annotations.IExperties;
import com.revision.demo.enumGroup.Gender;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Setter
@Getter
@Component
public class Person {

    private String name;
    private int age;
    private Gender gender;
    @Autowired //Field injection is not recommended
    private Address address;

    @Autowired @ExpertType
    private IExperties iExperties;

    public Person() {

        System.out.println("Person constructor : " + address );

    }

    //Autowired not used in constructor!!!!!!!
    public  Person(String name , int age, Gender gender , Address address ) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;

    }

    @PostConstruct
    public void postConstruct(){

        System.out.println("Person post construct " + address );

    }


    //@Autowired
    public Person( Address address ) {

        System.out.println("Person constructor called " + address);
        this.address = address;

    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address=" + address +
                '}';
    }

    public void diplayIExperties() {

        iExperties.display();

    }

}
