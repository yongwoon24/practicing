package kr.co.yangdoll.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.yangdoll.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml",
									"classpath:mybeans.xml"
									} )
public class BoardServiceTest {
	@Autowired
	ApplicationContext con;
	
	@Autowired  
	BoardService service;
	
	@Test
	@Ignore
	public void serviceBeanTest() {
		assertNotNull(service);
	}
	
	@Test
	public void insertBoardTest() {
		BoardVO vo = new BoardVO();
		vo.setContents("나는 서비스에서 만든 내용임!!!");
		vo.setTitle("서비스 제목");
		vo.setWriter("김서비스");
		int result = service.insertBoard(vo, true);
		assertEquals(result, 1);
		System.out.println("###########> " + vo.getBno());
	}
	
	
}
