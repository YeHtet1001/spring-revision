package com.revision.demo;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setId(1);
        emp.setName("John Doe");
        emp.setAge(22);
        emp.setPosition("Developer");

        System.out.println(emp.toString());

        System.out.println(emp.showDetails());

    }
}