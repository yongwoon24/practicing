package objlec.four;

public class FinalFieldExam {
	public int nonFinalField;
	
	//final 정의하는 시점에서 초기화를 하거나
	public final int finalFieldOne = 50;
	// final 정의하는 시점에서 초기화하지 않았다면 생성되는 시점에서 반드시 초기화가 되어야 한다.
	public final int finalFieldTwo;
	
	//static final 정의하는 시점에서 반드시 초기화를 해야 한다.
	public static final int finalStaticField = 500;

	//사용시 new FinalFieldExam(); 로 생성할 때 finalFieldTwo는 100으로 고정된다.
	public FinalFieldExam() { 
		finalFieldTwo = 100;
	}
	//사용시 new FinalFieldExam(500); 로 생성할 때 finalFieldTwo는 500으로 고정된다.
	public FinalFieldExam(int num) { 
		finalFieldTwo = num;
	}
	
	public void changeField() {
		nonFinalField= 500;
		finalFieldOne = 300;
		finalFieldTwo = 1000;
		finalStaticField=6500;
	}
	
	public void parFinal(int num /* final int num */) { //몰라도 됨, 컴파일러가 알아서 final을 추가
		
	}
	
	
}
