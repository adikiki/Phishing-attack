package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</html>\n");
      out.write("    <head>\n");
      out.write("\t<title> Admin Login</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\t  <div class=\"login-box\">\n");
      out.write("\t   <img src=\"25.jpeg\" class=\"avatar\">\n");
      out.write("\t      <h1>Admin Login</h1>\n");
      out.write("         <form role=\"form\" method=\"post\" action=\"welcome\">\n");
      out.write("             <p>Username</p>\n");
      out.write("\t\t     <input type=\"text\" name=\"username\" placeholder=\"username\">\n");
      out.write("\t\t     <p>Password</p>\n");
      out.write("\t\t     <input type=\"password\" name=\"password\" placeholder=\"password\">\n");
      out.write("             <input type=\"submit\" name=\"submit\" value=\"Login\">\n");
      out.write("             <a href=\"#\">&emsp;&emsp; Forget Password &nbsp;</a>\n");
      out.write("\t\t\t <a href=\"index.html\">&emsp; back</a>\n");
      out.write("          </form>           \t\n");
      out.write("\t\t\t\n");
      out.write("\t   </div>\n");
      out.write("\t </body>\n");
      out.write("</html>\n");
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
