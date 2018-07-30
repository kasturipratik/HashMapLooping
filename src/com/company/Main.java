package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // hash map to put student list
        HashMap<Integer, String> st = new HashMap<>();

        //create new student
        Student student = new Student();
        student.setId(1);
        student.setName("Pratik");
        //adding into hashmap each time student is created
        st.put(student.getId(),student.getName());

        //create another new student
        student = new Student();
        student.setId(2);
        student.setName("Kabin");
        //adding into hashmap each time student is created
        st.put(student.getId(),student.getName());

        //setting the value of the hashmap to the toString method of Student class to print
        String print = student.toString(st);

        //printing all the list of students for the hashmap
        System.out.println(print);


    }
}
