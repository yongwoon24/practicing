<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
	<!-- 아래의 form 내용은 로그인을 하지 않았을 때 나타나야 한다. login을 한 상태라면 나타나지 않거나 내용이 바꿔야 한다. -->
	  <c:if test="${empty sesVO}">
	    <form action="/login" method="post">
			<input type="text" name="memId" placeholder="user id"  required="required" />	<br />
			<input type="password" name="memPwd"  placeholder="password"  required />	<br />
			<button>로그인</button>
		</form>
      </c:if >
      <c:if test="${! empty sesVO}">
      		<p> 로그인 했어요..... </p>
      		<p>${ sesVO.memId }</p>
      		<p>${ sesVO.memName } 반갑습니다.</p>
      		<p><a href="/logout">로그아웃</a></p>
      </c:if > 

	  <c:if test="${sesVO.grade >= 5}"> <!-- id가 'aaaaa'일때 관리자라고 가정 -->
      		<p> 관리자입니다. </p>
      		<!-- 아래 내용은 관리자만 볼 수 있는 내용이다. -->
			<a href="/getAll">전체 회원 보기</a>
      </c:if >
	
	  <p>기본 정보들이 여기에 겁나게 나옴 000000001</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000002</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000003</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000004</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000005</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000006</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000007</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000008</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000009</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000010</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000011</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000012</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000013</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000014</p>
	  <p>기본 정보들이 여기에 겁나게 나옴 000000015</p>
	
	
</body>
</html>
