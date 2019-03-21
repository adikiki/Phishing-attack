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

/**
 *
 * @author WELCOME
 */
public class register extends HttpServlet {

    Connection con;
    PreparedStatement ps;
     
    
    @Override
    public void init(){
        try{
            String qr ="insert into register (UNAME,PSD,C_PSD,MOBILE,EMAIL) values (?,?,?,?,?) ";
            Class.forName("com.mysql.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/adiquery","root","root");   
          ps= con.prepareStatement(qr);
           
           
        }catch(ClassNotFoundException | SQLException ex)
        {}
    }
@Override
    public void destroy(){
        try{
            con.close();
        }catch (Exception ex){}
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        String uname= request.getParameter("Username");
        String passwrd= request.getParameter("Password");
        String cpasswrd = request.getParameter("ConfirmPassword");
        String mobile = request.getParameter("contact");
        String email = request.getParameter("Email");
        
        String submitType= request.getParameter("Signup");
        
        //out.println("nffj");
         
         try  {
             
        ps.setString(1,uname);
        ps.setString(2,passwrd);
        ps.setString(3,cpasswrd);
        ps.setString(4,mobile);
        ps.setString(5,email);
        
        //out.println("mkmkmkm");
       
       ps.executeUpdate();
       PrintWriter exe = response.getWriter();
       
       exe.println("Registered Successfully");
              
      
            
        }
        catch(SQLException | IOException ex){
            
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
