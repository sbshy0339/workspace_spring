<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
   <script src="/resources/js/uploadfn.js" type="text/javascript"></script>
<title>Insert title here</title>
<style type="text/css">

      .fileDrop{
       width: 80%;
       height: 200px;
       border: 1px solid red;
       margin: auto;
       
      }
      
      .uploadedList{
         margin-top: 50px;
      
      }
      
      
      .uploadedList li{
          list-style: none;
      }
      
      .orifilename{
         overflow: hidden;
         white-space: nowrap;
         text-overflow: ellipsis;
      }

</style>
</head>
<body>
   
<div class="container">
  <div class="row text-center"></div>

  <div class="row">
   <h1>글 수정</h1>
    <form action="/board/update" method="post">
        <input type="hidden" name="bno" value="${vo.bno}">
         <div class="form-group">
          <label for="title">제목</label>
          <input value="${vo.title}" name="title" id="title" class="form-control">
          
         </div>   
         
         <div class="form-group">
            <label for="writer">작성자</label>
            <input value="${vo.writer}" name="writer" id="writer" class="form-control">
         </div>
         
         <div class="form-group">
            <label for="content">내용</label>
            <textarea class="form-control" id="content" rows="5" name="content">${vo.content}</textarea>            
         </div>
         <div class="form-group">
         <label>업로드할 파일을 드랍시키세요.</label>
         
         </div>
    </form>
    <div class="form-group">
        <button class="btn btn-primary" id="updatebtn">수정</button>
        <button class="btn btn-primary" id="listbtn">목록</button>
    </div>
    </div>
</div>

<script type="text/javascript">

  $(document).ready(function(){
	  $.getJSON("/getAttach/"+bno, function(result){
          for(var i=0; i<arr.length; i++) {
            var str = '<li class="col-xs-4">';
            str += '<a href="/displayfile?filename='+getImageLink(arr[i])+'">';
            if(checkImage(arr[i])){
                   str += '<img src="/displayfile?filename='+zzzz.png+'" />';
                }else{
                    str += '<img sec="/resources/show.png"/>'
                    }

            
            str += '</a>';
            str += '<p class="orifilename">';
            
            str +=  getOriginalName(arr[i]);
            str += '</p>';
            str += '</li>';    

            
            $(".uploadedlist").append(str);              
              }
                                  
         });
      
      $("#updatebtn").click(function(){
          $("form").submit();     
      });
      $("#listbtn").click(function(){
         location.assign("/board/list");
      });
   });
</script>

</body>
</html>