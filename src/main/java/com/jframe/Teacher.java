package com.jframe;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    String name;
    List<Student> students = new ArrayList<>();

    public void addStudents(Student stu) {
        students.add(stu);
    }

    public void reportAll() {
        for (Student stu : students) {
            stu.report();
        }
    }

}
