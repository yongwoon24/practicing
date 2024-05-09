<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String iname = request.getParameter("iname");
	String age = request.getParameter("age");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>메인투.jsp에서 파라미터로 넘겨준 자료 받기</h3>
	<p>파라미터로 넘겨준 이름 : <%= iname %></p>
	<p>파라미터로 넘겨준 이름 : <%= age + 10%></p>
	
	<hr />
	<p>속성으로 넘겨준 이름 : ${irum}</p>
	<p>속성으로 넘겨준 이름 : ${age + 10}</p>
	<hr />
	
</body>
</html>