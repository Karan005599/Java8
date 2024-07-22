package com.Java8_Practice;

import java.util.*;

public class TreeSett {
    public static void main(String[] args) {

        Set <Integer> s = new TreeSet <>();
         s.add(25);
         s.add(32);
         s.add(85);
         s.add(11);
        System.out.println("Before manual sorting " + s );
        Set < Integer > k = new TreeSet<>((a,b) -> b-a);
        k.add(58);
        k.add(68);
        k.add(25);
        k.add(2);
        k.add(45);
        System.out.println(k );
    }
}
