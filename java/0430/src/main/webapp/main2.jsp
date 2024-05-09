<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메인의 첫 내용</h1>
	
	<%
		request.setAttribute("irum", "이름");
		request.setAttribute("age", 19);
	%>
	
	<jsp:include page="sub2.jsp">
		<jsp:param value="yangdoll" name="iname"/>
		<jsp:param value="19" name="age"/>
	</jsp:include>
	<h1>메인의 마지막 내용</h1>
	
</body>
</html>