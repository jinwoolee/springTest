package kr.or.ddit.ioc.placeholder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcInfoTest {
	
	private ApplicationContext context;
	
	@Before
	public void setup(){
		context = new ClassPathXmlApplicationContext("classpath:kr/or/ddit/ioc/application-placeholder.xml");		
	}
	
	@Test
	public void placeHolderTest() {
		/***Given***/
		//스프링 컨테이너 생성

		/***When***/
		//jdbcInfo bean DL
		JdbcInfo jdbcInfo = context.getBean("jdbcInfo", JdbcInfo.class);

		/***Then***/
		//값 확인
		assertEquals("jdbc:oracle:thin:@127.0.0.1:1521:xe", jdbcInfo.getUrl());
		assertEquals("oracle.jdbc.driver.OracleDriver", jdbcInfo.getDriver());
		assertEquals("pc00", jdbcInfo.getUsername());
		assertEquals("java", jdbcInfo.getPassword());

	}

}




