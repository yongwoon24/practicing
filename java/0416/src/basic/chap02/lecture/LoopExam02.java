package basic.chap02.lecture;

public class LoopExam02 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 10; i=i+2) {
			sum += i;
		}
		System.out.println(sum);
		
		int sumOdd = 0;
		int sumEven = 0;
		for (int i = 0; i <= 10; i=i+2) {
			sumOdd += i;
			sumEven += i;
		}
		System.out.println("홀수의합 : " + sumOdd);
		System.out.println("짝수의합 : " + sumEven);
	}
}
