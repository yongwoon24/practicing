<%@page import="examsession.memberVO"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="javax.print.attribute.HashAttributeSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%
	Map<String, memberVO> members = new HashMap<String, memberVO>();
	members.put("yang", new memberVO("yang", "1234", "suwon", "dori"));
	members.put("yang", new memberVO("park", "1234", "busan", "bori"));
	members.put("yang", new memberVO("hong", "1234", "seoul", "joo"));
	
	String message = "";
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	System.out.print("회원존재유무" + members.containsKey(id));
	if(members.containsKey(id)){
		memberVO vo = members.get(id);
		if(pwd.equals(vo.pwd)){
			session.setAttribute("login", "ok");
			session.setAttribute("myInfo", vo);
			session.setMaxInactiveInterval(60*10);
		}else{
			message = "비밀번호가 틀립니다.";
		}
	}else{
		message = "존재하지 않는 id입니다.";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 요청에 관한 정보 : <%= message %></h1>
	<a href="myPage.jsp">내정보 보기</a>
</body>
</html>