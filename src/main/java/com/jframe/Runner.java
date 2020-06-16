package com.jframe;

public class Runner {
    public static void main(String[] args) {
        Student cindy = new Student("123456789","Cindy");
        Student mandy = new Student("765433342","Mandy");
        Student sandy = new Student("654322467","Sandy");
        Teacher teacher = new Teacher();
        teacher.addStudents(cindy);
        teacher.addStudents(mandy);
        teacher.addStudents(sandy);
        teacher.reportAll();
    }
}
