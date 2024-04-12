package kr.co.yangdoll.calculator;
//계산 하는 역할
public class Compute {
	void add(int a, int b){
		int result = a + b;
		System.out.println(a + "+" + b + "=" + result);
	}
	void subtract(int a, int b){
		int result = a - b;
		System.out.println(a + "-" + b + "=" + result);
	}
	void multiply(int a, int b){
		int result = a * b;
		System.out.println(a + "*" + b + "=" + result);
	}
	void divide(int a, int b){
		int result = a / b;
		System.out.println(a + "/" + b + "=" + result);
	}
}
