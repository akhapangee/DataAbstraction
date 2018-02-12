/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.dao.impl;

import com.akhilesh.dao.StudentDAO;
import com.akhilesh.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Akhilesh
 */
public class StudentDAOImpl implements StudentDAO {

    private List<Student> stdList = new ArrayList<>();

    @Override
    public boolean insert(Student s) {
        return stdList.add(s);
    }

    @Override
    public void delete(int id) {
        Student student = getById(id);
        if (student != null) {
            stdList.remove(student);
        }
    }

    @Override
    public List<Student> getAll() {
        return stdList;
    }

    @Override
    public Student getById(int id) {
        for (Student student : stdList) {
            if (id == student.getId()) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> searchByFirstName(String param) {
        List<Student> students = new ArrayList<>();
        for (Student s : stdList) {
            if (s.getFirstName().startsWith(param)) {
                students.add(s);
            }
        }
        return students;
    }

    @Override
    public List<Student> searchByLastName(String param) {
        List<Student> students = new ArrayList<>();
        for (Student s : stdList) {
            if (s.getLastName().startsWith(param)) {
                students.add(s);
            }
        }
        return students;
    }

    @Override
    public List<Student> searchByStatus(boolean flag) {
        List<Student> students = new ArrayList<>();
        for (Student s : stdList) {
            if (s.isStatus() == flag) {
                students.add(s);
            }
        }
        return students;
    }

}
