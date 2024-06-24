package kr.co.yangdoll.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.co.yangdoll.vo.MemberVO;

@Repository
public class MemberDAOJdbc implements MemberDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	RowMapper<MemberVO> rowMapper = new RowMapper<MemberVO>() {

		@Override
		public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			MemberVO vo = new MemberVO();
			vo.setHireDate(rs.getString("HireDate"));
			vo.setLastDate(rs.getString("LastDate"));
			vo.setMemAddr(rs.getString("MemAddr"));
			vo.setMemEmail(rs.getString("MemEmail"));
			vo.setMemId(rs.getString("MemId") );
			vo.setMemName(rs.getString("MemName"));
			vo.setMemPwd(rs.getString("MemPwd"));
			vo.setGrade(rs.getInt("Grade"));
			return vo;
		}
		
	};

	@Override
	public int memberInsert(MemberVO vo) {
		 int result = jdbcTemplate.update( "insert into members values( ?, ?, ?, ?, ?, sysdate, sysdate, 1)", 
				 vo.getMemId(), 				 vo.getMemPwd(),				 vo.getMemName() , 
				 vo.getMemEmail(), 				 vo.getMemAddr()   );
		return result;
	}
	
	@Override
	public int memberDelete( String memId) {
		return jdbcTemplate.update("delete from members where memId = ?",memId);
	}

	@Override
	public List<MemberVO> getAll() {
		return jdbcTemplate.query("select *  from members", 
					rowMapper);
	}

	@Override
	public MemberVO getMember(String memId) {
		MemberVO vo = null;
		try {
			vo = jdbcTemplate.queryForObject(	"select * from members where MEMID = ?", 
					new Object[] {memId}, rowMapper );
		}catch (EmptyResultDataAccessException e) {
			return null;
		}
		return  vo;
	}

}
