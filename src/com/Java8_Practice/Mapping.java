package com.Java8_Practice;

import java.util.Map;
import java.util.TreeMap;

public class Mapping {
    public static void main(String[] args) {

        Map< Integer, String > j = new TreeMap<>();
        j.put(1,"Karan ");
        j.put(6, "Manju ");
        j.put(3, " Priyanka");
        j.put( 2 , "Ipsita");
        System.out.println(j);

        Map < Integer, String > l = new TreeMap<>((a,b) ->b-a);
        l.put(5, " Madhu ");
        l.put(1, " Manasa ");
        l.put(3 , " Mithun ");
        l.put(2, " Shrusti");
        System.out.println(l);
    }
}
