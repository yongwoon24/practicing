package basic.chap02.lecture;

public class LoopExam05 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 200; i += 3) {
			count += 1;
			System.out.println(i);
		}
		System.out.println("반복 횟수 : " + count);
	}
}
