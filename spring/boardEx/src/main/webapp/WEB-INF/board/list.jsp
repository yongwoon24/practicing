<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<style>
	table, th, td{
		border : 1px solid blue;
		border-collapse: collapse;
	}
	div.hiddenView{
		display : none;
	}
</style>
</head>
<body>
	<h1>게시글 보기</h1>
	<p><a href="/board/register">게시글쓰기</a></p>
	
	<div class="pageViewCount">
		<select name="viewCount" id="viewCount">
			<option value="10" s>10개씩 보기</option>
			<option value="20">20개씩 보기</option>
			<option value="30">30개씩 보기</option>
			<option value="50">50개씩 보기</option>
			<option value="70">70개씩 보기</option>
			<option value="100">100개씩 보기</option>
		</select>
	</div>
	

	<table>
		<tr>
			<th>번호</th>
			<th>게시글 제목</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>
	
	<c:forEach var="boardVo" items="${list}">
		<tr>
			<td>${boardVo.bno}</td>
			<td><a href="/board/get?bno=${boardVo.bno}">${boardVo.title}</a></td>
			<td>${boardVo.writer}</td> 
			<td>${boardVo.updatedate}</td> 
		</tr>
	</c:forEach>
	</table>
	<hr />
	<div id="pageList">
	    <p><a href="/board/list?pageNum=1&limit=">첫페이지</a> 
	    <c:if test="${pageInfo.prevPageBlock}">
    		<a href="/board/list?pageNum=${pageInfo.pageNumStart-1 }&limit=">이전페이지블럭</a>
		</c:if>

	    <c:forEach var="i" begin="${pageInfo.pageNumStart}" end="${pageInfo.pageNumEnd}">
	    	<c:choose>
			    <c:when test="${pageInfo.currentPage == i }">
			   		&nbsp;${i}&nbsp;
			    </c:when>
			    <c:otherwise>
					&nbsp;<a href="/board/list?pageNum=${i}&limit=">${i}</a>&nbsp;
			    </c:otherwise>
			</c:choose>
		</c:forEach>

	    <c:if test="${pageInfo.nextPageBlock}">
    		<a href="/board/list?pageNum=${ pageInfo.pageNumEnd+1}&limit=">다음페이지블럭</a>
		</c:if> 
	    
	    
	    <a href="/board/list?pageNum=${pageInfo.lastPage }&limit=">마지막페이지</a> <p>
	</div>
	<hr />
	<p><a href="/board/register">게시글쓰기</a></p>
	
	<script>
	$(document).ready(function(){
		let currentPage = ${pageInfo.currentPage};
		
		
		$('div.pageViewCount').addClass( "hiddenView"); //기본값으로 나타내지 않음
		if( currentPage == 1 ){ // 1page일 경우  
			$('div.pageViewCount').removeClass( "hiddenView"); //옵션상자 나타내기
		}
/*		
 		$('div.pageViewCount option').each(function(){ // 현재 페이지 개수가 선택되도록 반복구문 사용
			$(this).removeAttr("selected");
			if ( $(this).val() == ${pageInfo.pageLimit}){
				$(this).attr("selected", "selected");
			}
		});   주석의 복잡한 구문을 아래의 내용으로 간소화 함

*/		

		let optionSelect = { "10" : 0, "20" : 1, "30" : 2 , "50": 3, "70": 4, "100" : 5}
		$('div.pageViewCount option').removeAttr("selected");
		$('div.pageViewCount option')
			.eq(optionSelect[${pageInfo.pageLimit}+""])
			.attr("selected", "selected");
		
		
		
		
		$('#viewCount').on("change", function(){
			limit = $(this).val();
			location.href = "/board/list?pageNum=1&limit=" + limit;
		});
		
		$('#pageList a').on('click', function(){
			$(this).attr('href', $(this).attr('href')+${pageInfo.pageLimit}); 
		});
	});
	</script>
</body>
</html>