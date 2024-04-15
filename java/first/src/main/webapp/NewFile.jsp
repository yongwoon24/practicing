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
	String hakbun = request.getParameter("hakbun");
	String name = request.getParameter("name");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("eng"));
	int math = Integer.parseInt(request.getParameter("math"));
	
	int total = kor+eng+math;
	double avg = total/3.0;
%>
<p> 입력한 학번 : <%= hakbun %> </p>
<p> 입력한 이름 : <%= name %> </p>
<p> 입력한 국어점수 : <%= kor %> </p>
<p> 입력한 영어점수 : <%= eng %> </p>
<p> 입력한 수학점수 : <%= math %> </p>
<p> 총 점수 : <%= total %> </p>
<p> 평균 점수 : <%= avg %> </p>
</body>
</html>