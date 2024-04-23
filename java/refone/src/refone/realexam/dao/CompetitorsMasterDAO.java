package refone.realexam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import refone.realexam.vo.CompetitorsMasterVo;

public class CompetitorsMasterDAO {

   // 전체 저장된 자료의 개수 읽어오기(Read == select)
   public int getCount() throws ClassNotFoundException, SQLException {
      int result = 0;

      String query = "select count(*)  from  CompetitorsMaster";
      ResultSet rs = null;
      Class.forName("oracle.jdbc.driver.OracleDriver"); // DB연결 드라이버 로딩 <= DB연결 프로그램 실행
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "yangdoll", "12341234"); // DB서버에
                                                                                          // 접속
      PreparedStatement pstmt = con.prepareStatement(query);
      rs = pstmt.executeQuery();
      while (rs.next()) {
         result = rs.getInt(1);
      }
      return result;
   }

   // 저장된 자료들 중에서 한 줄의 자료를 DB에서 읽어오기
   public CompetitorsMasterVo getOne(String competCode) throws ClassNotFoundException, SQLException {
      CompetitorsMasterVo resultVo = null;
      String query = "select *  from  CompetitorsMaster where competCode = ?";
      ResultSet rs = null;
      Class.forName("oracle.jdbc.driver.OracleDriver"); // DB연결 드라이버 로딩 <= DB연결 프로그램 실행
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "yangdoll", "12341234"); // DB서버에
                                                                                          // 접속
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, competCode);
      rs = pstmt.executeQuery();
      while (rs.next()) {
         resultVo = new CompetitorsMasterVo();
         resultVo.setAddress(rs.getString("Address"));
         resultVo.setCompetCode(rs.getString("CompetCode"));
         resultVo.setCompetName(rs.getString("CompetName"));
         resultVo.setNumOfEmployees(rs.getInt("NumOfEmployees"));
         resultVo.setPhone1(rs.getString("Phone1"));
         resultVo.setPhone2(rs.getString("Phone2"));
         resultVo.setYearSales(rs.getLong("YearSales"));
      }
      return resultVo;
   }

   // 저장된 자료들 전부를 DB에서 읽어오기
   public List<CompetitorsMasterVo> getListAll() throws ClassNotFoundException, SQLException {
      List<CompetitorsMasterVo> resultListVo = null;
      String query = "select *  from  CompetitorsMaster";
      ResultSet rs = null;
      Class.forName("oracle.jdbc.driver.OracleDriver"); // DB연결 드라이버 로딩 <= DB연결 프로그램 실행
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "yangdoll", "12341234"); // DB서버에
                                                                                          // 접속
      PreparedStatement pstmt = con.prepareStatement(query);
      rs = pstmt.executeQuery();
      resultListVo = new ArrayList<CompetitorsMasterVo>(); //추가됨
      while (rs.next()) {
         CompetitorsMasterVo vo = new CompetitorsMasterVo(); //추가됨
         vo.setAddress(rs.getString("Address"));
         vo.setCompetCode(rs.getString("CompetCode"));
         vo.setCompetName(rs.getString("CompetName"));
         vo.setNumOfEmployees(rs.getInt("NumOfEmployees"));
         vo.setPhone1(rs.getString("Phone1"));
         vo.setPhone2(rs.getString("Phone2"));
         vo.setYearSales(rs.getLong("YearSales"));
         resultListVo.add(vo); //추가됨
      }
      return resultListVo;
   }

   public int add(CompetitorsMasterVo vo) throws SQLException, ClassNotFoundException { // C : Create 작업 메서드 만듬
      int result = 0;
      String query = "insert into CompetitorsMaster values(?,?,?,?,?,?,?)";

      Class.forName("oracle.jdbc.driver.OracleDriver"); // DB연결 드라이버 로딩 <= DB연결 프로그램 실행
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "yangdoll", "12341234"); // DB서버에
                                                                                          // 접속
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, vo.getCompetCode());
      pstmt.setString(2, vo.getCompetName());
      pstmt.setString(3, vo.getAddress());
      pstmt.setLong(4, vo.getYearSales());
      pstmt.setInt(5, vo.getNumOfEmployees());
      pstmt.setString(6, vo.getPhone1());
      pstmt.setString(7, vo.getPhone2());
      result = pstmt.executeUpdate();
      return result;
   }

   public int update(CompetitorsMasterVo vo) throws ClassNotFoundException, SQLException { // U : Update 작업 메서드 만듬
      int result = 0;
      String query = "update CompetitorsMaster SET competName = ?, address = ? WHERE competCode = ?";
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "yangdoll", "12341234");
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, vo.getCompetName());
      pstmt.setString(2, vo.getAddress());
      pstmt.setString(3, vo.getCompetCode());

      result = pstmt.executeUpdate();
      return result;
   }

   public int delete(String competCode) throws ClassNotFoundException, SQLException { // D : delete 작업 메서드 만듬
      int result = 0;
      String query = "delete from CompetitorsMaster WHERE competCode = ?";
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "yangdoll", "12341234");
      PreparedStatement pstmt = con.prepareStatement(query);
      pstmt.setString(1, competCode);

      result = pstmt.executeUpdate();
      return result;
   }
}