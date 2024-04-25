package objlec.five;

public class UseExam01 {

	public static void main(String[] args) {
		B obj01 = new B();
		
		A obj02 = new B();
		
		Ia obj03 = new Ic();
		//obj03 = null;
		int result = obj03.aaa();
		int result2 = obj03.bbb();
		obj03.ccc();
	}

}
