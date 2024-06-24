package kr.co.yangdoll.imsispring;

import org.springframework.stereotype.Component;

@Component
public class Bbb implements CalcuService{
	public int calcu(int data1, int data2) {
		int result = 0;
		result = data1 + data2;
		return result;
	}
}
