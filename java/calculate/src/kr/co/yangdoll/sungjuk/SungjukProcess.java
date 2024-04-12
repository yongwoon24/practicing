package kr.co.yangdoll.sungjuk;

public class SungjukProcess {

	public static void main(String[] args) {
		String name, hnum;
		int kor_score, math_score, eng_score;
		SungjukPrintResult printResult = new SungjukPrintResult();
		SungjukDataInput sungjukDataInput = new SungjukDataInput();
		SungjukCalc calc = new SungjukCalc();
		
		hnum = sungjukDataInput.strInput("학번");
		name = sungjukDataInput.strInput("이름");
		kor_score = sungjukDataInput.numInput("국어점수");
		math_score = sungjukDataInput.numInput("수학점수");
		eng_score = sungjukDataInput.numInput("영어점수");
		
//		System.out.println("학번 : " + hnum);
//		System.out.println("이름 : " + name);
//		System.out.println("국어 : " + kor_score + ", 수학 : " + math_score + ", 영어 : " + eng_score);
//		System.out.println("평균 점수 : " + calc.avgCalc(kor_score, math_score, eng_score));
		
		printResult.printResult(hnum, name, kor_score, math_score, eng_score, 
				calc.avgCalc(kor_score, math_score, eng_score), calc.totalCalc(kor_score, math_score, eng_score));
	}

}