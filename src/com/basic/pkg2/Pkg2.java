package com.basic.pkg2;


import com.oops.basic.Employee;

public class Pkg2 extends Employee {//child of Employee


    public static void main(String[] args) {
        Employee emp1 = new Employee();//class obj

        Pkg2 emp2 = new Pkg2();// Inherite class obj

        emp2.count=9;// protected variable
        emp2.count2=2;// public variable



        emp1.count2=0;// public variable
        emp1.count=8;// no access for protected
    }
}
