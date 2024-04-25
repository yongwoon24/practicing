<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시판 글 쓰기</h1>
    <form action="post_process.php" method="post">
        <label for="title">제목:</label><br>
        <input type="text" id="title" name="title" required><br>
        <label for="irum">이름:</label><br>
        <input type="text" id="irum" name="irum" required><br>
        <label for="password">비밀번호:</label><br>
        <input type="text" id="password" name="password" required><br><br>
        <label for="content">내용:</label><br>
        <textarea id="content" name="content" rows="4" cols="50" required></textarea><br><br>
        <input type="submit" value="글 작성">
    </form>
</body>
</html>