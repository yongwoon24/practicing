package kr.co.yangdoll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.yangdoll.domain.BoardVO;
import kr.co.yangdoll.service.BoardService;
import kr.co.yangdoll.util.PageInfoVO;

@Controller
@RequestMapping("/board/")
public class BoardController {
	@Autowired
	BoardService service;

	@GetMapping("/list") // /board/list
	public void list(int pageNum, int limit, Model model) {
//		int totalCount = service.getCount();
		PageInfoVO pageInfo = new PageInfoVO(pageNum, limit, service.getCount());

//		List<BoardVO> list = service.getBoardList(pageInfo);

		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("list", service.getBoardList(pageInfo));
//		return "/board/list"; //     => /WEB-INF  /board/list  .jsp
	}

//	@RequestMapping("/yangdoll/*") 
	public void all(Model mo) {
		// 192.168.0.131/board/yangdoll/a로 요청하면 반환타입 void느느
		// WEB_INF/board/yangdoll/a.jsp로 매핑한다.
		// 192.168.0.131/board/yangdoll/b로 요청하면 반환타입 void느느
		// WEB_INF/board/yangdoll/b.jsp로 매핑한다.
		// 192.168.0.131/board/yangdoll/c로 요청하면 반환타입 void느느
		// WEB_INF/board/yangdoll/c.jsp로 매핑한다.
		// 192.168.0.131/board/yangdoll/abc로 요청하면 반환타입 void느느
		// WEB_INF/board/yangdoll/abc로 매핑한다.
	}

	@GetMapping("/register") // /board/ + /register => /board//register
	public String registerForm() {
		return "/board/regForm";
	}

	@RequestMapping(value = "/board/registerproc")
//	@PostMapping(value ="register")  // => /board/register
	public String register(BoardVO vo) {
		int result = service.insertBoard(vo, false);
		System.out.println(result + "개의 게시글 입력되었습니다.");
		return "redirect:/board/list";
	}

	@RequestMapping("/get")
	public String getBoard(int bno, Model model) {
		model.addAttribute("vo", service.getBoard(bno));
		return "/board/detail";
	}

	@PostMapping("modify")
	public String modify(BoardVO vo) {
		int result = service.updateBoard(vo);
		return "redirect:/board/list";
	}

	@RequestMapping("/boardVO")
	@ResponseBody
	public BoardVO rtnBoard() {
		System.out.println("====================================");
		BoardVO vo = new BoardVO();
		vo.setContents("jfkdsljkl 나어링너ㅏ링넘 ㅓㅏㄹㅇ니머라ㅣㅇㄴ");
		vo.setTitle("jfdksljfkdsl jfkdlsjfds제목");
		vo.setWriter("김수한무");
		vo.setBno(12345);
		System.out.println("================" + vo);
		return vo;
	}

}
