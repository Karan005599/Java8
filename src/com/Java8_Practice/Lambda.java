package com.Java8_Practice;
// lambda expression is an anonymous function which don't have any name , modifier   and return type amd we can use it with the help of functional interface
//  : the interface which having only one abstract method by have one or more default or static method
// Using lambda expression we don't need to use separate implementation
public class Lambda {
    public static void main(String[] args) {

        Employee d = () -> " Suraj is a Software Engineer";
        System.out.println(d.getName());


        // () -> System.out.println("Say hello"); Lambda Expression

    }    }


