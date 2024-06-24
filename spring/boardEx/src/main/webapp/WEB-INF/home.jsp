<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

</head>
<body>
	<h1>Hello world!</h1>

	<P>
		<a href="/board/list?pageNum=1&limit=10">게시글 보기</a>
	</P>
	
	<div id="result"></div>
	
	<button id="getBoardBtn">21번자료 가져오기</button>
	<script>
	$(document).ready(function(){
		$('#getBoardBtn').click(function(){
			let innnerGetHtml = "";
			$.ajax({ 
				url : '/data/getVo',
		        type : 'GET',
		        dataType : "json",
		        contentType:"application/json",
		        data : {
		        	dataNum : 21
		        },
		        success : function(data){
		        	innnerGetHtml += "<p> 게시글번호 : " + data['bno'] +"</p>"
		        	innnerGetHtml += "<p> 제목 : " + data['title'] +"</p>"
		        	innnerGetHtml += "<p> 내용 : " + data['content'] +"</p>"
		        	innnerGetHtml += "<p> 작성자 : " + data['writer'] +"</p>"
		        	innnerGetHtml += "<p> 작성일 : " + data['regdate']+"</p>"
		            $("#result").html(innnerGetHtml);
		        }
			});
				
		});
	});
</script>
</body>
</html>
