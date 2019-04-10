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
public class Hiba implements Serializable{
    
    private String hiba;

    public Hiba() {
    }

    public Hiba(String hiba) {
        this.hiba = hiba;
    }

    public String getHiba() {
        return hiba;
    }

    public void setHiba(String hiba) {
        this.hiba = hiba;
    }
    
    
}
