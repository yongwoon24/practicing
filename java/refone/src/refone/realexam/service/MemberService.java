package refone.realexam.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import refone.realexam.dao.MemberRefactDAO;
import refone.realexam.vo.MemberVO;

public class MemberService {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		while (true) {
			MemberVO vo = new MemberVO();
			MemberRefactDAO dao = new MemberRefactDAO();
			Scanner sc = new Scanner(System.in);
			int value = Integer.parseInt( dataInput("작업을 선택하세요\n[1:입력, 2:수정, 3:삭제, 4:전체출력], 5:특정id출력, 6:종료") );

			if (value == 1) {
				vo.setMemid(dataInput("id"));
				vo.setPassword(dataInput("pw"));
				vo.setIname(dataInput("이름"));
				vo.setAddress(dataInput("주소"));
				vo.setPhone(dataInput("전화번호"));
				int result = dao.add(vo);
				if (result == 1) {
					System.out.println("회원등록이 완료되었습니다.");
				} else {
					System.out.println("회원등록에 실패했습니다.");
				}
			} else if (value == 2) {
				vo.setMemid(dataInput("정보를 수정할 id"));
				vo.setAddress(dataInput("이름"));
				vo.setIname(dataInput("주소"));

				int result = dao.update(vo);
				if (result == 1) {
					System.out.println("회원정보수정이 완료되었습니다.");
				} else {
					System.out.println("회원정보수정에 실패했습니다.");
				}

			} else if (value == 3) {
				String memid = dataInput("삭제할 id");
				int result = dao.delete(memid);
				if (result == 1) {
					System.out.println("회원삭제가 완료되었습니다.");
				} else {
					System.out.println("회원삭제에 실패했습니다.");
				}
			} else if (value == 4) {
				List<MemberVO> list = dao.getListAll();
				for(MemberVO data : list) {
					System.out.print(data.getMemid() + " / ");
					System.out.print(data.getPassword() + " / ");
					System.out.print(data.getIname() + " / ");
					System.out.print(data.getAddress() + " / ");
					System.out.print(data.getPhone() + " / ");
					System.out.println();
				}
			} else if(value == 5) {
				String memId = dataInput("id");
				MemberVO one = dao.getOne(memId);
				System.out.print(one.getMemid() + " / ");
				System.out.print(one.getPassword() + " / ");
				System.out.print(one.getIname() + " / ");
				System.out.print(one.getAddress() + " / ");
				System.out.print(one.getPhone() + " / ");
			} else if(value == 6) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요");
				continue;
			}

		}

	}

	public static String dataInput(String input) {
		System.out.println(input + "입력");
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}

}
