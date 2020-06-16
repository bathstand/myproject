package com.jframe;

public class Student {
    String name;
    String id;

    public Student(String id , String name){
            this.id = id;
            this.name = name;
    }

    public void report(){
        System.out.println(id + "/" +name);
    }
}
