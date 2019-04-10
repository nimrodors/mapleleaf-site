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
public class ForwardPlayers implements Serializable{
    
    private int id;
    private int forwardId;
    private String Season;
    private String Team;
    private String League;
    private int gp;
    private int g;
    private int a;
    private int p;
    private int plusMinus;
    private int pim;
    private Forward forward;

    public ForwardPlayers() {
    }

    public ForwardPlayers(int id, int forwardId, String Season, String Team, String League, int gp, int g, int a, int p, int plusMinus, int pim, Forward forward) {
        this.id = id;
        this.forwardId = forwardId;
        this.Season = Season;
        this.Team = Team;
        this.League = League;
        this.gp = gp;
        this.g = g;
        this.a = a;
        this.p = p;
        this.plusMinus = plusMinus;
        this.pim = pim;
        this.forward = forward;
    }

    public ForwardPlayers(int forwardId, String Season, String Team, String League, int gp, int g, int a, int p, int plusMinus, int pim, Forward forward) {
        this.forwardId = forwardId;
        this.Season = Season;
        this.Team = Team;
        this.League = League;
        this.gp = gp;
        this.g = g;
        this.a = a;
        this.p = p;
        this.plusMinus = plusMinus;
        this.pim = pim;
        this.forward = forward;
    }

    public ForwardPlayers(int id, int forwardId, String Season, String Team, String League, int gp, int g, int a, int p, int plusMinus, int pim) {
        this.id = id;
        this.forwardId = forwardId;
        this.Season = Season;
        this.Team = Team;
        this.League = League;
        this.gp = gp;
        this.g = g;
        this.a = a;
        this.p = p;
        this.plusMinus = plusMinus;
        this.pim = pim;
    }

    public ForwardPlayers(String Season, String Team, String League, int gp, int g, int a, int p, int plusMinus, int pim) {
        this.Season = Season;
        this.Team = Team;
        this.League = League;
        this.gp = gp;
        this.g = g;
        this.a = a;
        this.p = p;
        this.plusMinus = plusMinus;
        this.pim = pim;
    }
    

    public int getPim() {
        return pim;
    }

    public void setPim(int pim) {
        this.pim = pim;
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

    public Forward getForward() {
        return forward;
    }

    public void setForward(Forward forward) {
        this.forward = forward;
    }
    
}
