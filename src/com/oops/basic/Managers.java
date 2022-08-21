package com.oops.basic;

public class Managers {
    public void manager(){
        System.out.println("this is manager");

    }
    private void privateManager(){
        Employee employee = new Employee();
        employee.count=5;
        System.out.println("this is private manager");
    }


}
