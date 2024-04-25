package kr.co.yangdoll.firstweb.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import kr.co.yangdoll.firstweb.vo.SimpleBoardVo;
import kr.co.yangdoll.firstweb.DbConUtil;

public class SimpleBoardDAOJdbcImpl implements SimpleBoardDAO{

	@Override
	public int delete(long serNum) throws SQLException {
		int result = 0;
		String query = "delete from simpleboards where serNum = ?";
		Connection con = DbConUtil.getConnection();
	    PreparedStatement pstmt = con.prepareStatement(query);
	    pstmt.setLong(1, serNum);
	    
	    result = pstmt.executeUpdate();
	    DbConUtil.resourceClose(pstmt, con);
	    
		return result;
	}

	@Override
	public int save(SimpleBoardVo vo) throws SQLException {
		int result = 0;
		String query = "insert into simpleboards values(?,?,?,?,?,0,sysdate())";
		Connection con = DbConUtil.getConnection();
	    PreparedStatement pstmt = con.prepareStatement(query);
	    pstmt.setLong(1, vo.getSerNum());
	    pstmt.setString(2, vo.getTitle());
	    pstmt.setString(3, vo.getContents());
	    pstmt.setString(4, vo.getIrum());
	    pstmt.setString(5, vo.getPassword());
	    
	    result = pstmt.executeUpdate();
	    DbConUtil.resourceClose(pstmt, con);
	    
	    return result;
	}

	@Override
	public int update(SimpleBoardVo vo) throws SQLException {
		int result = 0;
		String query = "update simpleboards set title = ?, content = ?, password = ? where serNum = ?";
		Connection con = DbConUtil.getConnection();
	    PreparedStatement pstmt = con.prepareStatement(query);
	    
	    pstmt.setString(1, vo.getTitle());
	    pstmt.setString(2, vo.getContents());
	    pstmt.setString(3, vo.getPassword());
	    pstmt.setLong(4, vo.getSerNum());
	    
	    result = pstmt.executeUpdate();
	    DbConUtil.resourceClose(pstmt, con);
	    
	    return result;
	}

	@Override
	public int getCount() throws SQLException {
		int result = 0;
		return result;
	}

	@Override
	public SimpleBoardVo getBoardOne(long serNum) throws SQLException {
		SimpleBoardVo boardVo = null;
		return boardVo;
	}

	@Override
	public List<SimpleBoardVo> getBoardList() throws SQLException {
		List<SimpleBoardVo> list = null;
		return list;
	}

}
