package kr.co.yangdoll.calculator;

public class MainCalculator {
	public static void main(String[] args) {
		NumberInput numberInput = new NumberInput();
		Compute compute = new Compute();
		ResultPrint resultPrint = new ResultPrint();
		
		int a = numberInput.dataInput();
		int b = numberInput.dataInput();
		
		compute.add(a, b);
		compute.subtract(a, b);
		compute.multiply(a, b);
		compute.divide(a, b);
		
//		resultPrint.resultPrint(addResult);
//		resultPrint.resultPrint(subResult);
//		resultPrint.resultPrint(mulResult);
//		resultPrint.resultPrint(divResult);
	}
}
