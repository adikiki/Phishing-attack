/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phishing.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author WELCOME
 */
public class welcome extends HttpServlet {
 Connection con;
 PreparedStatement ps;
 
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            String uname= request.getParameter("username");
            String Pwd = request.getParameter("password");
            
            String dbname=null,dbpwd=null;
            
            String qr = "Select * from register where UNAME = ? and PSD = ?";
            
             Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adiquery","root","root");
             
             ps=con.prepareStatement(qr);
             ps.setString(1,uname);
             ps.setString(2, Pwd);
           
             
            ResultSet rs = ps.executeQuery();
            
             //out.println("jhdj");
                        
         while(rs.next()){
                 dbname = rs.getString("UNAME");
                 dbpwd= rs.getString("PSD");
             }
             
             if(uname.equals(dbname) && Pwd.equals(dbpwd))
             {
                HttpSession session = request.getSession();
                session.setAttribute("UNAME", uname);
                 response.sendRedirect("Account.jsp");
             }
             else
             {
                 out.println("Wrong id and passwrd");
             }
            
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     try {
         processRequest(request, response);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
     }
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
