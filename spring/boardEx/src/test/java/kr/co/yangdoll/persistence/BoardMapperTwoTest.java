package kr.co.yangdoll.persistence;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.yangdoll.domain.BoardVO;
import kr.co.yangdoll.domain.SearchVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTwoTest {
	@Autowired
	ApplicationContext context;
	
	//테스트하고자하는 클래스를 필드로 선언(클래스의 상위 인터페이스가 있다면 인터페이스 타입으로 선언)
	@Autowired
	BoardMapperTwo mtwo;
	
	@Test
	public void beanTest() {
		assertNotNull(context);
	}
	
	@Test //비권장
	public void getMultiConBoardTest() {
		SearchVO vo = new SearchVO();
		vo.setSearchNum(10);
		vo.setSearchTitle("aaa");
		System.out.println(mtwo.getMultiConBoard(vo));
	}
	
	@Test
	public void getMultiConBoardTwoTest() {
		HashMap<String, Object> data = new HashMap();
		data.put("searchNum", 10);
		data.put("searchTitle", "aaa");
		System.out.println("=====>"+mtwo.getMultiConBoardTwo(data));
	}
	
	@Test
	public void getMultiConBoardThreeTest() {
		
		System.out.println("==333===>"+mtwo.getMultiConBoardThree(10, "aaa"));
	}
	
	@Test
	public void getConditionWhereList() {
		HashMap vo = new HashMap();
		vo.put("searchTitle", null);
		vo.put("searchNum", 10);
		
		List<BoardVO> list = mtwo.getConditionWhereList(vo);
		
		System.out.println("############ =>" + list.size());
	}
	
	@Test
	public void getConditionTrimList() {
		HashMap vo = new HashMap();
		vo.put("searchTitle", null);
		vo.put("searchNum", null);
		SearchVO vo2 = new SearchVO();
		vo2.setSearchNum(10);
		vo2.setSearchTitle("아");
		List<BoardVO> list = mtwo.getConditionTrimList(vo2);
		
		System.out.println("############ =>" + list.size());
	}
}
