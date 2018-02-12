/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.main;

import com.akhilesh.controller.StudentController;
import com.akhilesh.dao.StudentDAO;
import com.akhilesh.dao.impl.StudentDAOImpl;

/**
 *
 * @author Akhilesh
 */
public class StudentDAOClient {
    
    /**
     * MVC pattern
     * @param args 
     */
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImpl();
        StudentController sc = new StudentController(studentDAO);
        while (true) {
            sc.process();
        }
    }
}
