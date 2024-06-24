package kr.co.yangdoll;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.yangdoll.Dao.UserDao;
import kr.co.yangdoll.vo.UserVO;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSelectOne() {
        String userId = "test_user1";
        UserVO user = userDao.selectOne(userId);
        assertEquals("test_user", user.getUserName());
    }
    @Test
    public void testInsertUser() {
        UserVO user = new UserVO();
        user.setUserId("test_user");
        user.setUserPwd("test_password");
        user.setUserName("Test User");

        int result = userDao.insertUser(user);
        assertEquals(1, result);
    }

    @Test
    public void testUpdateUser() {
        String userName = "Test";
        UserVO user = new UserVO();
        user.setUserId("test_user");
        user.setUserPwd("new_password");
        user.setUserName(userName);

        int result = userDao.updateUser(user);
        assertEquals(1, result); 
    }
}
