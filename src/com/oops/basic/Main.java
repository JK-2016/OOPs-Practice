package com.oops.basic;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("hello");
        Employee emp1 = new Employee(1,"SS","IT");
        Employee emp2 = new Employee(2,"SS","IT");
        int numHere = Employee.getNum();
        Employee.setNum(55);// Static method - invoking without obj
        Employee.getNum();
        int pi = emp1.pi;
        System.out.println("numHere: "+numHere);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int numInput =sc.nextInt();
        String str = sc.nextLine();
        System.out.println("Number in Input: " + numInput);
        System.out.println(str);


       // emp1.setId(1);

        //Employee.method1();

        //System.out.println("emp1 id: " + emp1.getId());
        //emp1.setId(2);



    }
}
