package com.revision.demo.entity;

import com.revision.demo.enumGroup.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;
    private int age;
    private Gender gender;
    //@Autowired //Field injection is not recommended
    private Address address;

    public Person() {}

    //Autowired not used in constructor!!!!!!!
    public Person( String name , int age, Gender gender , Address address ) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public Gender getGender() {

        return gender;

    }

    public void setGender(Gender gender) {

        this.gender = gender;

    }

    public Address getAddress() {

        return address;

    }

    @Autowired
    public void setAddress(Address address) {

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

}
