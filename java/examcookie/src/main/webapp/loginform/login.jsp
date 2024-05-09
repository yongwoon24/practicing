<%@page import="examcookie.examcookie.CookieBoxUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	/* if(id.equals(password)){
		
	}else{
		response.sendRedirect("./loginform.jsp");
	}
	 */
	if(!id.equals(password)){	response.sendRedirect("./loginform.jsp");	}
	 response.addCookie(CookieBoxUtil.createCookie("login", "Success", -1));
	 Cookie ck = CookieBoxUtil.createCookie("id", id, -1);
	 response.addCookie(ck);
	 out.print("<h1>로그인성공</h1>");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>