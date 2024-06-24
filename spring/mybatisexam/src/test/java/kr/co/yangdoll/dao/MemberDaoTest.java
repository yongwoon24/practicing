package kr.co.yangdoll.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.yangdoll.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberDaoTest {
	
	@Autowired
	ApplicationContext context;

	@Autowired
	MemberDao dao;
	
	@Test
	@Ignore
	public void daoInjectTest() {
		assertNotNull(dao);
	}
	
	@Test
	public void insertTest() {
		MemberVO sampleDataVO = new MemberVO();
		int result = dao.insertMember(sampleDataVO);
		assertEquals(result, 1);
		MemberVO getMember = dao.selectGetId(sampleDataVO.getMemId());
		System.out.println(getMember);
		assertEquals(sampleDataVO, getMember);
	}
}
