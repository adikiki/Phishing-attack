package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<head>\n");
      out.write("    <title>registration</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style1.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<script type=\"text/javascript\" src='https://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.3.min.js'></script>\n");
      out.write("<script type=\"text/javascript\" src='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/js/bootstrap.min.js'></script>\n");
      out.write("<link rel=\"stylesheet\" href='https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.3/css/bootstrap.min.css' media=\"screen\" />\n");
      out.write("<a href=\"user.jsp\" ><h2 style=\"none\">BACK</h2></a>\n");
      out.write("\t<div class=\"login-box\">\n");
      out.write("\t<!--img src=\"grid-img1.png\" class=\"avatar\"-->\n");
      out.write("\t      <h1><b>User Registration</b></h1>\n");
      out.write("    <form action=\"accountuser\" method=\"POST\" >\n");
      out.write("<!--<div style=\"max-width: 400px;\">\n");
      out.write("    <h2 class=\"form-signin-heading\">\n");
      out.write("        Registration</h2>-->\n");
      out.write("        <label for=\"Name\">\n");
      out.write("        <b>Name</b></label>\n");
      out.write("    <input name=\"Uname\" type=\"text\" id=\"txtUsername\" class=\"form-control\" placeholder=\"Enter Name\"\n");
      out.write("        required />\n");
      out.write("    <br />\n");
      out.write("    \n");
      out.write("    <label for=\"Address\">\n");
      out.write("        <b>Address</b></label>\n");
      out.write("    <input name=\"UserAddress\" type=\"text\" id=\"txtUsername\" class=\"form-control\" placeholder=\"Enter Address\"\n");
      out.write("        required />\n");
      out.write("    <br />\n");
      out.write("\n");
      out.write("    <label for=\"Username\">\n");
      out.write("        <b>Username</b></label>\n");
      out.write("    <input name=\"Username\" type=\"text\" id=\"txtUsername\" class=\"form-control\" placeholder=\"Enter Username\"\n");
      out.write("        required />\n");
      out.write("    <br />\n");
      out.write("    <label for=\"Password\">\n");
      out.write("        <b>Password</b></label>\n");
      out.write("    <input name=\"Password\" type=\"password\" id=\"txtPassword\" title=\"Password must contain: Minimum 8 characters atleast 1 Alphabet and 1 Number\"\n");
      out.write("        class=\"form-control\" placeholder=\"Enter Password\" required pattern=\"^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$\" />\n");
      out.write("    <br />\n");
      out.write("    <label for=\"ConfirmPassword\">\n");
      out.write("        Confirm Password</label>\n");
      out.write("    <input name=\"ConfirmPassword\" type=\"password\" id=\"txtConfirmPassword\" class=\"form-control\"\n");
      out.write("        placeholder=\"Confirm Password\" />\n");
      out.write("    <br />\n");
      out.write("    \n");
      out.write("    <label for=\"Email\">\n");
      out.write("        Email</label>\n");
      out.write("    <input name=\"Email\" type=\"text\" id=\"txtEmail\" class=\"form-control\" placeholder=\"Enter Email\"\n");
      out.write("        required pattern = \"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$\"/>\n");
      out.write("    <br />\n");
      out.write("    \n");
      out.write("    <label for=\"Mobile\">\n");
      out.write("        Contact</label>\n");
      out.write("    <input name=\"contact\" type=\"text\" id=\"txtEmail\" class=\"form-control\" placeholder=\"Enter Mobileno\"\n");
      out.write("         maxlength=\"10\" required pattern=\"(7|8|9)\\d{9}\" />\n");
      out.write("    <br />\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\t\n");
      out.write("    <input type=\"submit\" name=\"Signup\" value=\"Sign up\" id=\"btnSignup\" class=\"btn btn-primary\" />\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    window.onload = function () {\n");
      out.write("        var Password = document.getElementById(\"Password\");\n");
      out.write("        var ConfirmPassword = document.getElementById(\"ConfirmPassword\");\n");
      out.write("        Password.onchange = ConfirmPassword;\n");
      out.write("        ConfirmPassword.onkeyup = ConfirmPassword;\n");
      out.write("        function ConfirmPassword() {\n");
      out.write("            ConfirmPassword.setCustomValidity(\"\");\n");
      out.write("            if (Password.value !== ConfirmPassword.value) {\n");
      out.write("                ConfirmPassword.setCustomValidity(\"Passwords do not match.\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    };\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
