/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.99
 * Generated at: 2020-02-12 17:56:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.RightAtHome;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/* @import url('https://fonts.googleapis.com/css?family=Gothic+A1|Kaushan+Script|Libre+Baskerville|Lobster'); */\r\n");
      out.write(".body{\r\n");
      out.write("\tfont-family: 'Gothic A1', sans-serif;\r\n");
      out.write("\tfont-size:16px;\r\n");
      out.write("\t}\r\n");
      out.write("\tp{\r\n");
      out.write("\tcolor:#6c6c6f;\r\n");
      out.write("\tfont-size:1em;\r\n");
      out.write("\t}\r\n");
      out.write("\th1,h2,h3,h4,h5,h6{color:#323233;text-transform:uppercase;}\r\n");
      out.write(".navbar-brand  span{\r\n");
      out.write("\tcolor: #fed136;\r\n");
      out.write("\tfont-size:25px;font-weight:700;letter-spacing:0.1em;\r\n");
      out.write("    font-family: 'Kaushan Script','Helvetica Neue',Helvetica,Arial,cursive;\r\n");
      out.write("}\r\n");
      out.write(".navbar-brand {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tfont-size:25px;\r\n");
      out.write("    font-family: 'Kaushan Script','Helvetica Neue',Helvetica,Arial,cursive;\r\n");
      out.write("\tfont-weight:700;\r\n");
      out.write("\tletter-spacing:0.1em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-nav .nav-item .nav-link{\r\n");
      out.write("\tpadding: 1.1em 1em!important;\r\n");
      out.write("\tfont-size: 120%;\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("    letter-spacing: 1px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("   font-family: 'Gothic A1', sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".navbar-nav .nav-item .nav-link:hover{color:#fed136;}\r\n");
      out.write(".navbar-expand-md .navbar-nav .dropdown-menu{\r\n");
      out.write("\tborder-top:3px solid #fed136;\r\n");
      out.write("}\r\n");
      out.write(".dropdown-item:hover{background-color:#fed136;color:#fff;}\r\n");
      out.write("nav{-webkit-transition: padding-top .3s,padding-bottom .3s;\r\n");
      out.write("    -moz-transition: padding-top .3s,padding-bottom .3s;\r\n");
      out.write("    transition: padding-top .3s,padding-bottom .3s;\r\n");
      out.write("    border: none;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write(" .shrink {\r\n");
      out.write("    padding-top: 0;\r\n");
      out.write("    padding-bottom: 0;\r\n");
      out.write("    background-color: #212529;\r\n");
      out.write("}\r\n");
      out.write(".banner{\r\n");
      out.write("\tbackground-image:url('http://www.hd-freewallpapers.com/latest-wallpapers/abstract-website-backgrounds.jpg');\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("   \r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    background-attachment: scroll;\r\n");
      out.write("    background-position: center center;\r\n");
      out.write("    -webkit-background-size: cover;\r\n");
      out.write("    -moz-background-size: cover;\r\n");
      out.write("    -o-background-size: cover;\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("}\r\n");
      out.write(".banner-text{\r\n");
      out.write("\tpadding:200px 0 150px 0;\r\n");
      out.write("}\r\n");
      out.write(".banner-heading{\r\n");
      out.write("\tfont-family: 'Lobster', cursive;\r\n");
      out.write("\tfont-size: 75px;\r\n");
      out.write("    font-weight: 700;\r\n");
      out.write("    line-height: 100px;\r\n");
      out.write("    margin-bottom: 30px;\r\n");
      out.write("\tcolor:#fff;\r\n");
      out.write("}\r\n");
      out.write(".banner-sub-heading{\r\n");
      out.write("\tfont-family: 'Libre Baskerville', serif;\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("    font-weight: 300;\r\n");
      out.write("    line-height: 30px;\r\n");
      out.write("    margin-bottom: 50px;\r\n");
      out.write("\tcolor:#fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-banner{\r\n");
      out.write("\tpadding:5px 20px;\r\n");
      out.write("\tborder-radius:10px;\r\n");
      out.write("\tfont-weight:700;\r\n");
      out.write("\tline-height:1.5;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tcolor:#fff;\r\n");
      out.write("\ttext-transform:uppercase;\r\n");
      out.write("}\r\n");
      out.write(".text-intro{\r\n");
      out.write("\twidth:90%;\r\n");
      out.write("\tmargin:auto;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tpadding-top:30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* mobile view */\r\n");
      out.write("@media (max-width:500px)\r\n");
      out.write("{\r\n");
      out.write("\t.navbar-nav{\r\n");
      out.write("\t\tbackground-color:#000;\r\n");
      out.write("\t\tborder-top:3px solid #fed136;\r\n");
      out.write("\t\tcolor:#fff;\r\n");
      out.write("\t\tz-index:1;\r\n");
      out.write("\t\tmargin-top:5px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t.navbar-nav .nav-item .nav-link{\r\n");
      out.write("\tpadding: 0.7em 1em!important;\r\n");
      out.write("\tfont-size: 100%;\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("    }\r\n");
      out.write("\t.banner-text{\r\n");
      out.write("\tpadding:150px 0 150px 0;\r\n");
      out.write("}\r\n");
      out.write(".banner-heading{\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("    line-height: 30px;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write(".banner-sub-heading{\r\n");
      out.write("\tfont-size: 10px;\r\n");
      out.write("    font-weight: 200;\r\n");
      out.write("    line-height: 10px;\r\n");
      out.write("    margin-bottom: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media (max-width:768px){\r\n");
      out.write("\t.banner-text{\r\n");
      out.write("\tpadding:150px 0 150px 0;\r\n");
      out.write("}\r\n");
      out.write("\t.banner-sub-heading{\r\n");
      out.write("\tfont-size: 23px;\r\n");
      out.write("    font-weight: 200;\r\n");
      out.write("    line-height: 23px;\r\n");
      out.write("    margin-bottom: 40px;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-md navbar-dark fixed-top\" id=\"banner\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("  <!-- Brand -->\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\"><span>Logo</span> Here</a>\r\n");
      out.write("\r\n");
      out.write("  <!-- Toggler/collapsibe Button -->\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#collapsibleNavbar\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <!-- Navbar links -->\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Link</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Link</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Link</a>\r\n");
      out.write("      </li> \r\n");
      out.write("\t   <!-- Dropdown -->\r\n");
      out.write("    <li class=\"nav-item dropdown\">\r\n");
      out.write("      <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbardrop\" data-toggle=\"dropdown\">\r\n");
      out.write("        Dropdown link\r\n");
      out.write("      </a>\r\n");
      out.write("      <div class=\"dropdown-menu\">\r\n");
      out.write("        <a class=\"dropdown-item\" href=\"#\">Link 1</a>\r\n");
      out.write("        <a class=\"dropdown-item\" href=\"#\">Link 2</a>\r\n");
      out.write("        <a class=\"dropdown-item\" href=\"#\">Link 3</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("<div class=\"banner\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t<div class=\"banner-text\">\r\n");
      out.write("\t<div class=\"banner-heading\">\r\n");
      out.write("\tGlad to see you here !\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"banner-sub-heading\">\r\n");
      out.write("\tHere goes the secondary heading on hero banner\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<button type=\"button\" class=\"btn btn-warning text-dark btn-banner\">Get started</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<section id=\"about\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"text-intro\">\r\n");
      out.write("\t<h2>About Us</h2>\r\n");
      out.write("\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit.Lorem ipsum dolor sit amet, consectetur adipisicing elit. Minima maxime quam architecto quo inventore harum ex magni, dicta impedit.</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</section>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("$(document).on(\"scroll\", function(){\r\n");
      out.write("\tif\r\n");
      out.write("  ($(document).scrollTop() > 86){\r\n");
      out.write("\t  $(\"#banner\").addClass(\"shrink\");\r\n");
      out.write("\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t{\r\n");
      out.write("\t\t$(\"#banner\").removeClass(\"shrink\");\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}