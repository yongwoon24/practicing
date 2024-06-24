package kr.co.yangdoll.Dao;

import kr.co.yangdoll.vo.UserVO;

public interface UserDao {
	UserVO selectOne(String userId);
	
	int insertUser(UserVO vo);
	
	int updateUser(UserVO vo);
}
