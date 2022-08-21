package com.oops.basic;

public class Employee {
    public static int num=0;
    final int pi = 3;
    private int id;
    private String name;
    private String dept;
    protected int count;
    public int count2;
    public static void method1(){
        System.out.println("I am static");
    }
    public void inheritedMethod(){
        System.out.println("Inside Employee Class ");
    }


    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Employee.num = num;
    }

    public Employee(){

    }
    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        System.out.println("Inside Constructor");
    }
    static{
        System.out.println("inside static block");
    }
    {
        System.out.println("Inside Normal Block");
    }



    // AccessM ReturnType MethodName()
    public int getId() {
        return id;
    }

   public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


}



