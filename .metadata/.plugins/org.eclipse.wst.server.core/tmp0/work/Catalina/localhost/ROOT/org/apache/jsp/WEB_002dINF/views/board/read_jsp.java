/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.35
 * Generated at: 2020-07-14 00:15:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class read_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("   href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("   src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("   src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write(" <script src=\"/resources/js/uploadfn.js\"  type=\"text/javascript\"></script>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("      <div class=\"row text-center\">\r\n");
      out.write("         <h1>글 자세히 보기</h1>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("            <label for=\"title\">제목</label> <input readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("               class=\"form-control\">\r\n");
      out.write("         </div>\r\n");
      out.write("\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("            <label for=\"title\">작성자</label> <input readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("               class=\"form-control\">\r\n");
      out.write("         </div>\r\n");
      out.write("\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("            <label for=\"title\">내용</label>\r\n");
      out.write("            <textarea readonly rows=\"5\" class=\"form-control\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("              <label>첨부파일</label>\r\n");
      out.write("              <ul class=\"uploadedList clearfix\">\r\n");
      out.write("                     \r\n");
      out.write("              </ul>\r\n");
      out.write("         </div>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("      </div><!-- class = row -->\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("         <div class=\"form-group\">\r\n");
      out.write("            <button class=\"btn btn-info\" id=\"reply_form\">댓글</button>\r\n");
      out.write("            <button class=\"btn btn-warning\" id=\"update\">수정</button>\r\n");
      out.write("            <button class=\"btn btn-danger\" id=\"delete\">삭제</button>\r\n");
      out.write("            <button class=\"btn btn-primary\" id=\"list\">목록</button>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- class = row  -->\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("         <div id=\"myCollapse\" class=\"collapse\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("               <label for=\"replyer\">작성자</label> <input class=\"form-control\"\r\n");
      out.write("                  id=\"replyer\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("               <label for=\"replytext\">내용</label> <input class=\"form-control\"\r\n");
      out.write("                  id=\"replytext\">\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("               <button id=\"replyInsertBtn\" class=\"btn btn-primary\">댓글 등록</button>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div id=\"replies\" class=\"row\">\r\n");
      out.write("         <div class=\"panel panel-success\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("               <span>rno : 3</span>, <span>작성자 : 홍길동</span> <span\r\n");
      out.write("                  class=\"pull-right\">2020년07월07일..</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("               <p>댓글 내용 입니다.</p>\r\n");
      out.write("               <button data-name=\"홍길동\" data-rno=\"3\" class=\"btn btn-warning btn-sm replymodify\">수정</button>\r\n");
      out.write("               <button data-rno=\"3\" class=\"btn btn-danger btn-sm replydelete\">삭제</button>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- class=row -->\r\n");
      out.write("\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("         <div data-backdrop=\"static\" id=\"myModal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\">\r\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("               <div class=\"modal-content\">\r\n");
      out.write("                  <div class=\"modal-header\">\r\n");
      out.write("                     <button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("                        aria-label=\"Close\">\r\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                     </button>\r\n");
      out.write("                     <h4 class=\"modal-rno\">rno 데이터</h4>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"modal-body\">\r\n");
      out.write("                     <p class=\"modal-replyer\">홍길동</p>\r\n");
      out.write("                     <input value=\"댓글내용입니다.\" class=\"form-control modal-replytext\"/>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"modal-footer\">\r\n");
      out.write("                     <button type=\"button\" class=\"btn btn-warning modal-update-btn\"\r\n");
      out.write("                        data-dismiss=\"modal\">댓글 수정</button>\r\n");
      out.write("                  </div>\r\n");
      out.write("               </div>\r\n");
      out.write("               <!-- /.modal-content -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.modal-dialog -->\r\n");
      out.write("         </div>\r\n");
      out.write("         <!-- /.modal -->\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("   </div>\r\n");
      out.write("   <!-- class = container -->\r\n");
      out.write("\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("   \r\n");
      out.write("      var bno = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("\r\n");
      out.write("      getList(bno);\r\n");
      out.write("\r\n");
      out.write("      $(document).ready(function() {\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          $.getJSON(\"/getAttach/\"+bno, function(result){\r\n");
      out.write("               for(var i=0; i<arr.length; i++) {\r\n");
      out.write("                 var str = '<li class=\"col-xs-4\">';\r\n");
      out.write("                 str += '<a href=\"/displayfile?filename='+getImageLink(arr[i])+'\">';\r\n");
      out.write("                 if(checkImage(arr[i])){\r\n");
      out.write("                        str += '<img src=\"/displayfile?filename='+zzzz.png+'\" />';\r\n");
      out.write("                     }else{\r\n");
      out.write("                         str += '<img sec=\"/resources/show.png\"/>'\r\n");
      out.write("                         }\r\n");
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("                 str += '</a>';\r\n");
      out.write("                 str += '<p class=\"orifilename\">';\r\n");
      out.write("                 \r\n");
      out.write("                 str +=  getOriginalName(arr[i]);\r\n");
      out.write("                 str += '</p>';\r\n");
      out.write("                 str += '</li>';    \r\n");
      out.write("\r\n");
      out.write("                 \r\n");
      out.write("                 $(\".uploadedlist\").append(str);              \r\n");
      out.write("                   }\r\n");
      out.write("                                       \r\n");
      out.write("              });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("         $(\"#replies\").on(\"click\", \".replydelete\", function() {\r\n");
      out.write("            var rno = $(this).attr(\"data-rno\");\r\n");
      out.write("\r\n");
      out.write("            $.ajax({\r\n");
      out.write("               type : \"delete\",\r\n");
      out.write("               url : \"/replies\",\r\n");
      out.write("               headers:{\r\n");
      out.write("                  \"content-Type\" : \"application/json\",\r\n");
      out.write("                  \"X-HTTP-Method-Override\" : \"DELETE\"\r\n");
      out.write("               },\r\n");
      out.write("               dataType : 'text',\r\n");
      out.write("               data : JSON.stringify({\r\n");
      out.write("                  rno : rno\r\n");
      out.write("               }),\r\n");
      out.write("               success : function(result){\r\n");
      out.write("                  getList(bno);\r\n");
      out.write("               }\r\n");
      out.write("            });\r\n");
      out.write("         });\r\n");
      out.write("\r\n");
      out.write("         $(\".modal-update-btn\").click(function(){\r\n");
      out.write("            var rno = $(\".modal-rno\").text();\r\n");
      out.write("            var replytext = $(\".modal-replytext\").val();\r\n");
      out.write("\r\n");
      out.write("            $.ajax({\r\n");
      out.write("               type : 'put',\r\n");
      out.write("               url : \"/replies/\"+rno,\r\n");
      out.write("               headers:{\r\n");
      out.write("                  \"content-Type\" : \"application/json\",\r\n");
      out.write("                  \"X-HTTP-Method-Override\" : \"PUT\"\r\n");
      out.write("               },\r\n");
      out.write("               dataType : 'text',\r\n");
      out.write("               data : JSON.stringify({\r\n");
      out.write("                  replytext : replytext\r\n");
      out.write("               }),\r\n");
      out.write("               success : function(result){\r\n");
      out.write("                  if(result === 'success'){\r\n");
      out.write("                     getList(bno);\r\n");
      out.write("                  }\r\n");
      out.write("               }\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("         });\r\n");
      out.write("\r\n");
      out.write("         $(\"#replies\").on(\"click\", \".replymodify\", function() {\r\n");
      out.write("            var rno = $(this).attr(\"data-rno\");\r\n");
      out.write("            var replyer = $(this).attr(\"data-name\");\r\n");
      out.write("            var replytext = $(this).prev().text();\r\n");
      out.write("\r\n");
      out.write("            $(\".modal-rno\").text(rno);\r\n");
      out.write("            $(\".modal-replyer\").text(replyer);\r\n");
      out.write("            $(\".modal-replytext\").val(replytext);\r\n");
      out.write("            \r\n");
      out.write("            $(\"#myModal\").modal(\"show\");\r\n");
      out.write("         });\r\n");
      out.write("\r\n");
      out.write("         $('#replyInsertBtn').click(function() {\r\n");
      out.write("            var replyer = $(\"#replyer\").val();\r\n");
      out.write("            var replytext = $(\"#replytext\").val();\r\n");
      out.write("\r\n");
      out.write("            $.ajax({\r\n");
      out.write("               type : 'post',\r\n");
      out.write("               url : '/replies',\r\n");
      out.write("               headers : {\r\n");
      out.write("                  \"Content-Type\" : \"application/json\",\r\n");
      out.write("                  \"X-HTTP-Method-Override\" : \"POST\"\r\n");
      out.write("               },\r\n");
      out.write("               dataType : \"text\",\r\n");
      out.write("               data : JSON.stringify({\r\n");
      out.write("                  bno : bno,\r\n");
      out.write("                  replyer : replyer,\r\n");
      out.write("                  replytext : replytext\r\n");
      out.write("               }),\r\n");
      out.write("               success : function(result) {\r\n");
      out.write("                  $(\"#replyer\").val(\"\");\r\n");
      out.write("                  $(\"#replytext\").val(\"\");\r\n");
      out.write("                  getList(bno);\r\n");
      out.write("               },\r\n");
      out.write("               error : function(request, error, status) {\r\n");
      out.write("                  console.log(error);\r\n");
      out.write("               }\r\n");
      out.write("            });\r\n");
      out.write("         });\r\n");
      out.write("\r\n");
      out.write("         $('#reply_form').click(function() {\r\n");
      out.write("            $(\"#myCollapse\").collapse(\"toggle\");\r\n");
      out.write("         });\r\n");
      out.write("\r\n");
      out.write("         $(\"#update\").click(function() {\r\n");
      out.write("            location.assign(\"/board/update/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\");\r\n");
      out.write("         });\r\n");
      out.write("\r\n");
      out.write("         $(\"#delete\").click(function() {\r\n");
      out.write("            location.assign(\"/board/delete/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\");\r\n");
      out.write("         });\r\n");
      out.write("\r\n");
      out.write("         $(\"#list\").click(function() {\r\n");
      out.write("            location.assign(\"/board/list\");\r\n");
      out.write("         });\r\n");
      out.write("      });\r\n");
      out.write("\r\n");
      out.write("      function getList(bno) {\r\n");
      out.write("\r\n");
      out.write("         var str = '';\r\n");
      out.write("\r\n");
      out.write("         $.getJSON(\"/replies/all/\" + bno,function(data) {\r\n");
      out.write("            for (var i = 0; i < data.length; i++) {\r\n");
      out.write("               str += '<div class=\"panel panel-success\"><div class=\"panel-heading\"><span>rno : '+ data[i][\"rno\"]+ '</span>, <span>작성자 : '+ data[i][\"replyer\"]+ '</span> <span class=\"pull-right\">'+ data[i][\"updatedate\"]+ '</span></div><div class=\"panel-body\"><p>'+ data[i][\"replytext\"]+ '</p><button data-rno=\"'+data[i][\"rno\"]+'\" class=\"btn btn-warning btn-sm replymodify\">수정</button><button data-rno=\"'+data[i][\"rno\"]+'\" class=\"btn btn-danger btn-sm replydelete\">삭제</button></div></div>';\r\n");
      out.write("               }\r\n");
      out.write("            $(\"#replies\").html(str);\r\n");
      out.write("         });\r\n");
      out.write("      }\r\n");
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
