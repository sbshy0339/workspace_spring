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
<title>Insert title here</title>
</head>
<body>
   <button>at2 test</button>
   
   <script type="text/javascript">



    var arr = ['hello', 'world', 'good', 'morning'];

            $(document).ready(function(){
  	        $("button").click(function(){
  	        	 $.ajax({
  	               type : 'post',
  	               url : '/at2',
  	               traditional : true,
  	               dataType : 'text',
  	               data:{
  	                  'arr' : arr
  	               },
  	               success : function(result){
  	                  console.log(result);
                              
  	               },
  	               error :  function(request, status, error){
  	  	               console.log(error);
  	            }   
           });
  	  });
            });           
   </script>

</body>
</html>