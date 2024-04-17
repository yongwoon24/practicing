package basic.chap02.lecture;

public class LoomExamReal02 {
	public static void main(String[] args) {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < alphabet.length(); i++) {
			System.out.print(alphabet.charAt(i));
		}
		for (int i = 0; i < alphabet.length(); i++) {
			System.out.print(alphabet.charAt(alphabet.length() - i - 1));
		}
		System.out.println();
		String alphabet2 = "";

		for (int i = 0; i < 26; i++) {
			alphabet2 += (char) (65 + i);
		}
		System.out.println(alphabet2);

		System.out.println("5&4 = " + (5 & 4));
		System.out.println("true&false = " + (true & false));
		System.out.println("~5 = " + (~5));
		System.out.println("12<<2 : " + (12 << 2));
		System.out.println("12>>2 : " + (12 >> 2));
		System.out.println();
	}
}
