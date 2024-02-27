<%@ page language="java" 
		 contentType="text/html; charset=ISO-8859-1"
    	 pageEncoding="ISO-8859-1"
    	 import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <style>
      
    </style>
<title>Insert title here</title>
</head>
<body>
<h2>
 <%
 	String msg = (String)request.getAttribute("msg");
	out.println(msg);
 %>
 </h2>
 <jsp:include page="index.html"/>
				
</body>
</html>