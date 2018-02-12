/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.entity;

/**
 *
 * @author Akhilesh
 */
public class Student {

    private int id;
    private String firstName, lastName;
    private boolean status;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", status=" + status + '}';
    }

}
