/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2017-10-15 18:54:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class GetOffers_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Expedia Client</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/Master.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/jquery-ui.theme.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("  $( function() {\r\n");
      out.write("\r\n");
      out.write("    $( \"#datepicker\" ).datepicker();\r\n");
      out.write("    $( \"#datepicker2\" ).datepicker();\r\n");
      out.write("\r\n");
      out.write("  } );\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"content\">\r\n");
      out.write("<div id=\"main-container\">\r\n");
      out.write("<div class=\"requestSide\">\r\n");
      out.write("\r\n");
      out.write("<table align=\"center\">\r\n");
      out.write("    <tbody>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td class=\"warning\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${warningMsg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<form name=\"expediaClient\" method=\"post\" action=\"GetMyOffers\">\r\n");
      out.write("\r\n");
      out.write("<p>Welcome, please let me know what you are looking for!</p>\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"4\" style=\"font-weight: bold;\" colspan=\"2\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"rowheader\">Destination</td>\r\n");
      out.write("\t\t<td colspan=\"3\"><input type=\"text\" name=\"destination\"\r\n");
      out.write("\t\t\tclass=textfield /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("        <td class=\"rowheader\">Length of Stay</td>\r\n");
      out.write("        <td colspan=\"3\"><input type=\"text\" name=\"lengthOfStay\"\r\n");
      out.write("            class=textfield /></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"rowheader\">Min Star Rating</td>\r\n");
      out.write("\t\t<td><select name=\"minStarRate\" class=\"textfield\">\r\n");
      out.write("\t\t    <option value=\"\">--select--</option>\r\n");
      out.write("\t\t\t<option value=\"1.0\">*</option>\r\n");
      out.write("\t\t\t<option value=\"2.0\">**</option>\r\n");
      out.write("\t\t\t<option value=\"3.0\">***</option>\r\n");
      out.write("\t\t\t<option value=\"4.0\">****</option>\r\n");
      out.write("\t\t\t<option value=\"5.0\">*****</option>\r\n");
      out.write("\t\t\t</html:select></td>\r\n");
      out.write("\r\n");
      out.write("\t\t<td class=\"rowheader\">Max Star Rating</td>\r\n");
      out.write("\t\t<td><select name=\"maxStarRate\" class=\"textfield\">\r\n");
      out.write("            <option value=\"\">--select--</option>\r\n");
      out.write("\t\t\t<option value=\"1.0\">*</option>\r\n");
      out.write("\t\t\t<option value=\"2.0\">**</option>\r\n");
      out.write("\t\t\t<option value=\"3.0\">***</option>\r\n");
      out.write("\t\t\t<option value=\"4.0\">****</option>\r\n");
      out.write("\t\t\t<option value=\"5.0\">*****</option>\r\n");
      out.write("\t\t\t</html:select></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"rowheader\">Min Guest Rating</td>\r\n");
      out.write("\t\t<td><select name=\"minGuestRate\" class=\"textfield\">\r\n");
      out.write("            <option value=\"\">--select--</option>\r\n");
      out.write("\t\t\t<option value=\"1.0\">1</option>\r\n");
      out.write("\t\t\t<option value=\"2.0\">2</option>\r\n");
      out.write("\t\t\t<option value=\"3.0\">3</option>\r\n");
      out.write("\t\t\t<option value=\"4.0\">4</option>\r\n");
      out.write("\t\t\t<option value=\"5.0\">5</option>\r\n");
      out.write("\t\t\t<option value=\"6.0\">6</option>\r\n");
      out.write("\t\t\t<option value=\"7.0\">7</option>\r\n");
      out.write("\t\t\t<option value=\"8.0\">8</option>\r\n");
      out.write("\t\t\t<option value=\"9.0\">9</option>\r\n");
      out.write("\t\t\t</html:select></td>\r\n");
      out.write("\r\n");
      out.write("\t\t<td class=\"rowheader\">Max Guest Rating</td>\r\n");
      out.write("\t\t<td><select name=\"maxGuestRate\" class=\"textfield\">\r\n");
      out.write("            <option value=\"\">--select--</option>\r\n");
      out.write("\t\t\t<option value=\"1.0\">1</option>\r\n");
      out.write("\t\t\t<option value=\"2.0\">2</option>\r\n");
      out.write("\t\t\t<option value=\"3.0\">3</option>\r\n");
      out.write("\t\t\t<option value=\"4.0\">4</option>\r\n");
      out.write("\t\t\t<option value=\"5.0\">5</option>\r\n");
      out.write("\t\t\t<option value=\"6.0\">6</option>\r\n");
      out.write("\t\t\t<option value=\"7.0\">7</option>\r\n");
      out.write("\t\t\t<option value=\"8.0\">8</option>\r\n");
      out.write("\t\t\t<option value=\"9.0\">9</option>\r\n");
      out.write("\t\t\t</html:select></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"rowheader\">Min Total Rate</td>\r\n");
      out.write("\t\t<td><select name=\"minTotalRate\" class=\"textfield\">\r\n");
      out.write("            <option value=\"\">--select--</option>\r\n");
      out.write("\t\t\t<option value=\"1.0\">1</option>\r\n");
      out.write("\t\t\t<option value=\"2.0\">2</option>\r\n");
      out.write("\t\t\t<option value=\"3.0\">3</option>\r\n");
      out.write("\t\t\t<option value=\"4.0\">4</option>\r\n");
      out.write("\t\t\t<option value=\"5.0\">5</option>\r\n");
      out.write("\t\t\t<option value=\"6.0\">6</option>\r\n");
      out.write("\t\t\t<option value=\"7.0\">7</option>\r\n");
      out.write("\t\t\t<option value=\"8.0\">8</option>\r\n");
      out.write("\t\t\t<option value=\"9.0\">9</option>\r\n");
      out.write("\t\t\t</html:select></td>\r\n");
      out.write("\r\n");
      out.write("\t\t<td class=\"rowheader\">Max Total Rate</td>\r\n");
      out.write("\t\t<td><select name=\"maxTotalRate\" class=\"textfield\">\r\n");
      out.write("            <option value=\"\">--select--</option>\r\n");
      out.write("\t\t\t<option value=\"1.0\">1</option>\r\n");
      out.write("\t\t\t<option value=\"2.0\">2</option>\r\n");
      out.write("\t\t\t<option value=\"3.0\">3</option>\r\n");
      out.write("\t\t\t<option value=\"4.0\">4</option>\r\n");
      out.write("\t\t\t<option value=\"5.0\">5</option>\r\n");
      out.write("\t\t\t<option value=\"6.0\">6</option>\r\n");
      out.write("\t\t\t<option value=\"7.0\">7</option>\r\n");
      out.write("\t\t\t<option value=\"8.0\">8</option>\r\n");
      out.write("\t\t\t<option value=\"9.0\">9</option>\r\n");
      out.write("\t\t\t</html:select></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td class=\"rowheader\">Trip Start Date</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"tripStartDate\" class=textfield\r\n");
      out.write("\t\t\tid=\"datepicker\" /></td>\r\n");
      out.write("\r\n");
      out.write("\t\t<td class=\"rowheader\">Trip End Date</td>\r\n");
      out.write("\t\t<td><input type=\"text\" name=\"tripEndDate\" class=textfield\r\n");
      out.write("\t\t\tid=\"datepicker2\" /></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\" align=\"right\"><input type=\"submit\" class=\"button\" value=\"Submit\" /><br />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
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
