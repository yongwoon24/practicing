package com.mysite.yangdoll.dao;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.yangdoll.entity.Member;

@SpringBootTest
public class MemberDAOTest {
	@Autowired
	MemberDAO dao;
	
	Member mem1, mem2, mem3;
	
	@BeforeAll
	public void init() {
		mem1 = new Member();
		mem1.setCount(0);
		mem1.setEmail("qwert");
		mem1.setGrade(1);
		mem1.setMemName("kim");
		mem1.setMemId("abc");
		mem1.setMemPwd("kim");
		mem1.setPhone("kim");
		
	}
	
	@Test
	public void insertMember() {
		Member result = dao.save(mem1);
		
		}
	}
