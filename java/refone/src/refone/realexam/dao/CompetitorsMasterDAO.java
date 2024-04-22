package refone.realexam.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import refone.realexam.vo.CompetitorsMasterVO;

public class CompetitorsMasterDAO {
	public int add(CompetitorsMasterVO vo) throws SQLException, ClassNotFoundException {
		String query = "insert into CompetitorsMaster values(?,?,?,?,?,?,?)";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("url","id","pw");
		
		PreparedStatement pstmt = con.prepareStatement(query);
		
		int result = pstmt.executeUpdate();
		return result;
	}
	
	public int getCount() {
		String query = "select count(*) from CompetitorsMaster";
		return 0;
	}
	
	public void getOne(int c_code) {
		String query = "select * from CompetitorsMaster where c_code = ?";
	}
	
	public List<CompetitorsMasterVO> getListAll() {
		List<CompetitorsMasterVO> resultVO = null;
		String query = "select * from CompetitorsMaster";
		return resultVO;
	}
	
	public void update(CompetitorsMasterVO vo) {
		String query = "update CompetitorsMaster set 컬럼 = ? where c_code = ? ";
	}

	public int delete(int c_code) throws ClassNotFoundException, SQLException {
		String query = "delete * from CompetitorsMaster where c_code = ? ";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("url","id","pw");
		
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, c_code);
		
		int result = pstmt.executeUpdate();
		return result;
	}
}
