package kr.co.yangdoll.imsi;

import org.springframework.stereotype.Component;

import kr.co.yangdoll.imsispring.CalcuService;

@Component
public class Ccc implements CalcuService{
	
	
	@Override
	public int calcu(int data1, int data2) {
		return data1*data2;
	}
}
