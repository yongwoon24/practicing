package refone.realexam.dao;

import java.sql.SQLException;
import java.util.List;

import refone.realexam.vo.MemberVO;

public interface MemberDaoInter {
	int add(MemberVO vo) throws SQLException;
	int update(MemberVO vo) throws SQLException;
	int delete(String memId) throws SQLException;
	int getCount() throws SQLException;
	List<MemberVO> getListAll() throws SQLException;
	MemberVO getOne(String memId) throws SQLException;
	List<MemberVO> getListAddress(String address) throws SQLException;
}

