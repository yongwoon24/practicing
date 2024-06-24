<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세 게시글 보기</h1>
	<form action="/board/modify" method="post" >
		게시글 번호 : <input type="text" name="bno" value="${vo.bno }" readonly="readonly"/><br />
		제목 :  <input type="text" name="title" value="${vo.title }" /><br />
		
		내용 <br />
		<textarea name="contents"  cols="30" rows="10">${vo.contents }</textarea><br />
		
		작성자 :  <input type="text" name="writer" value="${vo.writer }" /><br />
		
		최초작성일 : <input type="text"  value="${vo.regdate }" readonly="readonly" /><br />
		
		최근수정일 : <input type="text"  value="${vo.updatedate }" readonly="readonly" /><br />
		
		<button>수정하기</button>
	</form>

</body>
</html>