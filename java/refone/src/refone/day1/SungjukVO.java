package refone.day1;

import java.util.Objects;

public class SungjukVO {
	String hakbun, irum;
	int kor, eng, math, total;
	
		
	public SungjukVO(String hakbun, String irum, int kor, int eng, int math, int total) {
		super();
		this.hakbun = hakbun;
		this.irum = irum;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
	}
	public SungjukVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public String getIrum() {
		return irum;
	}
	public void setIrum(String irum) {
		this.irum = irum;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "SungjukVO [hakbun=" + hakbun + ", irum=" + irum + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", total=" + total + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(eng, hakbun, irum, kor, math, total);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SungjukVO other = (SungjukVO) obj;
		return eng == other.eng && Objects.equals(hakbun, other.hakbun) && Objects.equals(irum, other.irum)
				&& kor == other.kor && math == other.math && total == other.total;
	}
	
	
	
	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * Scanner sc = new Scanner(System.in); System.out.println("국어점수입력"); kor =
	 * sc.nextInt(); System.out.println("영어점수입력"); eng = sc.nextInt();
	 * System.out.println("수학점수입력"); math = sc.nextInt(); total = sum(kor, eng,
	 * math); System.out.println("총점 : " + total); System.out.println("평균 : " +
	 * average(total)); }
	 * 
	 * 
	 * public static int sum(int kor, int eng, int math) { return kor+eng+math; }
	 * public static double average(int total) { return total/3.0; }
	 */
}
