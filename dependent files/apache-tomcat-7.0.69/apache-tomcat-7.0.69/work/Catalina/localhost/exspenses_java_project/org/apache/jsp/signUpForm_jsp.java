/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.69
 * Generated at: 2016-04-24 06:13:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUpForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title>SignUp Page</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t\r\n");
      out.write("\tbody { background-color:#ffe6ff;}\r\n");
      out.write("\r\n");
      out.write("\th1 { text-align :center;}\r\n");
      out.write("\t\r\n");
      out.write("\t.submits{ font-size:13pt;background:#ffffcc;}\r\n");
      out.write("\t\r\n");
      out.write("\t.anchors\r\n");
      out.write("\t{ \r\n");
      out.write("\t  \tfont-size:20pt; \r\n");
      out.write("\t  \ttext-decoration:none;\r\n");
      out.write("\t  \tcolor:blue;\r\n");
      out.write("\t  \tposition:relative;\r\n");
      out.write("\t  \tleft:40%;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t.tables\r\n");
      out.write("\t{\r\n");
      out.write("\t\tfont-size:15pt;\r\n");
      out.write("\t\tborder:1px solid;\r\n");
      out.write("\t\tpadding:20px;\r\n");
      out.write("\t\theight:250px;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction validateNames(idname)\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar txtbox= document.getElementById(idname);  \r\n");
      out.write("\t\tvar name = txtbox.value;\r\n");
      out.write("\t\tvar reg1 = /^[a-zA-Z]+[\\s]?[a-zA-Z ]+$/;\r\n");
      out.write("\t\ttxtbox.style.color ='white'; \r\n");
      out.write("        if(reg1.test(name)) \r\n");
      out.write("        \t{\r\n");
      out.write("        \t\ttxtbox.style.backgroundColor ='green'; \r\n");
      out.write("        \t}\t\r\n");
      out.write("    \telse \r\n");
      out.write("    \t\t{\r\n");
      out.write("        \t\ttxtbox.style.backgroundColor ='red';\r\n");
      out.write("    \t\t}\r\n");
      out.write("   \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction validateEmail()\r\n");
      out.write("    {\r\n");
      out.write("        var txtbox= document.getElementById(\"emailid\");\r\n");
      out.write("        var email= txtbox.value;\r\n");
      out.write("        var emailrx = /^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$/;\r\n");
      out.write("   \t\t txtbox.style.color ='white'; \r\n");
      out.write("        if(emailrx.test(email))                                                \r\n");
      out.write("         {\r\n");
      out.write("        \ttxtbox.style.backgroundColor ='green';                                     \r\n");
      out.write("     \t }\r\n");
      out.write("\t    else \r\n");
      out.write("\t      {\r\n");
      out.write("\t        txtbox.style.backgroundColor ='red';                                     \r\n");
      out.write("\t      }\r\n");
      out.write("\t                                            \r\n");
      out.write("\t        \r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction validateMobile()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar txtbox= document.getElementById(\"mobileid\");  \r\n");
      out.write("\t\tvar mobile = txtbox.value;\r\n");
      out.write("\t\tvar reg2 = /\\d{3}[-]\\d{3}[-]\\d{4}/;\r\n");
      out.write("\t\ttxtbox.style.color ='white'; \r\n");
      out.write("        if(reg2.test(mobile)) \r\n");
      out.write("        \t{\r\n");
      out.write("        \t\ttxtbox.style.backgroundColor ='green'; \r\n");
      out.write("        \t}\t\r\n");
      out.write("    \telse \r\n");
      out.write("    \t\t{\r\n");
      out.write("        \t\ttxtbox.style.backgroundColor ='red';\r\n");
      out.write("    \t\t}\r\n");
      out.write("   \r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1 style=\"font-family:Apple chancery;\">  EXPENSES ESTIMATOR </h1>\r\n");
      out.write("\r\n");
      out.write("\t\t<a href=\"signIn.jsp\" class=\"anchors\">Home</a>\r\n");
      out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t<a href=\"userForm.jsp\" class=\"anchors\"> Expenses Form</a>\r\n");
      out.write("\t\t<hr />\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<form method=\"post\" action=\"SignUpPath\" >\r\n");
      out.write("\t\t\t<h2 align=\"center\" \"> Sign Up Form</h2>\r\n");
      out.write("\t\t\t<table class=\"tables\" align=\"center\" cellspacing=\"5\" cellpadding=\"10\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">First Name: </td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"fname\" size=\"30\" id=\"fnameid\" onkeyup=\"validateNames('fnameid')\" /> </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">Last Name: </td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"lname\"  size=30 id=\"lnameid\" onkeyup=\"validateNames('lnameid')\" /> </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">Email Id: </td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"email\"  size=30  id=\"emailid\" onkeyup=\"validateEmail()\" /> </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"right\">Mobile[xxx-xxx-xxxx]: </td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"mobile\"  size=30  id=\"mobileid\" onkeyup=\"validateMobile()\"/> </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td align=\"left\"><input  class=\"submits\" type=\"submit\"  />\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;<input  class=\"submits\" type=\"reset\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
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
