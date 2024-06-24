package kr.co.yangdoll.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kr.co.yangdoll.vo.MemberVO;

public class MemberDaoMybatis implements MemberDao {

	@Autowired
	SqlSession session;
	
	@Override
	public List<MemberVO> selectAll() {
		return session.selectList("membermapper.selectAll");
	}

	@Override
	public MemberVO selectGetId(String memId) {
		return session.selectOne("membermapper.selectGetId", memId);
	}

	@Override
	public int insertMember(MemberVO vo) {
		return session.update("membermapper.insertMember", vo);
	}

}
