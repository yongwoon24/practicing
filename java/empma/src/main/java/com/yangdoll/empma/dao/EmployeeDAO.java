package com.yangdoll.empma.dao;

import java.sql.SQLException;

import com.yangdoll.empma.vo.EmployeeVO;

public interface EmployeeDAO {
	public int add(EmployeeVO vo) throws SQLException;
}
