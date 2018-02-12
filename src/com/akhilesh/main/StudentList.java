/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.main;

import com.akhilesh.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Akhilesh
 */
public class StudentList {
    public static void main(String[] args) {
        List<Student> stdList = new ArrayList<>();
        
        stdList.add(new Student(1, "Akhilesh", "Khapangee", true));
        stdList.add(new Student(2, "Bill", "Gates", true));
        
        for(Student student: stdList){
            System.out.println(student.getFirstName());
        }
    }
}
