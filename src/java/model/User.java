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
public class User implements Serializable{
    
    
    private int id;
    private String First_name;
    private String Last_name;
    private String Email;
    private String Password;
    private int Permission;

    public User() {
    }

    public User(int id, String First_name, String Last_name, String Email, String Password, int Permission) {
        this.id = id;
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.Email = Email;
        this.Password = Password;
        this.Permission = Permission;
    }

    public User(String First_name, String Last_name, String Email, String Password, int Permission) {
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.Email = Email;
        this.Password = Password;
        this.Permission = Permission;
    }

    public User(String First_name, String Last_name, String Email) {
        this.First_name = First_name;
        this.Last_name = Last_name;
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return First_name;
    }

    public void setFirst_name(String First_name) {
        this.First_name = First_name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String Last_name) {
        this.Last_name = Last_name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getPermission() {
        return Permission;
    }

    public void setPermission(int Permission) {
        this.Permission = Permission;
    }
    
    
}
