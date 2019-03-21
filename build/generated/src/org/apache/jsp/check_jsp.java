package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class check_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>check</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background: url(\"6.jpg\");\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 4em;   \n");
      out.write("                //color:greenyellow;\n");
      out.write("                margin-top: auto;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .container{\n");
      out.write("              \n");
      out.write("\t\tmargin-top: 4em;\n");
      out.write("                margin-left: 4em;\n");
      out.write("                height: auto;\n");
      out.write("                width: available;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        }\n");
      out.write("        nav>ul{\n");
      out.write("            //width: 60em;\n");
      out.write("            position: absolute;\n");
      out.write("                right:auto;\n");
      out.write("\t\tleft:auto;\n");
      out.write("                height: 70%;\n");
      out.write("                width: 90%;\n");
      out.write("                //padding-left: 3em;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        }\n");
      out.write("        nav>ul>li{\n");
      out.write("            \n");
      out.write("            height: border-box;\n");
      out.write("            float:left;\n");
      out.write("            margin-left: 2em;\n");
      out.write("            padding-left:2em;\n");
      out.write("            \n");
      out.write("                \n");
      out.write("        }\n");
      out.write("        nav>ul>li>a{\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\tfont-family: 'Abel', sans-serif;\n");
      out.write("\t\tcolor:#fff;\n");
      out.write("\t\tfont-size:14px;\n");
      out.write("\t\tfont-weight:bold;\n");
      out.write("\t\tpadding:12px 30px 12px 30px ;\n");
      out.write("\t\tbackground: rgba(0,0,0,0.5);\n");
      out.write("\t}\n");
      out.write("            #login-box{\n");
      out.write("                width: 700px;\n");
      out.write("                border:  0;\n");
      out.write("                padding-top: 4em;\n");
      out.write("                text-align: center;\n");
      out.write("                margin-left: 4em;\n");
      out.write("                margin-top: 2em;                \n");
      out.write("                background: rgba(0,0,0,0.1);\n");
      out.write("                font-size: 2em;\n");
      out.write("                 top:30%;\n");
      out.write("                 left:25%;\n");
      out.write("                position:absolute;\n");
      out.write("                font-style: inherit;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            #login-box input[name =\"Actual\"]\n");
      out.write("            {          \n");
      out.write("                border: none;\n");
      out.write("             width :400px; \n");
      out.write("             opacity: 2;\n");
      out.write("              \n");
      out.write("  \n");
      out.write("            }\n");
      out.write("            #login-box input[name =\"Visual\"]\n");
      out.write("            {     \n");
      out.write("                border: none;\n");
      out.write("                width: 400px;             \n");
      out.write("             }\n");
      out.write("             #login-box input[name=\"submit\"]\n");
      out.write("             {\n");
      out.write("                 border :none;\n");
      out.write("\t       background:#1c8adb;\n");
      out.write("\t      outline:none;\n");
      out.write("\t       height:40px;\n");
      out.write("\t      color:inherit;\n");
      out.write("\t       font-size:18px;\n");
      out.write("\t      border-radius:20px;\n");
      out.write("             }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            function myFunction(){\n");
      out.write("                var a_link = document.getElementById(\"a_link\").value;\n");
      out.write("                var v_link = document.getElementById(\"v_link\").value; \n");
      out.write("                var ans=\"\";\n");
      out.write("                for(var i=0;i<a_link.length;i++)\n");
      out.write("                    if(a_link[i]!='#'||a_link[i]!='&')\n");
      out.write("                        ans=ans+a_link[i];\n");
      out.write("                alert(ans);\n");
      out.write("                if(v_link.length<1)\n");
      out.write("                {\n");
      out.write("                    v_link=\"empty\";\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                a_link += \"0000000000\"+v_link;\n");
      out.write("                //alert(a_link);\n");
      out.write("                window.location.href = \"link.jsp?a_link=\"+a_link;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1> <a href=\"http://www.mnnit.ac.in/\"/><img src=\"1.png\" align=\"left\" width=\"150\" height=\"150\"></a>\n");
      out.write("            DETECTION OF PHISHING ATTACK</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">          \n");
      out.write("                  <div class=\"header\">\n");
      out.write("                            <nav>    \n");
      out.write("\t\t\t\t  <ul>\n");
      out.write("\t\t\t\t         <li><a href=\"UseraDetail.jsp\">MY DETAIL</a></li>\n");
      out.write("\t\t\t\t\t <li><a href=\"check.jsp\">CHECK BLACKLIST</a></li>\n");
      out.write("\t\t\t\t\t <li><a href=\"blacklist.jsp\">BLACKLIST</a></li>\n");
      out.write("\t\t\t\t\t <li><a href=\"feedback.jsp\">GIVE FEEDBACK</a></li>\n");
      out.write("\t\t\t\t\t <li><a href=\"index.html\">LOGOUT</a></li>\t\t\t\t  </ul>\n");
      out.write("\t\t\t\t</nav>    \n");
      out.write("                   </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        <div id=\"login-box\">\n");
      out.write("        <form action=\"\" method=\"POST\">\n");
      out.write("            \n");
      out.write("           <label for=\"ACTUAL LINK\">\n");
      out.write("        <b>Actual</b></label>\n");
      out.write("    <input name=\"Actual\" type=\"email\" \n");
      out.write("           id=\"a_link\" class=\"form-control\" placeholder=\"Enter Actual Link\"\n");
      out.write("        required style=\"height:40px;\"/>\n");
      out.write("    <br><br>\n");
      out.write("    <label for=\"VISUAL LINK\">\n");
      out.write("        <b>Visual</b></label>\n");
      out.write("    <input name=\"Visual\" type=\"email\" id=\"v_link\"\n");
      out.write("           class=\"form-control\" placeholder=\"Enter Visual Link\" style=\"height:40px;\"/>\n");
      out.write("    <br><br>\n");
      out.write("           \n");
      out.write("           <input type=\"button\"   onclick=\"myFunction()\" id=\"submit\" name=\"submit\" value=\"Check\">\n");
      out.write("            </form>\n");
      out.write("            </div>\n");
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
