package kr.co.yangdoll.persistence;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")

public class DateMapperTest {
	@Autowired
	ApplicationContext context;
	
	//테스트하고자하는 클래스를 필드로 선언(클래스의 상위 인터페이스가 있다면 인터페이스 타입으로 선언)
	@Autowired
	DateMapper dateMapper;
	
	@Test
	public void  dateMaperDI() {
		assertNotNull( dateMapper );
		System.out.println( "======================> " + dateMapper.getClass().getName());
	}
	
	@Test
	public void getServerDateTest() {
		String serverDate = dateMapper.getServerDate();
		System.out.println( serverDate + "  <===================");
	}
	@Test
	public void getServerDate2Test() {
		String serverDate = dateMapper.getServerDate2();
		System.out.println( serverDate + "  <######################");
	}
	
	

}
