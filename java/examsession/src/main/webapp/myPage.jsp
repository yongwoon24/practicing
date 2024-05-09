<%@page import="examsession.memberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	memberVO vo = (memberVO)session.getAttribute("myInfo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	id : <%=vo.id %><br />
	pw : <%=vo.pwd %><br />
	주소 : <%=vo.addr %><br />
	이름 : <%=vo.name %><br />
</body>
</html>