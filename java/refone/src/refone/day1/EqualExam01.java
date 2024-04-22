package refone.day1;

public class EqualExam01 {

	public static String capitalize(String str)
    {
        if (str == null || str.length() == 0) {
            return str;
        }
 
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
	public static void main(String[] args) {
		String strOne = new String("홍길동");
		String strTwo = new String("홍길동");
		String sentence = "hello world";
		System.out.println("strOne => " + strOne + "\nstrTwo => " + strTwo);
		
		if(strOne == strTwo) {
			System.out.println("두 자료는 같습니다.");
		}else {
			System.out.println("두 자료는 다릅니다.");
		}
		
		if(strOne.equals(strTwo)){
			System.out.println("두 자료는 같습니다.");
		}else {
			System.out.println("두 자료는 다릅니다.");
		}
		System.out.println(capitalize(sentence));
		
	}

}
