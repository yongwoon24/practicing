package kr.co.yangdoll.imsi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.yangdoll.imsispring.CalcuService;

@Component
public class Aaa {
	@Autowired
	CalcuService obj;

	/*
	 * public void use() { Bbb obj = new Bbb(); int result = obj.calcu(100, 300);
	 * System.out.println(result); }
	 */
	
	
	
	public void use() {
		int result = obj.calcu(100, 300);
		System.out.println(result);
	}

	public void setObj(CalcuService obj) {
		this.obj = obj;
	}
}
