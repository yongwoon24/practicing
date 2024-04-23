package refone.realexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import refone.realexam.vo.MemberVO;

public class MemberRefactDAO {
   public int add(MemberVO vo) throws SQLException, ClassNotFoundException { // C : Create 작업 메서드 만듬
      int result = 0;
      String query = "insert into members values(?,?,?,?,?)";

      Connection con = getConnection();
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, vo.getMemid());
      pstmt.setString(2, vo.getPassword());
      pstmt.setString(3, vo.getIname());
      pstmt.setString(4, vo.getAddress());
      pstmt.setString(5, vo.getPhone());

      result = pstmt.executeUpdate();
      resourceClose(null, pstmt, con);
      return result;
   }
   
   public int update(MemberVO vo) throws ClassNotFoundException, SQLException { // U : Update 작업 메서드 만듬
      int result = 0;
      String query = "update members SET address = ? WHERE memId = ?";
      Connection con = getConnection();
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, vo.getAddress());
      pstmt.setString(2, vo.getMemid());

      result = pstmt.executeUpdate();
      resourceClose(null, pstmt, con);
      return result;
   }
   
   public int delete(String memId) throws SQLException { // D : delete 작업 메서드 만듬
      int result = 0;
      String query = "delete from Members WHERE memId = ?";
      Connection con = getConnection();
      
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, memId);

      result = pstmt.executeUpdate();
      
      resourceClose(null, pstmt, con);
      return result;
   }
   
   // DB 연결을 담당하는 메서드(모든 메서드에서 공통적으로 들어가야 하기 때문에 분리)
   public Connection getConnection() {
      Connection con = null;
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "yongwoon24", "yongwoon24");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      }
      
      return con;
   }
   
   //자원을 반납(닫아주는) 역할의 메서드
   public void resourceClose(ResultSet rs, PreparedStatement pstmt, Connection con) {
      if( rs != null) { try { rs.close(); } catch (SQLException e) {e.printStackTrace();}}
      if( pstmt != null) { try { pstmt.close(); } catch (SQLException e) {e.printStackTrace();}}
      if( con != null) { try { con.close(); } catch (SQLException e) {e.printStackTrace();}}
   }
}