/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Lenovo
 */
public class DBModel implements IModel {

    private Connection conn;
    private PreparedStatement authUser;
    private PreparedStatement getAllForwards;
    private PreparedStatement getAllDefense;
    private PreparedStatement getAllGoalies;
    private PreparedStatement getPlayer;
    private PreparedStatement getChooseDefense;
    private PreparedStatement getChooseGoalie;
    private PreparedStatement addUser;
    private PreparedStatement getAllUser;

    public DBModel(Connection conn) throws SQLException {
        this.conn = conn;

        authUser = conn.prepareStatement("SELECT * FROM user WHERE username=? AND password=?");
        getAllForwards = conn.prepareStatement("SELECT * FROM forwards");
        getAllDefense = conn.prepareStatement("SELECT * FROM defense");
        getAllGoalies = conn.prepareStatement("SELECT * FROM goalies");
        getPlayer = conn.prepareStatement("SELECT * FROM forward_players WHERE forward_id = ?");
        getChooseDefense = conn.prepareStatement("SELECT * FROM defense_player WHERE defense_id = ?");
        getChooseGoalie = conn.prepareStatement("SELECT * FROM goalies_player WHERE goalieid = ?");
        addUser = conn.prepareStatement("INSERT INTO user(id, first_name, last_name, email, password, permission) VALUES (?, ?, ?, ?, ?, ?)");
        getAllUser = conn.prepareStatement("SELECT * FROM user");
    }

    public void close() throws SQLException {
        conn.close();
    }

    private PreparedStatement allForwards;

