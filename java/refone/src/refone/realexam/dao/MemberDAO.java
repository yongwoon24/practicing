package refone.realexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import refone.realexam.vo.MemberVO;

public class MemberDAO {
	public int add(MemberVO vo) throws SQLException, ClassNotFoundException { // C : Create 작업 메서드 만듬
	      int result = 0;
	      String query = "insert into members values(?,?,?,?,?)";

	      Class.forName("oracle.jdbc.driver.OracleDriver"); // DB연결 드라이버 로딩 <= DB연결 프로그램 실행
	      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "yongwoon24", "yongwoon24"); // DB서버에
	                                                                                          // 접속
	      PreparedStatement pstmt = con.prepareStatement(query);
	      pstmt.setString(1, vo.getMemid());
	      pstmt.setString(2, vo.getPassword());
	      pstmt.setString(3, vo.getIname());
	      pstmt.setString(4, vo.getAddress());
	      pstmt.setString(5, vo.getPhone());
	      result = pstmt.executeUpdate();
	      pstmt.close();
	      con.close();

	      return result;
	   }
	public int update(MemberVO vo) throws ClassNotFoundException, SQLException { // U : Update 작업 메서드 만듬
	      int result = 0;
	      String query = "update members SET iName = ?, address = ? WHERE memid = ?";
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "yongwoon24", "yongwoon24");
	      PreparedStatement pstmt = con.prepareStatement(query);
	      pstmt.setString(1, vo.getIname());
	      pstmt.setString(2, vo.getAddress());
	      pstmt.setString(3, vo.getMemid());

	      result = pstmt.executeUpdate();
	      pstmt.close();
	      con.close();

	      return result;
	   }
	public int delete(String memid) throws ClassNotFoundException, SQLException { // D : delete 작업 메서드 만듬
	      int result = 0;
	      String query = "delete from members WHERE memid = ?";
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "yongwoon24", "yongwoon24");
	      PreparedStatement pstmt = con.prepareStatement(query);
	      pstmt.setString(1, memid);

	      result = pstmt.executeUpdate();
	      pstmt.close();
	      con.close();

	      return result;
	   }
}
