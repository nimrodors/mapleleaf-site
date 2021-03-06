/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import model.DBModel;
import model.Defense;
import model.DefensePlayer;
import model.Hiba;

/**
 *
 * @author Lenovo
 */
@WebServlet(name = "DefenseServlet", urlPatterns = {"/defense"})
public class DefenseServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        int defenseId = Integer.parseInt(request.getParameter("defenseid"));

        Context iniCtx;

        try {
            iniCtx = new InitialContext();
            Context envCtx = (Context) iniCtx.lookup("java:comp/env");
            DataSource ds = (DataSource) envCtx.lookup("jdbc/mapleleaf");
            Connection conn = ds.getConnection();
            
            DBModel model = new DBModel(conn);
            List<DefensePlayer> dfPlayer = model.getChooseDefense(defenseId);
            List<Defense> df = model.getAllDefense();
            
            conn.close();
            
            /*String name = dfPlayer.get(defenseId).getDefense().getFirstName() + " " 
                    + dfPlayer.get(defenseId).getDefense().getLastName();*/
            
            String name = df.get(defenseId-1).getFirstName() + " "
                    + df.get(defenseId-1).getLastName();
            
            /*String name = forward.get(forwardId-1).getFirstName() + " " 
                    + forward.get(forwardId-1).getLastName();*/
            
            request.setAttribute("name", name);
            request.setAttribute("df", dfPlayer);
            request.getRequestDispatcher("players/uzenet/defense.jsp").forward(request, response);

        } catch (NamingException | SQLException ex) {
            Hiba hiba = new Hiba(ex.getMessage());
            request.setAttribute("hiba", hiba);
            request.getRequestDispatcher("uzenet/hiba.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
