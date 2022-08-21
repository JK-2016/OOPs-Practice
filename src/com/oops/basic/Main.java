package com.oops.basic;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        Employee emp1 = new Employee(1,"SS","IT");
       // emp1.setId(1);

        System.out.println("emp1 id: " + emp1.getId());
        emp1.setId(2);



    }
}
