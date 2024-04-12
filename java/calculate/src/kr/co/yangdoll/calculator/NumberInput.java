package kr.co.yangdoll.calculator;

import java.util.Scanner;

//숫자를 입력 받는 역할
public class NumberInput {
	public int dataInput() {
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		int inNumData = sc.nextInt();
		return inNumData;
	}
}
