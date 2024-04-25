package kr.co.yangdoll.firstweb.dao;

import java.sql.SQLException;
import java.util.List;

import kr.co.yangdoll.firstweb.vo.SimpleBoardVo;

public interface SimpleBoardDAO {
	int delete(long serNum) throws SQLException;
	int save(SimpleBoardVo vo) throws SQLException;
	int update(SimpleBoardVo vo) throws SQLException;
	
	int getCount() throws SQLException;
	SimpleBoardVo getBoardOne(long serNum) throws SQLException;
	List<SimpleBoardVo> getBoardList() throws SQLException;
	
}
