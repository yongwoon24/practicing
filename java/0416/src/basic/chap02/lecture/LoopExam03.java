package basic.chap02.lecture;

import java.util.Scanner;

public class LoopExam03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end, inc;
		
		System.out.println("시작 숫자 입력");
		start = sc.nextInt();
		System.out.println("끝 숫자 입력");
		end = sc.nextInt();
		
		System.out.println(start + "부터 " + end + "까지의 합 : " + allSumCalc(start, end, 1));
		System.out.println(start + "부터 " + end + "까지의 홀수or짝수들의합 : " + allSumCalc(start, end, 2));
		//System.out.println(start + "부터 " + end + "까지의 합 : " + allSumCalc(start, end, 1));
	}
	public static int allSumCalc(int start, int end, int inc) {
		int result = 0;
		for (int i = start; i < end+1; i += inc) {
			result = result + i;
		}
		return result;
	}
}
