package refone.day1;

public class StringBufferExam {
	public static void main(String[] args) {
		String data = "나는 문자열 데이터입니다.";
		System.out.println(data.substring(3,6));
		
		StringBuffer sbData = new StringBuffer();
		sbData.append("홍길동");
		System.out.println(sbData);
		
		StringBuffer sbData2 = new StringBuffer(16);
		sbData2.append("홍길동");
		System.out.println(sbData2);
		
		StringBuffer sbData3 = new StringBuffer("yangdoll");
		System.out.println(sbData3);
		sbData3.append(" Hong");
		System.out.println(sbData3.toString());
		
		System.out.println("저장된 문자열을 역순으로 reverse =>" + sbData3.reverse());
		String sbStringData = sbData3.toString();
		String[] words = sbStringData.split(" ");
		System.out.println(words[0]+ "\n" + words[1]);
		
		String samData = "잃어버린 그 약속을";
		StringBuilder sbSamData = new StringBuilder(samData);
		System.out.println(sbSamData.reverse());
		
	}
}
