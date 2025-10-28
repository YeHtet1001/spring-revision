package com.revision.demo.config;

import com.revision.demo.entity.Address;
import com.revision.demo.entity.Person;
import com.revision.demo.enumGroup.Gender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.Period;

@Configuration
@ComponentScan(basePackages = "com.revision.demo.entity")//need to add java-config
public class AppConfig {
    //annotation config
//    @Bean
//    public Address address() {
//
//        Address address = new Address();
//        address.setStreet("love-street");
//        address.setCity("love-city");
//        address.setState("love-state");
//        return address;
//
//    }
//
//
//    @Bean
//    public Person person() {
//
//        Person person = new Person();
//        person.setName("John Smith");
//        person.setAge(22);
//        person.setGender(Gender.male);
//        person.setAddress(address());
//        return person;
//
//    }

}
