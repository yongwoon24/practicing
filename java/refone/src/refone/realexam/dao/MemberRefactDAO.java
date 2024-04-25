package refone.realexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import refone.realexam.DbConUtil;
import refone.realexam.vo.MemberVO;

public class MemberRefactDAO {
   public int add(MemberVO vo) throws SQLException{ // C : Create 작업 메서드 만듬
      int result = 0;
      String query = "insert into members values(?,?,?,?,?)";

      Connection con = DbConUtil.getConnection();
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, vo.getMemid());
      pstmt.setString(2, vo.getPassword());
      pstmt.setString(3, vo.getIname());
      pstmt.setString(4, vo.getAddress());
      pstmt.setString(5, vo.getPhone());

      result = pstmt.executeUpdate();
      DbConUtil.resourceClose(null, pstmt, con);
      return result;
   }
   
   public int update(MemberVO vo) throws SQLException { // U : Update 작업 메서드 만듬
      int result = 0;
      String query = "update members SET address = ? WHERE memId = ?";
      Connection con = DbConUtil.getConnection();
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, vo.getAddress());
      pstmt.setString(2, vo.getMemid());

      result = pstmt.executeUpdate();
      DbConUtil.resourceClose(null, pstmt, con);
      return result;
   }
   
   public int delete(String memId) throws SQLException { // D : delete 작업 메서드 만듬
      int result = 0;
      String query = "delete from Members WHERE memId = ?";
      Connection con = DbConUtil.getConnection();
      
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, memId);

      result = pstmt.executeUpdate();
      
      DbConUtil.resourceClose(null, pstmt, con);
      return result;
   }
   
   
   public int getCount() throws SQLException{
      int result = 0;
      String query = "select  count(*) numCount from members";
      ResultSet rs = null;
      Connection con = DbConUtil.getConnection();
      PreparedStatement pstmt = con.prepareStatement(query);
      rs = pstmt.executeQuery();
      while( rs.next() ) {
         result = rs.getInt("numCount");
      }
      
      DbConUtil.resourceClose(rs, pstmt, con);
      return result;
   }
   
   public List<MemberVO> getListAll() throws SQLException{
      List<MemberVO> list = new ArrayList<MemberVO>();
      String query = "select  * from members";
      ResultSet rs = null;
      Connection con = DbConUtil.getConnection();
      PreparedStatement pstmt = con.prepareStatement(query);
      rs = pstmt.executeQuery();
      while( rs.next() ) {
         MemberVO vo = new MemberVO();
         vo.setMemid(   rs.getString("memId") /*1열(memId열)의 데이터를 가져온다 */  ); // 넣어준다
         vo.setPassword( rs.getString("password") );
         vo.setIname( rs.getString("Iname") );
         vo.setAddress( rs.getString("address") );
         vo.setPhone( rs.getString("phone") );
         list.add(vo);
      }
      
      DbConUtil.resourceClose(rs, pstmt, con);
      return list;
   }
   
   public MemberVO getOne(String memId) throws SQLException{
      MemberVO vo = new MemberVO();
      String query = "select  * from members where memId = ?";
      ResultSet rs = null;
      Connection con = DbConUtil.getConnection();
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, memId);
      rs = pstmt.executeQuery();
      
      while( rs.next() ) {
         vo.setMemid(   rs.getString("memId") /*1열(memId열)의 데이터를 가져온다 */  ); // 넣어준다
         vo.setPassword( rs.getString("password") );
         vo.setIname( rs.getString("Iname") );
         vo.setAddress( rs.getString("address") );
         vo.setPhone( rs.getString("phone") );

      }
      
      DbConUtil.resourceClose(rs, pstmt, con);
      return vo;
   }
   
   public List<MemberVO> getListAddress(String address) throws SQLException{
      List<MemberVO> list = new ArrayList<MemberVO>();
      String query = "select  * from members where address = ?";
      ResultSet rs = null;
      Connection con = DbConUtil.getConnection();
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, address);
      rs = pstmt.executeQuery();
      while( rs.next() ) {
         MemberVO vo = new MemberVO();
         vo.setMemid(   rs.getString("memId") /*1열(memId열)의 데이터를 가져온다 */  ); // 넣어준다
         vo.setPassword( rs.getString("password") );
         vo.setIname( rs.getString("Iname") );
         vo.setAddress( rs.getString("address") );
         vo.setPhone( rs.getString("phone") );
         list.add(vo);
      }
      
      DbConUtil.resourceClose(rs, pstmt, con);
      return list;
   }
   

}