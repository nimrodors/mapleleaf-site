/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Goalies implements Serializable{

    private int id;
    private String firstName;
    private String lastName;
    private int Number;
    private double Ht;
    private int Wt;
    private Date Born;
    private String birthPlace;
    private int draftedYear;
    private String draftedBy;

    public Goalies() {
    }

    public Goalies(int id, String firstName, String lastName, int Number, double Ht, int Wt, Date Born, String birthPlace, int draftedYear, String draftedBy) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Number = Number;
        this.Ht = Ht;
        this.Wt = Wt;
        this.Born = Born;
        this.birthPlace = birthPlace;
        this.draftedYear = draftedYear;
        this.draftedBy = draftedBy;
    }

    public Goalies(String firstName, String lastName, int Number, double Ht, int Wt, Date Born, String birthPlace, int draftedYear, String draftedBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Number = Number;
        this.Ht = Ht;
        this.Wt = Wt;
        this.Born = Born;
        this.birthPlace = birthPlace;
        this.draftedYear = draftedYear;
        this.draftedBy = draftedBy;
    }
     
    public Goalies(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public double getHt() {
        return Ht;
    }

    public void setHt(double Ht) {
        this.Ht = Ht;
    }

    public int getWt() {
        return Wt;
    }

    public void setWt(int Wt) {
        this.Wt = Wt;
    }

    public Date getBorn() {
        return Born;
    }

    public void setBorn(Date Born) {
        this.Born = Born;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public int getDraftedYear() {
        return draftedYear;
    }

    public void setDraftedYear(int draftedYear) {
        this.draftedYear = draftedYear;
    }

    public String getDraftedBy() {
        return draftedBy;
    }

    public void setDraftedBy(String draftedBy) {
        this.draftedBy = draftedBy;
    }
}
