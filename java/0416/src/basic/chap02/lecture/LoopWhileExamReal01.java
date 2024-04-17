package basic.chap02.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopWhileExamReal01 {
	public static void main(String[] args) {
		Set setData = new HashSet(0);
		setData.add("a");
		setData.add("b");
		setData.add("c");
		
		System.out.println(setData.size());
		Iterator iter = setData.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
