package com.Java8_Practice;

import com.sun.jdi.PathSearchingVirtualMachine;

interface  Parent {
    default  void myMessage (){
        System.out.println("Sabas Beta ");
    }
}
class  Child implements  Parent{
    @Override
    public void myMessage() {
        System.out.println("Beta Bhi kam nai hai !!!");
    }
}
public class InheritIMP {
    public static void main(String[] args) {
        Child c = new Child();
        c.myMessage();
    }
}
