package com.oops.basic;

public class Employee {
    private int id;
    private String name;
    private String dept;
    protected int count;
    public int count2;

    public Employee(){

    }
    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
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



