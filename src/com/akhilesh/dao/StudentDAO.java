/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.dao;

import com.akhilesh.entity.Student;
import java.util.List;

/**
 *
 * @author Akhilesh
 */
public interface StudentDAO {
    boolean insert(Student s);
    void delete(int id);
    List<Student> getAll();
    Student getById(int id);
    List<Student> searchByFirstName(String param);
    List<Student> searchByLastName(String param);
    List<Student> searchByStatus(boolean flag);
}
