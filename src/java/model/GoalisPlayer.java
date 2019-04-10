/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lenovo
 */
public class GoalisPlayer {
    
    private int id;
    private Goalies goalie;
    private int goalieId;
    private String season;
    private String team;
    private String league;
    private int gp;
    private double gaa;
    private double sv;

    public GoalisPlayer() {
    }

    public GoalisPlayer(int id, Goalies goalie, int goalieId, String season, String team, String league, int gp, double gaa, double sv) {
        this.id = id;
        this.goalie = goalie;
        this.goalieId = goalieId;
        this.season = season;
        this.team = team;
        this.league = league;
        this.gp = gp;
        this.gaa = gaa;
        this.sv = sv;
    }

    public GoalisPlayer(int id, int goalieId, String season, String team, String league, int gp, double gaa, double sv) {
        this.id = id;
        this.goalieId = goalieId;
        this.season = season;
        this.team = team;
        this.league = league;
        this.gp = gp;
        this.gaa = gaa;
        this.sv = sv;
    }

    public GoalisPlayer(int id, Goalies goalie, String season, String team, String league, int gp, double gaa, double sv) {
        this.id = id;
        this.goalie = goalie;
        this.season = season;
        this.team = team;
        this.league = league;
        this.gp = gp;
        this.gaa = gaa;
        this.sv = sv;
    }

    public double getSv() {
        return sv;
    }

    public void setSv(double sv) {
        this.sv = sv;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Goalies getGoalie() {
        return goalie;
    }

    public void setGoalie(Goalies goalie) {
        this.goalie = goalie;
    }

    public int getGoalieId() {
        return goalieId;
    }

    public void setGoalieId(int goalieId) {
        this.goalieId = goalieId;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public int getGp() {
        return gp;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }

    public double getGaa() {
        return gaa;
    }

    public void setGaa(double gaa) {
        this.gaa = gaa;
    }
    
}
