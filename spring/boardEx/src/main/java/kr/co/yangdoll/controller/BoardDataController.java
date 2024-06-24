package kr.co.yangdoll.controller;

import java.util.List;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.yangdoll.domain.BoardVO;
import kr.co.yangdoll.service.BoardService;
import kr.co.yangdoll.util.PageInfoVO;

@RestController
@RequestMapping("/data/*")
public class BoardDataController {

	@Autowired
	BoardService service;
	
	@RequestMapping(value="/getString")
	public String getString() {
		return "나도야 간다 나도야 간다 젊은 나이를 눈물로 보낼 수 있나";
	}
	
	@GetMapping("/getVo")
	public BoardVO getVo( Integer dataNum, HttpServletRequest request) {
		System.out.println( "접속자 ip =>" +  request.getRemoteAddr()  );
		
		return  service.getBoard(dataNum);
/*		BoardVO vo = new BoardVO();
		vo.setBno(123456);
		vo.setTitle("하나짜리 객체 제목");
		return vo;*/
	}
	
	@GetMapping("/getListVo")
	public List<BoardVO> getListVo(int pageNum, int limit) {
		int totalCount = service.getCount();
		PageInfoVO pageInfo = new PageInfoVO(pageNum, limit, totalCount);
		return service.getBoardList(pageInfo);
	}
	
	@RequestMapping("/getVoResponEntity")
	public ResponseEntity<BoardVO> getVoResponEntity() {
		BoardVO vo = new BoardVO();
		vo.setBno(90);
		vo.setTitle("이자료는 DB에서 가져온 한개의 자료");
		vo.setContents("sksms 내용입니다... 냉무");
		vo.setWriter("강감찬");
		
		ResponseEntity<BoardVO> result = null;
		if ( vo.getBno() < 100) { //요청한 조건, 또는 결과에 따라서 판단
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		}else {
			result = ResponseEntity.status(HttpStatus.OK).body(vo);
		}
		
		return result;
	}
	
	@GetMapping("/proc/{tableName}/{tNo}") //data/proc/member/1
	public String[] getPath(@PathVariable("tableName") String tableName, 
						@PathVariable("tNo") String tNo ) {
		
		return  new String[] { "tableName : " + tableName, "tNo : " + tNo};
							
	}
	
	@GetMapping("/procOld")
	public String[] getOld(String tableName, String tNo) {
		return  new String[] { "tableName : " + tableName, "tNo : " + tNo};
	}
	
	// @PutMapping("") update, 	@DeleteMapping("")  delete
	// @GetMapping("") select,  @PostMappint("") insert
	
	
}
