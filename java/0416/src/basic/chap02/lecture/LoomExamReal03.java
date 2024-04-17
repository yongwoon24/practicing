package basic.chap02.lecture;

import java.util.ArrayList;
import java.util.List;

public class LoomExamReal03 {
	public static void main(String[] args) {
		List listData = new ArrayList();
		listData.add("3701");
		listData.add("홍길동");
		listData.add(100);
		System.out.println(listData.get(2));
		
		for (int i = 0; i < listData.size(); i++) {
			System.out.println(listData.get(i));
		}
		
	}
}
