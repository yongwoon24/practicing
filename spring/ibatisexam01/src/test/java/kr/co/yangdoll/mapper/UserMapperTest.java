package kr.co.yangdoll.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.yangdoll.vo.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class UserMapperTest {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	UserMapper yangdoll;
	
	@Test
	public void userMapperDiTest() {
		assertNotNull(yangdoll);
	}
	
	@Test
	public void userInsertTest() {
		UserVO testVo1 = new UserVO("test01", "testpwd01", "나테스트");
		UserVO testVo2 = new UserVO("test02", "testpwd02", "나테스트2");
		int result = yangdoll.addUser(testVo1);
		assertEquals(result, 1);
		int count = yangdoll.getCount();
		assertEquals(count, 1);

		result = yangdoll.addUser(testVo2);
		assertEquals(result, 1);
		count = yangdoll.getCount();
		assertEquals(count, 2);
		
		
		yangdoll.delUser(testVo1.getUserId());
		yangdoll.delUser(testVo2.getUserId());
	}
	
	@Test
	public void userModifyTest() {
		UserVO testVo1 = new UserVO("test01", "testpwd01", "나테스트");
		UserVO testVo2 = new UserVO("test02", "testpwd02", "나테스트2");
		int result = yangdoll.addUser(testVo1);
		assertEquals(result, 1);
		int count = yangdoll.getCount();
		assertEquals(count, 1);

		result = yangdoll.addUser(testVo2);
		assertEquals(result, 1);
		count = yangdoll.getCount();
		assertEquals(count, 2);
		
		testVo1.setUserPwd("비번1");
		testVo1.setUserName("이름1");
		result = yangdoll.modifyUser(testVo1);
		assertEquals(result, 1);
		assertEquals(count, 2);
		
		UserVO rtnVo = yangdoll.getOne(testVo1.getUserId());
		assertEquals(rtnVo, testVo1);
		
		rtnVo = yangdoll.getOne(testVo2.getUserId());
		assertEquals(rtnVo, testVo2);
		
		yangdoll.delUser(testVo1.getUserId());
		yangdoll.delUser(testVo2.getUserId());
	}
	
	@Test(expected = Exception.class)
	public void exceptionTest() {
		UserVO testVo1 = new UserVO("test01", "testpwd01", "나테스트1");
		int result = yangdoll.addUser(testVo1);
		UserVO testVo2 = new UserVO("test01", "testpwd02", "나테스트2");
		result = yangdoll.addUser(testVo2);
	}
	
}
