package kr.co.yangdoll.sungjuk;

public class SungjukProcess {

	public static void main(String[] args) {
//		String name, hnum;
//		int kor_score, math_score, eng_score;
		
		String[] sub = {"학번", "이름", "국어", "수학", "영어"};
		String[] string_data = new String[2];
		int[] score_data = new int[3];
		SungjukPrintResult printResult = new SungjukPrintResult();
		SungjukDataInput sungjukDataInput = new SungjukDataInput();
		SungjukCalc calc = new SungjukCalc();
		
		for(int i = 0; i<string_data.length;i++) {
			string_data[i] = sungjukDataInput.strInput(sub[i]); 
		}
		for(int j = 0; j<score_data.length;j++) {
			score_data[j] = sungjukDataInput.numInput(sub[j+2]);
		}
		
		
//		hnum = sungjukDataInput.strInput("학번");
//		name = sungjukDataInput.strInput("이름");
//		kor_score = sungjukDataInput.numInput("국어점수");
//		math_score = sungjukDataInput.numInput("수학점수");
//		eng_score = sungjukDataInput.numInput("영어점수");
		printResult.printResult(string_data[0], string_data[1], score_data[0], score_data[1], score_data[2], 
				calc.avgCalc(score_data[0], score_data[1], score_data[2]), 
				calc.totalCalc(score_data[0], score_data[1], score_data[2]));
	}

}