package kr.co.yangdoll.sungjuk;

import java.util.Scanner;

public class SungjukDataInput {
	Scanner scanner = new Scanner(System.in);

	public String strInput(String message) {
		System.out.println(message + "을 입력하세요.");
		return scanner.next();
	}

	public int numInput(String message) {
		System.out.println(message + "를 입력하세요.");
		return scanner.nextInt();
	}
}
