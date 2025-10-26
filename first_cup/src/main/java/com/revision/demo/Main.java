package com.revision.demo;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //default
        System.out.println("default");
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("John Doe");
        emp.setAge(22);
        emp.setPosition("Developer");
        System.out.println(emp.showDetails());

        //using bean with  FileSystemXml
        System.out.println("using bean with FileSystemXml");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee emp1 = context.getBean(Employee.class);
        System.out.println(emp1.showDetails());

    }
}