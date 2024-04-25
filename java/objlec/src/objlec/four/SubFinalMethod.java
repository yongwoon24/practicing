package objlec.four;

//클래스와 클래스 간에는 단일 상속받을 수 있다.
public class SubFinalMethod extends FinalMethodExam{
	
	@Override
	public void nonFinalMethod() {
		System.out.println("나는 final이 없는 메서드");
		System.out.println("서브 클래스에서 추가된 내용임");
	}
	
	@Override
	public final void finalMethod() { //부모 클래스의 메서드가 final로 정의되어서 오버라이드 불가
		System.out.println("나는 final 메서드");
	}
}
