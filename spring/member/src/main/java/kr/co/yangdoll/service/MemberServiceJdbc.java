package kr.co.yangdoll.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.yangdoll.dao.MemberDAO;
import kr.co.yangdoll.vo.MemberVO;

@Service
public class MemberServiceJdbc implements MemberService{
	
	@Autowired
	private MemberDAO dao;

	@Override
	public int memberInsert(MemberVO vo) {
		int result = dao.memberInsert(vo);
		return result;
	}
	
	@Override
	public int memberDelete(String memId) {
		return dao.memberDelete(memId);
	}

	@Override
	public List<MemberVO> getAll() {
		return dao.getAll();
	}

	@Override
	public MemberVO getOne(String memId) {
		return dao.getMember(memId);
	}

	
	@Override
	public int loginProc(String memId, String memPwd, HttpServletRequest request) {
		// memId 또는 아이디와 비밀번호를 넘겨주면서 조회를 한다.
		MemberVO vo = dao.getMember(memId);
		
		
		// 결과를 받는다. => 결과가 널이면 아이디가 잘못되었다.
/*		if(vo == null) {
			return 0; //입력한 자료(아이디가 존재하지 않을 때) 0을 반환하기로 함
		}else { //아이디는 맞게 입력했다(존재하는 아이디로 입력했다)
			if( vo.getMemPwd().equals(memPwd) ) { //비밀번호도 일치
				return 1;
			}else { //비밀번호가 불일치
				return 0;
			}
		}  */
		
		// 조기 리턴을 이용한 조건문
		if( vo != null && vo.getMemPwd().equals(memPwd)) {
		// 아이디가 일치하는 MemberVO가 조회되고 그리고 조회된 vo와 입력에서 넘겨받은 비밀번호가 일치한다면
			HttpSession session = request.getSession();
			session.setAttribute("sesVO", vo);
			return 1;
		}
		
		return 0;
	}

}
