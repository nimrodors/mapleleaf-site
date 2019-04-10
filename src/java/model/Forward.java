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
public class Forward implements Serializable{
    
    private int id;
    private String  firstName;
    private String  lastName;
    private int Number;
    private String Position;
    private String Sh;
    private String Ht;
    private int Wt;
    private Date Born;
    private String birthPlace;
    private int draftYear;
    private String draftedBy;

    public Forward() {
    }

    public Forward(int id, String firstName, String lastName, int Number, String Position, String Sh, String Ht, int Wt, Date Born, String birthPlace, int draftYear, String draftedBy) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Number = Number;
        this.Position = Position;
        this.Sh = Sh;
        this.Ht = Ht;
        this.Wt = Wt;
        this.Born = Born;
        this.birthPlace = birthPlace;
        this.draftYear = draftYear;
        this.draftedBy = draftedBy;
    }
    
    public Forward(String firstName, String lastName, int Number, String Position, String Sh, String Ht, int Wt, Date Born, String birthPlace, int draftYear, String draftedBy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Number = Number;
        this.Position = Position;
        this.Sh = Sh;
        this.Ht = Ht;
        this.Wt = Wt;
        this.Born = Born;
        this.birthPlace = birthPlace;
        this.draftYear = draftYear;
        this.draftedBy = draftedBy;
    }

    public Forward(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getSh() {
        return Sh;
    }

    public void setSh(String Sh) {
        this.Sh = Sh;
    }

    public String getHt() {
        return Ht;
    }

    public void setHt(String Ht) {
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

    public int getDraftYear() {
        return draftYear;
    }

    public void setDraftYear(int draftYear) {
        this.draftYear = draftYear;
    }

    public String getDraftedBy() {
        return draftedBy;
    }

    public void setDraftedBy(String draftedBy) {
        this.draftedBy = draftedBy;
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
    
}
