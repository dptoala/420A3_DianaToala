package com.modelingClasses;

import java.util.ArrayList;
import java.util.List;

public class COurse {
    //Attributes
    String courseName;
    private List<Student> students;

    //Methods Get and Set
    public String GetCourseName(){
        return this.courseName;
    }

    public void SetCourseName(String courseName){
        this.courseName = courseName;
    }

    //Constructor
    public COurse(String courseName){
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void AddStudent(Student student) {
        students.add(student);
    }


}



