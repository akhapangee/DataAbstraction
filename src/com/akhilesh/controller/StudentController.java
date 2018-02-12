/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.controller;

import com.akhilesh.dao.StudentDAO;
import com.akhilesh.entity.Student;
import javax.swing.JOptionPane;

/**
 *
 * @author Akhilesh
 */
public class StudentController {

    private StudentDAO studentDAO;
    private StringBuilder displayContent = new StringBuilder();

    public void process() {
        int ch = getMenuChoice();
        switch (ch) {
            case 1:
                addStudents();
                break;
            case 2:
                showStudents();
                break;
            case 3:
                deleteStudent();
                break;
            case 4:
                searchByFirstName();
                break;
            case 5:
                searchByLastName();
                break;
            case 6:
                searchByStatus();
                break;
            case 7:
                System.exit(0);
            default:
                break;
        }

    }

    public StudentController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    private int getMenuChoice() {
        int ch = -1;
        try {
            ch = Integer.parseInt(JOptionPane.showInputDialog("Enter you choice\n"
                    + "1. Add student\n"
                    + "2. View all students\n"
                    + "3. Delete student\n"
                    + "4. Search by first name\n"
                    + "5. Search by last name\n"
                    + "6. Search by status\n"
                    + "7. Exit"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid choice!","Error", JOptionPane.ERROR_MESSAGE);
        }
        return ch;
    }

    private void addStudents() {
        Student student = new Student();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter id."));
        String firstName = JOptionPane.showInputDialog("Enter first name");
        String lastName = JOptionPane.showInputDialog("Enter last name");
        int status = Integer.parseInt(JOptionPane.showInputDialog("Enter status 1. true 2. false"));

        student.setId(id);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setStatus(status == 1);
        studentDAO.insert(student);
        JOptionPane.showMessageDialog(null, "Student inserted successfully!");
    }

    private void showStudents() {
        for (Student s : studentDAO.getAll()) {
            displayContent.append(s.getId() + ", " + s.getFirstName() + " " + s.getLastName() + ", " + s.isStatus()).append("\r\n");
        }
        JOptionPane.showMessageDialog(null, displayContent.toString());
        displayContent.setLength(0);
    }

    private void deleteStudent() {
        int stdId = Integer.parseInt(JOptionPane.showInputDialog("Enter id to delete"));
        studentDAO.delete(stdId);
        JOptionPane.showMessageDialog(null, "Student deleted successfully!");
    }

    private void searchByFirstName() {
        String lName = JOptionPane.showInputDialog("Enter first name starts with");
        for (Student s : studentDAO.searchByFirstName(lName)) {
            displayContent.append(s.getId() + ", " + s.getFirstName() + " " + s.getLastName() + ", " + s.isStatus()).append("\r\n");
        }
        JOptionPane.showMessageDialog(null, displayContent.toString());
        displayContent.setLength(0);
    }

    private void searchByLastName() {
        String lName = JOptionPane.showInputDialog("Enter first name starts with");
        for (Student s : studentDAO.searchByLastName(lName)) {
            displayContent.append(s.getId() + ", " + s.getFirstName() + " " + s.getLastName() + ", " + s.isStatus()).append("\r\n");
        }
        JOptionPane.showMessageDialog(null, displayContent.toString());
        displayContent.setLength(0);
    }

    private void searchByStatus() {
        int numStatus = Integer.parseInt(JOptionPane.showInputDialog("Enter status 1. true 2. false"));
        for (Student s : studentDAO.searchByStatus(numStatus == 1)) {
            displayContent.append(s.getId() + ", " + s.getFirstName() + " " + s.getLastName() + ", " + s.isStatus()).append("\r\n");
        }
        JOptionPane.showMessageDialog(null, displayContent.toString());
    }

}
