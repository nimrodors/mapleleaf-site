/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Lenovo
 */
public class ForwardSalary implements Serializable{

    private int id;
    private int forwardId;
    private int year;
    private int salary;
    private Forward forward;

    public ForwardSalary() {
    }

    public ForwardSalary(int id, int forwardId, int year, int salary, Forward forward) {
        this.id = id;
        this.forwardId = forwardId;
        this.year = year;
        this.salary = salary;
        this.forward = forward;
    }

    public ForwardSalary(int forwardId, int year, int salary, Forward forward) {
        this.forwardId = forwardId;
        this.year = year;
        this.salary = salary;
        this.forward = forward;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getForwardId() {
        return forwardId;
    }

    public void setForwardId(int forwardId) {
        this.forwardId = forwardId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Forward getForward() {
        return forward;
    }

    public void setForward(Forward forward) {
        this.forward = forward;
    }
}
