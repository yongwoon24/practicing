package kr.co.yangdoll.Dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.yangdoll.vo.UserVO;
@Repository
public class UserDaoMybatis implements UserDao {

	@Autowired
	SqlSession session;
	
	
	@Override
	public UserVO selectOne(String userId) {
		return session.selectOne("usermapper.selectOne", userId);
	}

	@Override
	public int insertUser(UserVO vo) {
		return session.insert("usermapper.insertUser", vo);
	}

	@Override
	public int updateUser(UserVO vo) {
		return session.update("usermapper.updateUser", vo);
	}

}
