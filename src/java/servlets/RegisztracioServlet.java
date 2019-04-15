/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import model.DBModel;
import model.Hiba;
import model.User;

/**
 *
 * @author Lenovo
 */
@WebServlet(name = "regisztracioServlet", urlPatterns = {"/regisztracio"})
public class RegisztracioServlet extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        String uname = (String) session.getAttribute("userName");
        User new_User = null;
        

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            Connection conn = null;
            Context iniCtx;

            try {
                iniCtx = new InitialContext();
                Context envCtx = (Context) iniCtx.lookup("java:comp/env");
                DataSource ds = (DataSource) envCtx.lookup("jdbc/mapleleaf");
                conn = ds.getConnection();

                DBModel model = new DBModel(conn);
                

                HashMap user = new HashMap();

                Enumeration<String> name = request.getParameterNames();

                while (name.hasMoreElements()) {
                    String key = name.nextElement();
                    String value = request.getParameter(key);
                    user.put(key, value);
                }

                String jelszo = (String) user.get("jelszo");
                String jelszo_ellenorzes = (String) user.get("jelszo_ellenorzes");

                if (jelszo.equals(jelszo_ellenorzes)) {

                    String knev = (String) user.get("keresztnev");
                    String vnev = (String) user.get("vezeteknev");
                    String email = (String) user.get("email");
                    String pass = (String) user.get("jelszo");

                    model.addUser(new User(knev, vnev, email, pass, 0));
                    model.fillupUser(knev, vnev, email, pass);

                    List<User> alluser = model.allUser();
                    session.setAttribute("alluser", alluser);

                    request.getRequestDispatcher("uzenet/successful_registration.jsp").forward(request, response);

                } else {
                    out.println("A jelszo nem egyezik");
                }

            } catch (SQLException | NamingException | NullPointerException ex) {
                Hiba hiba = new Hiba(ex.getMessage());
                request.setAttribute("hiba", hiba);
                request.getRequestDispatcher("uzenet/hiba.jsp").forward(request, response);
            } finally {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Hiba hiba = new Hiba(ex.getMessage());
                    request.setAttribute("hiba", hiba);
                    request.getRequestDispatcher("uzenet/hiba.jsp").forward(request, response);
                }
            }
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
