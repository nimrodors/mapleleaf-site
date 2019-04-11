/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Lenovo
 */
public interface IModel {
    
    User authUser (String userName, String password) throws SQLException;
    User fillupUser (String knev, String vnev, String email, String pass);
    
    List<Forward> getAllForward () throws SQLException;
    List<Defense> getAllDefense () throws SQLException;
    List<Goalies> getAllGoalies () throws SQLException;
    List<ForwardPlayers> getPlayer(int id) throws SQLException;
    
    Map<Integer, Defense> getAllDefenseMap () throws SQLException;
    List<DefensePlayer> getChooseDefense (int defenseId) throws SQLException;
    
    Map<Integer, Goalies> getGoliesMap() throws SQLException;
    List<GoalisPlayer> getChooseGoalies (int goalieid) throws SQLException;
    
    void addUser (User user) throws SQLException;
    List<User> allUser () throws SQLException;
    
}
