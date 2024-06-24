package com.yangdoll.empma.vo;

import java.util.Objects;

public class EmployeeVO {
	private int EMPLOYEE_ID;
	private String FIRST_NAME;
	private String LAST_NAME;
	private String EMAIL;
	private String PHONE_NUMBER;
	private String HIRE_DATE;
	private String JOB_ID;
	private double SALARY;
	private double COMMISSION_PCT;
	private int MANAGER_ID;
	private int DEPARTMENT_ID;
	public EmployeeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeVO(int eMPLOYEE_ID, String lAST_NAME, String eMAIL, String jOB_ID) {
		super();
		EMPLOYEE_ID = eMPLOYEE_ID;
		LAST_NAME = lAST_NAME;
		EMAIL = eMAIL;
		JOB_ID = jOB_ID;
	}
	public EmployeeVO(int eMPLOYEE_ID, String fIRST_NAME, String lAST_NAME, String eMAIL, String pHONE_NUMBER,
			String jOB_ID, double sALARY, double cOMMISSION_PCT, int mANAGER_ID, int dEPARTMENT_ID) {
		super();
		EMPLOYEE_ID = eMPLOYEE_ID;
		FIRST_NAME = fIRST_NAME;
		LAST_NAME = lAST_NAME;
		EMAIL = eMAIL;
		PHONE_NUMBER = pHONE_NUMBER;
		JOB_ID = jOB_ID;
		SALARY = sALARY;
		COMMISSION_PCT = cOMMISSION_PCT;
		MANAGER_ID = mANAGER_ID;
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	public void setEMPLOYEE_ID(int eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}
	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}
	public String getHIRE_DATE() {
		return HIRE_DATE;
	}
	public void setHIRE_DATE(String hIRE_DATE) {
		HIRE_DATE = hIRE_DATE;
	}
	public String getJOB_ID() {
		return JOB_ID;
	}
	public void setJOB_ID(String jOB_ID) {
		JOB_ID = jOB_ID;
	}
	public double getSALARY() {
		return SALARY;
	}
	public void setSALARY(double sALARY) {
		SALARY = sALARY;
	}
	public double getCOMMISSION_PCT() {
		return COMMISSION_PCT;
	}
	public void setCOMMISSION_PCT(double cOMMISSION_PCT) {
		COMMISSION_PCT = cOMMISSION_PCT;
	}
	public int getMANAGER_ID() {
		return MANAGER_ID;
	}
	public void setMANAGER_ID(int mANAGER_ID) {
		MANAGER_ID = mANAGER_ID;
	}
	public int getDEPARTMENT_ID() {
		return DEPARTMENT_ID;
	}
	public void setDEPARTMENT_ID(int dEPARTMENT_ID) {
		DEPARTMENT_ID = dEPARTMENT_ID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(COMMISSION_PCT, DEPARTMENT_ID, EMAIL, EMPLOYEE_ID, FIRST_NAME, HIRE_DATE, JOB_ID, LAST_NAME,
				MANAGER_ID, PHONE_NUMBER, SALARY);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVO other = (EmployeeVO) obj;
		return Double.doubleToLongBits(COMMISSION_PCT) == Double.doubleToLongBits(other.COMMISSION_PCT)
				&& DEPARTMENT_ID == other.DEPARTMENT_ID && Objects.equals(EMAIL, other.EMAIL)
				&& EMPLOYEE_ID == other.EMPLOYEE_ID && Objects.equals(FIRST_NAME, other.FIRST_NAME)
				&& Objects.equals(HIRE_DATE, other.HIRE_DATE) && Objects.equals(JOB_ID, other.JOB_ID)
				&& Objects.equals(LAST_NAME, other.LAST_NAME) && MANAGER_ID == other.MANAGER_ID
				&& Objects.equals(PHONE_NUMBER, other.PHONE_NUMBER)
				&& Double.doubleToLongBits(SALARY) == Double.doubleToLongBits(other.SALARY);
	}
	@Override
	public String toString() {
		return "EmployeeVO [EMPLOYEE_ID=" + EMPLOYEE_ID + ", FIRST_NAME=" + FIRST_NAME + ", LAST_NAME=" + LAST_NAME
				+ ", EMAIL=" + EMAIL + ", PHONE_NUMBER=" + PHONE_NUMBER + ", HIRE_DATE=" + HIRE_DATE + ", JOB_ID="
				+ JOB_ID + ", SALARY=" + SALARY + ", COMMISSION_PCT=" + COMMISSION_PCT + ", MANAGER_ID=" + MANAGER_ID
				+ ", DEPARTMENT_ID=" + DEPARTMENT_ID + "]";
	}
	
	
	
}
