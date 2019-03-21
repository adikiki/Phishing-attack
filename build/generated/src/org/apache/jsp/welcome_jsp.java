package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("   <title>User Account</title>\n");
      out.write("   <style>\n");
      out.write("   body\n");
      out.write("    {\n");
      out.write("       margin:0;\n");
      out.write("       padding:0;\n");
      out.write("       background-image:url(4.jpg);\n");
      out.write("       background-size:cover;\n");
      out.write("       font-family:sans-family;\n");
      out.write("   \n");
      out.write("    }\n");
      out.write("   .container\n");
      out.write("\t{\n");
      out.write("\t\t//width:100%;\n");
      out.write("\t\t//height:800px;\n");
      out.write("\t\tposition:relative;\n");
      out.write("\t\tmargin-top: 0;\n");
      out.write("                padding:0;\t\t\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("        .header{\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\tnav>ul{\n");
      out.write("\t\tposition:absolute;\n");
      out.write("\t\tright:auto;\n");
      out.write("\t\tleft:auto;\n");
      out.write("                height: auto;\n");
      out.write("                width: 60%;\n");
      out.write("\t}\n");
      out.write("\tnav>ul>li{\n");
      out.write("\t\tlist-style:none;\n");
      out.write("\t\tfloat:left;\n");
      out.write("\t\theight:80px;\n");
      out.write("\t\tline-height:40px;\n");
      out.write("                \n");
      out.write("\t}\n");
      out.write("\tnav>ul>li>a{\n");
      out.write("\t\ttext-decoration:none;\n");
      out.write("\t\tfont-family: 'Abel', sans-serif;\n");
      out.write("\t\tcolor:#fff;\n");
      out.write("\t\tfont-size:14px;\n");
      out.write("\t\tfont-weight:bold;\n");
      out.write("\t\tpadding:12px 30px 12px 30px ;\n");
      out.write("\t\tbackground: rgba(0,0,0,0.5);\n");
      out.write("\t}\n");
      out.write("   </style>\n");
      out.write("   \n");
      out.write(" </head>\n");
      out.write(" \n");
      out.write(" <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t     <div class=\"header\">\n");
      out.write("                              <img src=\"1.png\" alt=\"MNNIT logo\" width=\"150\" height=\"150\"> \n");
      out.write("                              DETECTION OF PHISHING ATTACK\n");
      out.write("                              <nav>\n");
      out.write("                                \n");
      out.write("\t\t\t\t  <ul>\n");
      out.write("\t\t\t\t     <li><a href=\"#\">VIEW USER</a></li>\n");
      out.write("\t\t\t\t\t <li><a href=\"#\">ADD BLACKLIST</a></li>\n");
      out.write("\t\t\t\t\t <li><a href=\"#\">VIEW LIST</a></li>\n");
      out.write("\t\t\t\t\t <li><a href=\"#\">VIEW FEEDBACK</a></li>\n");
      out.write("\t\t\t\t\t <li><a href=\"Admin_login.php\">LOGOUT</a></li>\n");
      out.write("\t\t\t\t  </ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("     \n");
      out.write("         ");


        
      out.write("\n");
      out.write("     \n");
      out.write("     <div></div>\n");
      out.write("\t\t\n");
      out.write("\t\t</body>\n");
      out.write("\t\t</html>");
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
