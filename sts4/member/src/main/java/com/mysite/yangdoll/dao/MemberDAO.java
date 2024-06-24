package com.mysite.yangdoll.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.mysite.yangdoll.entity.Member;

import jakarta.transaction.Transactional;

public interface MemberDAO extends JpaRepository<Member, String> {
	public List<Member> findAll();
	public List<Member> findByPhone(String phone);
	public List<Member> findBymemNameAndPhone(String memName, String phone);
	@Transactional
	@Modifying
	@Query("update Member m set m.memName = :memName, m.phone = :phone, m.email = :email where m.memId = :memId")
	public void updateMember(String memId, String memName, String phone, String email);
	
	@Transactional
	@Modifying
	@Query("update Member m set m.grade = m.grade + 1 where m.count >= 10")
	public void updateGrade();
	
	/*
	 * public int insertMember(Member member);
	 */
}
