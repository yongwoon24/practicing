package kr.co.yangdoll.persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.yangdoll.domain.BoardVO;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTest {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	BoardMapper mapper;
	
	@Test
	@Ignore
	public void mapperDiTest() {
		assertNotNull(mapper);
	}
	
	@Test
	public void insertBoardTest() {
		int initCount = mapper.getCount(); //현재 테이블에 저장된 자료의 개수 얻어오기
		// 테스트용 입력할 자료 만들기
		BoardVO inData1 = new BoardVO();
		inData1.setTitle("새로 입력한 자료 제목11");
		inData1.setContents("새로 입력한 내용 자료 1111");
		inData1.setWriter("나새로미");
		
		int result = mapper.insertBoard(inData1);
		assertEquals(1, result);
		int afterCount = mapper.getCount();
		assertEquals(initCount+1, afterCount);
		
		System.out.println("=====게시판 번호=======> " + inData1.getBno() ); //null 또는 0이 나온다.
		
	}
	
	@Test
	public void insertBoardGetBnoTest() {
		int initCount = mapper.getCount(); //현재 테이블에 저장된 자료의 개수 얻어오기
		// 테스트용 입력할 자료 만들기
		BoardVO inData1 = new BoardVO();
		inData1.setTitle("새로 입력한 자료 제목22");
		inData1.setContents("새로 입력한 내용 자료 121315");
		inData1.setWriter("나새로미2");
		System.out.println("=====입력 실행전 vo객체의 bno => "  + inData1.getBno() );
		int result = mapper.insertBoardGetBno(inData1);
		assertEquals(1, result);
		int afterCount = mapper.getCount();
		assertEquals(initCount+1, afterCount);
		
		System.out.println("=====게시판 번호=======> " + inData1.getBno() ); //null 또는 0이 나온다.
		
	}
	
	@Test
	public void getBoardTest() {
		BoardVO inData1 = new BoardVO();
		inData1.setTitle("새로 입력한 자료 제목22");
		inData1.setContents("새로 입력한 내용 자료 121315");
		inData1.setWriter("나새로미2");
		
		mapper.insertBoardGetBno(inData1);
		System.out.println("=========\n" + inData1);
		BoardVO getVo = mapper.getBoard(inData1.getBno());
		System.out.println("=========\n" + getVo);
		assertEquals(inData1, getVo);
	}
	
	@Test
	public void getBoardListTest() {
		List<BoardVO> getList = mapper.getBoardList(null);
		for( BoardVO vo  : getList) {
			System.out.println("=> " + vo);
		}
	}
	
	@Test
	public void updateNdeleteBoardTest() {
		BoardVO inData1 = new BoardVO();
		inData1.setTitle("새로 입력한 자료 제목4545");
		inData1.setContents("새로 입력한 내용 자료 1472");
		inData1.setWriter("나업뎃");
		mapper.insertBoardGetBno(inData1);
		System.out.println( mapper.getBoard(inData1.getBno()));
		inData1.setContents("바뀐 내용이비니다......");
		inData1.setTitle("바뀐 제목입니다....정말");
		int result = mapper.updateBoard(inData1);
		assertEquals(result, 1);
		System.out.println( mapper.getBoard(inData1.getBno()));
		
		result = mapper.deleteBoard(inData1.getBno());
		assertEquals(result, 1);
		
	}
}
