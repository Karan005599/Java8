package com.Java8_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StdObj {
    public static void main(String[] args) {

        Student s1 = new Student(2, "Karan");
        Student s2 = new Student(6, "Rathore ");
        Student s3 = new Student(4, "Madhav");

        List<Student> s = new ArrayList<Student>();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        Collections.sort(s, (a, b) -> a.id - b.id);
        System.out.println(s);
    }

    static class Student {
        public Integer id;
        public String name;

        public Student(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return this.id + " : " + this.name;
        }

    }


}
