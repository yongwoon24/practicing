package basic.chap03.lecture;

import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sub[] = {"국어", "수학", "영어"};
		int sub_score[] = {0,0,0};
		int total_score = 0;
		int avg_score = 0;
		//boolean chk = true;
		while(true) {
			for (int i = 0; i < sub.length; i++) {
				System.out.println(sub[i] + "점수를 입력하세요");
				sub_score[i] = sc.nextInt();
			}
			
			for (int i = 0; i < sub_score.length; i++) {
				total_score += sub_score[i];
			}
			avg_score = total_score/sub.length;
			
			System.out.println("평균 점수 : " + avg_score);
			
			if (avg_score >= 60 && avg_score <= 100) {
				System.out.println("합격");
			}
			else if(avg_score < 60 && avg_score >= 0) {
				System.out.println("불합격");
			}
			else {
				System.out.println("입력오류");
			}
				
			System.out.println("종료하시겠습니까? Y/N");
			//int yesno = sc.nextInt();
			char yesno = sc.next().charAt(0);
			if (yesno == 'Y'||yesno == 'y') {
//				chk = false;
				break;
			}				
		}
	}
}
