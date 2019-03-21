package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cricket_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>cricket</title>\n");
      out.write("    </head>\n");
      out.write("    <body>              \n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                //background: url(\"22.jpg\") no-repeat;\n");
      out.write("                background-position: center;\n");
      out.write("                background-color: #222833;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 6em;   \n");
      out.write("                color:greenyellow;\n");
      out.write("                margin-top: auto;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            #header input{\n");
      out.write("                text-align: center;                \n");
      out.write("                width: 180px;\n");
      out.write("                height: 30px;\n");
      out.write("                margin-left: 40%;\n");
      out.write("                margin-right: 20px;\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                margin-top: 5em;\n");
      out.write("                font-weight: bold;    \n");
      out.write("            }         \n");
      out.write("    </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1>\n");
      out.write("         <a href=\"http://www.mnnit.ac.in/\"/><img src=\"15.jpg\" align=\"left\" width=\"150\" height=\"150\"></a>\n");
      out.write("              INTER NIT CRICKET            \n");
      out.write("        </h1>             \n");
      out.write("        <div id=\"header\">    \n");
      out.write("                            \n");
      out.write("                <form action=\"rec\" method=\"POST\">\n");
      out.write("                <input type=\"text\" name=\"GAMEYEAR\" placeholder=\"GAMEYEAR\">\n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"Team\"> \n");
      out.write("                <input type=\"submit\" name=\"submit\" value=\"MEDAL\">                 \n");
      out.write("                </form>           \n");
      out.write("            \n");
      out.write("        </div>         \n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
