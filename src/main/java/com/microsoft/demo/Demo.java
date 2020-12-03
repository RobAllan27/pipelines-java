package com.microsoft.demo;

public class Demo {
    public void doSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            return;
        }
        System.out.println("I am not covered");
    }
    
    public boolean doSomethingElse(boolean flag){
        if(flag){
            System.out.println("I am covered in the something else");
            return true;
        }
        System.out.println("I am not covered ine the something else");
        return false;
    }
}