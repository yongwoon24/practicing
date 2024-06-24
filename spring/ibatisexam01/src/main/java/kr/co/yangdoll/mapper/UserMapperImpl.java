package kr.co.yangdoll.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.yangdoll.vo.UserVO;
@Repository
public class UserMapperImpl implements UserMapper {

	@Autowired
	SqlSession session;
	
	@Override
	public int addUser(UserVO vo) {
		return session.insert("kr.co.yangdoll.mapper.UserMapper.addUser", vo);
	}

	@Override
	public int delUser(String userId) {
		return session.update("kr.co.yangdoll.mapper.UserMapper.delUser", userId);
	}

	@Override
	public int modifyUser(UserVO vo) {
		return session.update("kr.co.yangdoll.mapper.UserMapper.modifyUser", vo);
	}

	@Override
	public UserVO getOne(String userId) {
		return session.selectOne("kr.co.yangdoll.mapper.UserMapper.getOne", userId);
	}

	@Override
	public List<UserVO> getAll() {
		return session.selectList("kr.co.yangdoll.mapper.UserMapper.getAll");
	}

	@Override
	public int getCount() {
		return session.selectOne("kr.co.yangdoll.mapper.UserMapper.getCount");
	}

}
