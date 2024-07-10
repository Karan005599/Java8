package com.Java8_Practice;
// static methods are those methods which are used in the interface with static keyword
// static methods contains complete definition of the function
// cant be changed or overridden in the implementation class

interface A{
    public static  void message (){
        System.out.println(" hello Karan ");
    }
}
public class StMethod implements A {
    public static void main(String[] args) {

         A.message();  // only way to call the static method of the interface is to call by name .

    }
}
