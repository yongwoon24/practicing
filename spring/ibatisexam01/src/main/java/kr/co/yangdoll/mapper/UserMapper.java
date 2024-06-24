package kr.co.yangdoll.mapper;

import java.util.List;

import kr.co.yangdoll.vo.UserVO;

public interface UserMapper {
	int addUser(UserVO vo);
	int delUser(String userId);
	int modifyUser(UserVO vo);
	UserVO getOne(String userId);
	List<UserVO> getAll();
	int getCount();
}
