package com.mysite.yangdoll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mysite.yangdoll.dao.MemberDAO;
import com.mysite.yangdoll.entity.Member;

@Controller
public class HomeController {

    @Autowired
    private MemberDAO memberDao;

    // 홈 페이지
    @GetMapping("/")
    public String home(Model model) {
        List<Member> members = memberDao.findAll();
        model.addAttribute("members", members);
        memberDao.updateGrade();
        return "home";
    }

    // 회원 정보 수정 폼
    @GetMapping("/update")
    public String editMemberForm() {
        return "update";
    }

    // 회원 정보 수정 처리
    @PostMapping("/update")
    public String editMember(@RequestParam("memId") String memId,
                             @RequestParam(value = "memName", required = false) String memName,
                             @RequestParam(value = "phone", required = false) String phone,
                             @RequestParam(value = "email", required = false) String email) {
        memberDao.updateMember(memId, memName, phone, email);

        return "redirect:/";
    }

    // 회원 검색 폼
    @GetMapping("/search")
    public String searchForm() {
        return "search";
    }

    // 회원 검색 처리
    @GetMapping("/searchresult")
    public String searchMember(@RequestParam("memName") String memName,
                               @RequestParam("phone") String phone,
                               Model model) {

        List<Member> members = memberDao.findBymemNameAndPhone(memName, phone);
        model.addAttribute("members", members);

        return "searchresult";
    }
}