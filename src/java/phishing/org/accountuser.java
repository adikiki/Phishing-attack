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
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author WELCOME
 */
public class accountuser extends HttpServlet {
 Connection con; 
 PreparedStatement ps;
 
 
 @Override
    public void init(){
        try{
            String qr ="insert into user (NAME,ADDRESS,UNAME,PASSWORD,CPASSWORD,EMAIL,MOBILE) values(?,?,?,?,?,?,?);";
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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        String name=request.getParameter("Uname");
        String address= request.getParameter("UserAddress");
        String uname= request.getParameter("Username");
        String passwrd= request.getParameter("Password");
        String cpasswrd = request.getParameter("ConfirmPassword");
        
        String email = request.getParameter("Email");
        String mobile = request.getParameter("contact");
        
        String submitType= request.getParameter("Signup");
        
        //out.println("nffj");
         
         try  {
         ps.setString(1,name);
          ps.setString(2,address);
        ps.setString(3,uname);
        ps.setString(4,passwrd);
        ps.setString(5,cpasswrd);
        ps.setString(6,email);
        ps.setString(7,mobile);
        
        
        //out.println("mkmkmkm");
       
       ps.executeUpdate();
       PrintWriter exe = response.getWriter();
       out.print("<table align='center' cellpadding='5' cellspacing='5'><tr><td></td><td><a href='user.jsp'>Login</a></td><td></td></table>");
       
       
       //exe.println("Registered Successfully");
        exe.println("<script type =\"text/javascript\">");
               exe.println("alert('Successfully Registered')");
                
                 exe.println("location='user.jsp';");
              exe.println("</script>"); 
       
      
            
        }
        catch(SQLException | IOException ex){
            
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
