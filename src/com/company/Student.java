package com.company;

import java.util.HashMap;
import java.util.Map;

public class Student {

    /*declare variable student name and their id*/
    String name;
    int id;

    /*getter and setter for the student*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*method to concatenate all the student into a string and return it*/
    public String toString(HashMap<Integer,String > student){

        /*declaring empty string*/
        String listOfStudent="";

        /*looping through hashmap to print both  */
        for(Map.Entry<Integer,String> l :student.entrySet()){

            //concatenating string from the hashmap to return list of students with id and name
            listOfStudent = listOfStudent + "\n" +l.getKey() + " " + l.getValue();
            /*previous name and id of sudent*/ /*getting the key and value of the hashmap*/
        }

        /*returning the string of all the student list*/
        return  listOfStudent;
    }
}
