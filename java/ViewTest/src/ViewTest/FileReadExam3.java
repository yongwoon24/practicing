package ViewTest;

import java.util.Scanner;

public class FileReadExam3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("숫자 입력");
		int N = sc.nextInt();
		System.out.println("숫자 입력");
		int M = sc.nextInt();
		int div = 1; // 자리수판단을 위한 변수
		int num = N; // 시작값
		int size = 1; // 자리수
		int x, y;
		
		//자리수 판단
		while(true) {
			if(num / div >= 10) {
				div = div * 10;
				size++;
				//System.out.println(size);
			}
			else {
				break;
			}
		}
		int div2 = 1;
		for(int i = 0; i < size; i++) {
			div2 = div2 * 10;
		}
		
		int[] arr;
		x = num / div2;
		while(num==0) {
			div2 = div2 / 10;
			num - (x)
			if(x == )
			
		}
		
		//System.out.println(size + "자리입니다.");
		sc.close();
	}
}
