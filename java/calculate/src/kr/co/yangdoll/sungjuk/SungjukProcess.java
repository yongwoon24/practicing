package kr.co.yangdoll.sungjuk;

public class SungjukProcess {

	public static void main(String[] args) {
		String name, hnum;
		int kor_score, math_score, eng_score;
		String[] sub = {"국어", "수학", "영어"};
		SungjukPrintResult printResult = new SungjukPrintResult();
		SungjukDataInput sungjukDataInput = new SungjukDataInput();
		SungjukCalc calc = new SungjukCalc();
		
		hnum = sungjukDataInput.strInput("학번");
		name = sungjukDataInput.strInput("이름");
		kor_score = sungjukDataInput.numInput("국어점수");
		math_score = sungjukDataInput.numInput("수학점수");
		eng_score = sungjukDataInput.numInput("영어점수");
		printResult.printResult(hnum, name, kor_score, math_score, eng_score, 
				calc.avgCalc(kor_score, math_score, eng_score), calc.totalCalc(kor_score, math_score, eng_score));
	}

}