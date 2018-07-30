package com.company;

import java.util.HashMap;
import java.util.Map;

public class Student {


    String name;
    int id;

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

    public String toString(HashMap<Integer,String > student){
        String listOfStudent="";
        /*looping through hashmap to print both  */
        for(Map.Entry<Integer,String> l :student.entrySet()){
            //concatenating string from the hashmap to return list of students with id and name
            listOfStudent = listOfStudent + "\n" +l.getKey() + " " + l.getValue();
        }
        return  listOfStudent;
    }
}
