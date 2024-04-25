package objlec.one;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.Before;

public class MemberVOOneTest {
	
	MemberVOOne obj;// = new MemberVOOne();
	
	@Before
	public void startSet() {
		obj = new MemberVOOne("a", "b", new Date(), true, 19);
	}
	
	@Test
	public void fileSetTest() {
		//obj.age = 19;
		obj.setAge(120);
		assertNotNull(obj);
		String resultStr = obj.toString();
		System.out.println(resultStr);
	}
}
