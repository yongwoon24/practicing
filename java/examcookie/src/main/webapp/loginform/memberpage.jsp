<%@page import="examcookie.examcookie.CookieBoxUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	CookieBoxUtil cbu = new CookieBoxUtil(request);
	if(cbu.exists("login")){
%>
	<h1>이 페이지는 회원 전용입니다</h1>
	<h1>이 페이지는 회원 전용입니다</h1>
<%  
	}else{
%>
	
	<p>로그인하세요.</p>
	<a href="./loginform.jsp">로그인하기</a>
<%
	}
%>	
</body>
</html>