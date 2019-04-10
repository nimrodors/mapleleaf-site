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
public class DefensePlayer implements Serializable{
    
    private int id;
    private int defenseId;
    private String Season;
    private String Team;
    private String League;
    private int gp;
    private int g;
    private int a;
    private int p;
    private int plusMinus;
    private int pim;
    private Defense defense;

    public DefensePlayer() {
    }

    public DefensePlayer(int id, int defenseId, String Season, String Team, String League, int gp, int g, int a, int p, int plusMinus, int pim, Defense defense) {
        this.id = id;
        this.defenseId = defenseId;
        this.Season = Season;
        this.Team = Team;
        this.League = League;
        this.gp = gp;
        this.g = g;
        this.a = a;
        this.p = p;
        this.plusMinus = plusMinus;
        this.pim = pim;
        this.defense = defense;
    }

    public DefensePlayer(int defenseId, String Season, String Team, String League, int gp, int g, int a, int p, int plusMinus, int pim, Defense defense) {
        this.defenseId = defenseId;
        this.Season = Season;
        this.Team = Team;
        this.League = League;
        this.gp = gp;
        this.g = g;
        this.a = a;
        this.p = p;
        this.plusMinus = plusMinus;
        this.pim = pim;
        this.defense = defense;
    }

    public DefensePlayer(String Season, String Team, String League, int gp, int g, int a, int p, int plusMinus, int pim, Defense defense) {
        this.Season = Season;
        this.Team = Team;
        this.League = League;
        this.gp = gp;
        this.g = g;
        this.a = a;
        this.p = p;
        this.plusMinus = plusMinus;
        this.pim = pim;
        this.defense = defense;
    }

    public DefensePlayer(Defense defense) {
        this.defense = defense;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDefenseId() {
        return defenseId;
    }

    public void setDefenseId(int defenseId) {
        this.defenseId = defenseId;
    }

    public String getSeason() {
        return Season;
    }

    public void setSeason(String Season) {
        this.Season = Season;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String Team) {
        this.Team = Team;
    }

    public String getLeague() {
        return League;
    }

    public void setLeague(String League) {
        this.League = League;
    }

    public int getGp() {
        return gp;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getPlusMinus() {
        return plusMinus;
    }

    public void setPlusMinus(int plusMinus) {
        this.plusMinus = plusMinus;
    }

    public int getPim() {
        return pim;
    }

    public void setPim(int pim) {
        this.pim = pim;
    }

    public Defense getDefense() {
        return defense;
    }

    public void setDefense(Defense defense) {
        this.defense = defense;
    }
    
}
