package kr.co.yangdoll.sungjuk;

public class SungjukPrintResult {
	public void printResult(String hnum, String name, int kor, int math, int eng, int avg, int total) {
		System.out.println("학번 : " + hnum);
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor + ", 수학 : " + math + ", 영어 : " + eng);
		System.out.println("평균 점수 : " + avg);
		System.out.println("총 점수 : " + total);
		
	}
}
