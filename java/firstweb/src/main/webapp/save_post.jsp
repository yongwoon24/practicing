<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.SQLException" %>
<%@ page import="kr.co.yangdoll.firstweb.dao.SimpleBoardDAO" %>
<%@ page import="kr.co.yangdoll.firstweb.dao.SimpleBoardDAOJdbcImpl" %>
<%@ page import="kr.co.yangdoll.firstweb.vo.SimpleBoardVo" %>
<%
    // 폼에서 전달된 데이터 가져오기
    String title = request.getParameter("title");
    String irum = request.getParameter("irum");
    String password = request.getParameter("password");
    String content = request.getParameter("content");
    
    // 게시글 정보 생성
    SimpleBoardVo vo = new SimpleBoardVo();
    vo.setTitle(title);
    vo.setIrum(irum);
    vo.setPassword(password);
    vo.setContents(content);
    // 다른 필요한 속성들 설정
    
    // DAO 생성
    SimpleBoardDAO dao = new SimpleBoardDAOJdbcImpl();
    try {
        // 게시글 저장
        int result = dao.save(vo);
        if (result > 0) {
            out.println("게시글이 성공적으로 저장되었습니다.");
        } else {
            out.println("게시글 저장에 실패했습니다.");
        }
    } catch (SQLException e) {
        out.println("오류 발생: " + e.getMessage());
    }
%>
