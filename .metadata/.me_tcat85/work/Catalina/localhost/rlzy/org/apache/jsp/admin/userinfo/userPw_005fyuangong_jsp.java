/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2019-12-31 11:26:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin.userinfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class userPw_005fyuangong_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");

String path = request.getContextPath();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\" />\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\" />\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\" />\r\n");
      out.write("\t\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\" />\r\n");
      out.write("\t\t<meta http-equiv=\"description\" content=\"This is my page\" />\r\n");
      out.write("        \r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path );
      out.write("/css/base.css\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type='text/javascript' src='");
      out.print(path );
      out.write("/dwr/interface/loginService.js'></script>\r\n");
      out.write("        <script type='text/javascript' src='");
      out.print(path );
      out.write("/dwr/engine.js'></script>\r\n");
      out.write("        <script type='text/javascript' src='");
      out.print(path );
      out.write("/dwr/util.js'></script>\r\n");
      out.write("\t\t\r\n");
      out.write("        <script language=\"javascript\">\r\n");
      out.write("            function check()\r\n");
      out.write("            {\r\n");
      out.write("                 var real=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.yuangong.loginpw}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("                 if(document.formPw.loginpw.value !=real)\r\n");
      out.write("                 {\r\n");
      out.write("                     alert(\"原密码不正确\");\r\n");
      out.write("                     return ;\r\n");
      out.write("                 }\r\n");
      out.write("                 \r\n");
      out.write("                 if(document.formPw.loginpw1.value ==\"\")\r\n");
      out.write("                 {\r\n");
      out.write("                     alert(\"新密码不能空\");\r\n");
      out.write("                     return ;\r\n");
      out.write("                 }\r\n");
      out.write("                 document.getElementById(\"indicator\").style.display=\"block\";\r\n");
      out.write("                 loginService.yuangong_PwEdit(document.formPw.loginpw1.value,callback);\r\n");
      out.write("            }\r\n");
      out.write("            function callback(data)\r\n");
      out.write("            {\r\n");
      out.write("                document.getElementById(\"indicator\").style.display=\"none\";\r\n");
      out.write("                alert(\"修改成功,重新登陆后生效\");\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("\t<script>\"undefined\"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:\"4038\",secure:\"4047\"},c={nonSecure:\"http://\",secure:\"https://\"},r={nonSecure:\"127.0.0.1\",secure:\"gapdebug.local.genuitec.com\"},n=\"https:\"===window.location.protocol?\"secure\":\"nonSecure\";script=e.createElement(\"script\"),script.type=\"text/javascript\",script.async=!0,script.src=c[n]+r[n]+\":\"+t[n]+\"/codelive-assets/bundle.js\",e.getElementsByTagName(\"head\")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>\r\n");
      out.write("\r\n");
      out.write("\t<body leftmargin=\"2\" topmargin=\"9\" background='");
      out.print(path );
      out.write("/img/allbg.gif' data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-28\" data-genuitec-path=\"/rlzy/WebRoot/admin/userinfo/userPw_yuangong.jsp\">\r\n");
      out.write("\t\t\t<form method=\"post\" action=\"");
      out.print(path );
      out.write("/userPwEdit.action\" name=\"formPw\" data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-28\" data-genuitec-path=\"/rlzy/WebRoot/admin/userinfo/userPw_yuangong.jsp\">\r\n");
      out.write("\t\t\t<table width=\"98%\" align=\"center\" border=\"0\" cellpadding=\"4\" cellspacing=\"1\" bgcolor=\"#CBD8AC\" style=\"margin-bottom:8px\">\r\n");
      out.write("\t\t\t\t<tr bgcolor=\"#EEF4EA\">\r\n");
      out.write("\t\t\t\t    <td colspan=\"2\" background=\"");
      out.print(path );
      out.write("/img/wbg.gif\" class='title'><span>密码修改</span></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">\r\n");
      out.write("\t\t\t\t         登录名：\r\n");
      out.write("\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t    <td width=\"75%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t        <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.yuangong.loginname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"loginname\" size=\"20\" disabled=\"disabled\"/>\r\n");
      out.write("\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">\r\n");
      out.write("\t\t\t\t        原密码：\r\n");
      out.write("\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t    <td width=\"75%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t        <input type=\"password\" name=\"loginpw\" id=\"loginpw\" size=\"22\"/>\r\n");
      out.write("\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">\r\n");
      out.write("\t\t\t\t         新密码：\r\n");
      out.write("\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t    <td width=\"75%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t        <input type=\"password\" id=\"loginpw1\" name=\"loginpw1\" size=\"22\"/>\r\n");
      out.write("\t\t\t\t    </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">\r\n");
      out.write("\t\t\t\t        &nbsp;\r\n");
      out.write("\t\t\t\t    </td>\r\n");
      out.write("\t\t\t        <td width=\"75%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t             <input type=\"button\" value=\"修改\" onclick=\"check()\"/>\r\n");
      out.write("\t\t\t             &nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t             <input type=\"reset\" value=\"重置\"/>\r\n");
      out.write("\t\t\t             <img id=\"indicator\" src=\"");
      out.print(path );
      out.write("/img/loading.gif\" alt=\"Loading...\" style=\"display:none\"/>\r\n");
      out.write("\t\t\t        </td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("   </body>\r\n");
      out.write("</html>\r\n");
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
