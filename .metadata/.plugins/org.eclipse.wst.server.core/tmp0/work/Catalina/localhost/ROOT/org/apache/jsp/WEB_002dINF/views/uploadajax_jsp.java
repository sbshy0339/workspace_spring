/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.35
 * Generated at: 2020-07-13 01:32:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class uploadajax_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/workspace_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/World7/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1593397369719L));
    _jspx_dependants.put("jar:file:/C:/workspace_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/World7/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/workspace_spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/World7/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"   href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script   src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script   src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".fileDrop {\r\n");
      out.write("   width: 80%;\r\n");
      out.write("   height: 200px;\r\n");
      out.write("   border: 1px dotted red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("   <div class=\"fileDrop\"></div>\r\n");
      out.write("   <div class=\"uploadedlist\"></div>\r\n");
      out.write("\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("      $(document).ready(function() {\r\n");
      out.write("         $(\".fileDrop\").on(\"dragenter dragover\", function(event) {\r\n");
      out.write("            event.preventDefault();\r\n");
      out.write("         });\r\n");
      out.write("\r\n");
      out.write("         $(\".fileDrop\").on(\"drop\", function(event) {//파일을 fileDrop영역에다 올릴 때 일어날 일\r\n");
      out.write("            event.preventDefault();\r\n");
      out.write("            var files = event.originalEvent.dataTransfer.files;\r\n");
      out.write("            var formData = new FormData();\r\n");
      out.write("\r\n");
      out.write("            //for문으로 여러개 파일 올리는것도 가능\r\n");
      out.write("            //for(var i : files)\r\n");
      out.write("            var file = files[0];\r\n");
      out.write("            formData.append(\"file\", file);\r\n");
      out.write("\r\n");
      out.write("            $.ajax({\r\n");
      out.write("               type : 'post',\r\n");
      out.write("               url : '/uploadajax',\r\n");
      out.write("               dataType : 'text',\r\n");
      out.write("               data : formData,\r\n");
      out.write("               processData : false,\r\n");
      out.write("               contentType : false,\r\n");
      out.write("               success : function(result) {\r\n");
      out.write("                  var str = \"<div><a href = 'displayfile?filename=\"+getImageLink(result)+\"'>\";\r\n");
      out.write("                  \r\n");
      out.write("                  if(checkImage(result)){\r\n");
      out.write("                     str += \"<img src = '/diplayfile?filename=\"+result+\"'/>\"   ;\r\n");
      out.write("                  }else{\r\n");
      out.write("                     str += \"<img src = '/resources/show.png'/>\";\r\n");
      out.write("                  }\r\n");
      out.write("                  \r\n");
      out.write("                  \r\n");
      out.write("                  str += getOriginalName(result);\r\n");
      out.write("                  str += \"<\\a><span class='glyphicon glyphicon-trash'></span><\\div>\";\r\n");
      out.write("                  $(\".uploadedlist\").append(str);\r\n");
      out.write("\r\n");
      out.write("               }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("         });\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      function getOriginalName(filename) {\r\n");
      out.write("         if (checkImage(filename)) {\r\n");
      out.write("            var idx = filename.indexOf(\"_\");\r\n");
      out.write("            idx = filename.indexOf(\"_\", idx + 1);\r\n");
      out.write("            return filename.substring(idx + 1);\r\n");
      out.write("         } else {\r\n");
      out.write("            var idx = filename.indexOf(\"_\");\r\n");
      out.write("            return filename.substring(idx + 1);\r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function checkImage(filename) {\r\n");
      out.write("         var idx = filename.lastIndexOf(\".\");\r\n");
      out.write("         var format = filename.substring(idx + 1).toUpperCase();\r\n");
      out.write("         if (format == 'PNG' || format == 'JPG' || format == 'JPEG'\r\n");
      out.write("               || format == 'GIF') {\r\n");
      out.write("            return true;\r\n");
      out.write("         } else {\r\n");
      out.write("            return false;\r\n");
      out.write("         }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function  getImageLink(result){\r\n");
      out.write("    \t if(checkImage(result)){\r\n");
      out.write("                 return result.substring(0,12) + result.substring(14);\r\n");
      out.write("        \t }else{\r\n");
      out.write("            \t return result;\r\n");
      out.write("            \t }\r\n");
      out.write("          }\r\n");
      out.write("   </script>\r\n");
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
