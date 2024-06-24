package kr.co.yangdoll.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.yangdoll.service.MemberService;
import kr.co.yangdoll.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;

	@RequestMapping(value = "memInsertForm")
	public String memInsertForm() {
		
		return "memInsertForm";
	}
	
	@RequestMapping( value = "memberInsert")
	public String memberInsert(MemberVO vo, Model model) {
		int result = service.memberInsert(vo);
		model.addAttribute("result", result);
		model.addAttribute("message", "가입");
		return "jobResult";
	}
	
	@RequestMapping(value = "memDeleteForm")
	public String memDeleteForm() {
		
		return "memDeleteForm";
	}
	
	// memberDelete?memId=아이디명
	@RequestMapping( value = "memberDelete")
	public String memberDelete(String memId, Model model) {
		int result = service.memberDelete(memId);
		model.addAttribute("result", result);
		model.addAttribute("message", "탈퇴");
		return "jobResult";
	}
	
	@RequestMapping( "getAll")
	public String getAll(Model model) {
		List<MemberVO> list = service.getAll();
		model.addAttribute("list", list); //== jsp에서는 request.setAttribute( "list", list )
		return "memberList";
	}
	
	@RequestMapping( value = "/getOne")
	public String getOne( String memId, Model model) {
		MemberVO vo = service.getOne(memId);
		model.addAttribute("vo", vo);
		return "mypage";
	}
	
	@PostMapping(value = "login") //요청을 받아서
	public String loginProc(String memId, String memPwd, Model model, HttpServletRequest request) {
		
		int result = service.loginProc(memId, memPwd, request);
		if( result == 0 ) { //로그인 실패(아이디 또는 비번이 틀림)
//			return "home";
			
			return "redirect:/";   
			//새로운 요청으로 접속하라. => jsp page가 아니라 요청(value = "login", value = "/" ..)이여야 한다.
		}
		model.addAttribute("result", result);
		model.addAttribute("message", "로그인");
		return "jobResult";
	}
	// 요청을 받아서 서비스에게 일을 시킨 후 결과를 응답페이지에 자료를 전달
	
	@GetMapping(value = "logout") //요청을 받아서
	public String logoutc(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/";
	}
}