    @Override
    public List<Forward> getAllForward() throws SQLException {
        List<Forward> forwards = new ArrayList<>();

        ResultSet rs = getAllForwards.executeQuery();

        while (rs.next()) {
            Forward forward = new Forward(
                    rs.getInt("id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getInt("Number"),
                    rs.getString("Position"),
                    rs.getString("Sh"),
                    rs.getString("Ht"),
                    rs.getInt("Wt"),
                    rs.getDate("Born"),
                    rs.getString("BirthPlace"),
                    rs.getInt("DraftedYear"),
                    rs.getString("DraftedBy")
            );
            forwards.add(forward);
        }
        rs.close();
        return forwards;
    }

    @Override
    public List<Defense> getAllDefense() throws SQLException {
        List<Defense> defenses = new ArrayList<>();

        ResultSet rs = getAllDefense.executeQuery();

        while (rs.next()) {
            Defense defense = new Defense(
                    rs.getInt("id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getInt("Number"),
                    rs.getString("Sh"),
                    rs.getString("Ht"),
                    rs.getInt("Wt"),
                    rs.getDate("Born"),
                    rs.getString("BirthPlace"),
                    rs.getInt("DraftedYear"),
                    rs.getString("DraftedBy")
            );
            defenses.add(defense);
        }
        rs.close();
        return defenses;
    }

    @Override
    public List<Goalies> getAllGoalies() throws SQLException {
        List<Goalies> goalies = new ArrayList<>();

        ResultSet rs = getAllGoalies.executeQuery();

        while (rs.next()) {
            Goalies goalie = new Goalies(
                    rs.getInt("id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getInt("Number"),
                    rs.getDouble("Ht"),
                    rs.getInt("Wt"),
                    rs.getDate("Born"),
                    rs.getString("BirthPlace"),
                     rs.getInt("DraftedYear"),
                    rs.getString("DraftedBy")
            );
            goalies.add(goalie);
        }
        rs.close();
        return goalies;
    }

    @Override
    public List<ForwardPlayers> getPlayer(int id) throws SQLException {
        List<ForwardPlayers> fPlayer = new ArrayList<>();
        getPlayer.setInt(1, id);
        ResultSet rs = getPlayer.executeQuery();
        
        ForwardPlayers fp = null;
        
        while(rs.next()){
            fp = new ForwardPlayers(
                    rs.getInt("id"),
                    rs.getInt("forward_id"),
                    rs.getString("Season"), 
                    rs.getString("Team"), 
                    rs.getString("League"), 
                    rs.getInt("GP"), 
                    rs.getInt("G"), 
                    rs.getInt("A"), 
                    rs.getInt("P"), 
                    rs.getInt("+/-"), 
                    rs.getInt("PIM")
            );
            fPlayer.add(fp);
        }
        rs.close();
        return fPlayer;
    }

    @Override
    public Map<Integer, Defense> getAllDefenseMap() throws SQLException {
        Map<Integer, Defense> defenseMap = new HashMap<>();
        ResultSet rs = getAllDefense.executeQuery();
        
         while (rs.next()) {
            Defense defense = new Defense(
                    rs.getInt("id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getInt("Number"),
                    rs.getString("Sh"),
                    rs.getString("Ht"),
                    rs.getInt("Wt"),
                    rs.getDate("Born"),
                    rs.getString("BirthPlace"),
                    rs.getInt("DraftedYear"),
                    rs.getString("DraftedBy")
            );
            defenseMap.put(defense.getId(), defense);
        }
         rs.close();
         return defenseMap;
    }

    @Override
    public List<DefensePlayer> getChooseDefense(int defenseId) throws SQLException {
        getChooseDefense.setInt(1, defenseId);
        ResultSet rs = getChooseDefense.executeQuery();
        
        List<DefensePlayer> dplayer = new ArrayList<>();
        Map<Integer, Defense> defenseMap = getAllDefenseMap();
        DefensePlayer defensePlayer;
        
        while (rs.next()) {
            int id = rs.getInt("id");
            Defense df = defenseMap.get(rs.getInt("defense_id"));
            String season = rs.getString("season");
            String team = rs.getString("team");
            String league = rs.getString("league");
            int gp = rs.getInt("gp");
            int g = rs.getInt("g");
            int a = rs.getInt("a");
            int p = rs.getInt("p");
            int plusminus = rs.getInt("+/-");
            int pim = rs.getInt("pim");
            
            
            defensePlayer = new DefensePlayer(id, defenseId, season, team, league, gp, g, a, p, plusminus, pim, df);
            dplayer.add(defensePlayer);
        }
        rs.close();
        return dplayer;
    }

    @Override
    public Map<Integer, Goalies> getGoliesMap() throws SQLException {
        Map<Integer, Goalies> goaliesMap = new HashMap<>();
        ResultSet rs = getAllGoalies.executeQuery();
        
        while(rs.next()){
            Goalies gl = new Goalies(
                    rs.getInt("id"), 
                    rs.getString("first_name"), 
                    rs.getString("last_name"), 
                    rs.getInt("Number"), 
                    rs.getDouble("Ht"), 
                    rs.getInt("Wt"), 
                    rs.getDate("Born"), 
                    rs.getString("BirthPlace"), 
                    rs.getInt("DraftedYear"), 
                    rs.getString("DraftedBy")
            );
            goaliesMap.put(gl.getId(), gl);
        }
        rs.close();
        return goaliesMap;
    }

    @Override
    public List<GoalisPlayer> getChooseGoalies(int goalieid) throws SQLException {
        getChooseGoalie.setInt(1, goalieid);
        ResultSet rs = getChooseGoalie.executeQuery();
        
        List<GoalisPlayer> goalie = new ArrayList<>();
        Map<Integer, Goalies> goalieMap = getGoliesMap();
        
        GoalisPlayer goaliesPlayer;
        
        while(rs.next()){
            int id = rs.getInt("id");
            Goalies gs = goalieMap.get(rs.getInt("goalieid"));
            String season = rs.getString("season");
            String team = rs.getString("team");
            String league = rs.getString("league");
            int gp = rs.getInt("gp");
            double gaa = rs.getDouble("gaa");
            double sv = rs.getDouble("sv%");
         
            goaliesPlayer = new GoalisPlayer(id, gs, goalieid, season, team, league, gp, gaa, sv);
            goalie.add(goaliesPlayer);
        }
        rs.close();
        return goalie;
    }

    @Override
    public void addUser(User user) throws SQLException {
        addUser.setInt(1, user.getId());
        addUser.setString(2, user.getFirst_name());
        addUser.setString(3, user.getLast_name());
        addUser.setString(5, user.getEmail());
        addUser.setString(6, user.getPassword());
        addUser.setInt(7, user.getPermission());
        
        addUser.executeUpdate();
    }

    @Override
    public List<User> allUser() throws SQLException {
        List<User> users = new ArrayList<>();
        
        ResultSet rs = getAllUser.executeQuery();
        User user = null;
        
        while(rs.next()) {
            user = new User(
                    rs.getInt("id"), 
                    rs.getString("first_name"), 
                    rs.getString("last_name"), 
                    rs.getString("email"), 
                    rs.getString("password"), 
                    rs.getInt("permission"));
            users.add(user);
        }
        return users;
    }

}
