package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class internit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<title>INTER NIT</title>\n");
      out.write("\t <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" >\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" >\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" ></script>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("\n");
      out.write("    body{\n");
      out.write("        background-image: url(\"img2.jpg\");\n");
      out.write("        background-repeat: no-repeat;\n");
      out.write("        background-attachment: fixed;\n");
      out.write("        background-position: center; \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    h1{\n");
      out.write("        font-family: sans-serif;\n");
      out.write("        font-size: 4em;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("    section\n");
      out.write("    {\n");
      out.write("        margin-top: 3em;\n");
      out.write("         padding-left: 70px;\n");
      out.write("         padding-right: 70px;         \n");
      out.write("       margin-bottom:3em;\n");
      out.write("    }\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <h1> \n");
      out.write("        INTER NIT SPORTS EVENTS </h1>\n");
      out.write("<section  class=\"text-center\">\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        \n");
      out.write("    <div class=\"col-lg-3 col-md-4 col-xs-8 thumb\" >\n");
      out.write("        <a href=\"#\" title=\"\"><img src=\"new/CRICKET.jpg\" class=\"img-responsive\" style=\"border: 100px;\" ></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("        <a href=\"#\" title=\"\"><img src=\"new/CHESS.jpg\" class=\"img-responsive\"></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("        <a href=\"#\" title=\"\"><img src=\"new/BAD.jpg\" class=\"img-responsive\"></a>\n");
      out.write("    </div>  \n");
      out.write("    \n");
      out.write("    <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("        <a href=\"#\" title=\"\"><img src=\"new/FOOTBALL.jpg\" class=\"img-responsive\"></a>\n");
      out.write("    </div> \n");
      out.write("       </section>\n");
      out.write("\t</div>   \n");
      out.write("<section id=\"thead\">\n");
      out.write("<div  class=\"row\">\n");
      out.write("    <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("        <a href=\"\" title=\"\"><img src=\"new/KHO KHO.jpg\" class=\"img-responsive\"></a>\n");
      out.write("    </div> \n");
      out.write("    <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("        <a href=\"\" title=\"\"><img src=\"new/TT.jpg\" class=\"img-responsive\"></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("        <a href=\"\" title=\"\"><img src=\"new/VOLLEYBALL.jpg\" class=\"img-responsive\"></a>\n");
      out.write("    </div> \n");
      out.write("    <div class=\"col-lg-3 col-md-4 col-xs-6 thumb\">\n");
      out.write("        <a href=\"#\" title=\"\"><img src=\"new/TENNIS.jpg\" class=\"img-responsive\"></a>\n");
      out.write("    </div> \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("</body>\n");
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
