package kr.or.ddit.ioc.collection;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionBeanTest {
	
	private ApplicationContext context;
	
	//before annotation을 통해 스프링 ioc 컨테이너 생성
	@Before
	public void setup(){
		context = 
			new ClassPathXmlApplicationContext(
					"classpath:kr/or/ddit/ioc/application-collection.xml");
	}
	
	//spring container 정상 생성 확인
	@Test
	public void springContainterTest(){
		/***Given***/

		/***When***/

		/***Then***/
		assertNotNull(context);
		assertTrue(context.getBeanDefinitionCount() >=1 );
	}
	
	
	//list 주입 테스트
	@Test
	public void listTest() {
		/***Given***/
		//spring ioc 컨테이너 생성(before)

		/***When***/
		//CollectionBean을 dl
		//collectionBean객체의 getLists()를 통해 list객체 받기
		CollectionBean collectionBean = 
				context.getBean("collectionBean", CollectionBean.class);
		
		List lists = collectionBean.getLists();

		/***Then***/
		//List.get(0) == brown / List.get(1) == cony / List.get(2) == sally
		assertEquals("brown", lists.get(0));
		assertEquals("cony", lists.get(1));
		assertEquals("sally", lists.get(2));
	}
	
	
	//set 주입 테스트
	@Test
	public void setTest(){
		/***Given***/
		//스프링 컨테이너 생성(before)
		
		/***When***/
		//CollectionBean dl
		//collectionBean.getSets();
		CollectionBean collectionBean = context.getBean("collectionBean", CollectionBean.class);
		Set sets = collectionBean.getSets();

		/***Then***/
		//값 확인 (cony, sally, brown)
		assertTrue(sets.contains("cony"));
		assertTrue(sets.contains("sally"));
		assertTrue(sets.contains("brown"));
	}
	
	//map 주입 테스트
	@Test
	public void mapTest(){
		/***Given***/
		//spring container 생성 (before)

		/***When***/
		//collectionBean dl
		//collectionBean의 map 속성 확인
		CollectionBean collectionBean = context.getBean("collectionBean", CollectionBean.class);
		Map map = collectionBean.getMap();
		
		/***Then***/
		//값 확인
		assertEquals("sally", map.get("ranger1"));
		assertEquals("brown", map.get("ranger2"));
		assertEquals("cony", map.get("ranger3"));
	}
	
	//properties 주입 테스트
	@Test
	public void propertiesTest(){
		/***Given***/
		//spring container 생성 테스트

		/***When***/
		//CollectionBean DL
		//collectionBean의 pros 속성 확인
		CollectionBean collectionBean = context.getBean("collectionBean", CollectionBean.class);
		Properties pros = collectionBean.getPros();
		
		/***Then***/
		//pros의 값 확인
		assertEquals("brown", pros.get("ranger1"));
		assertEquals("cony", pros.get("ranger2"));
		assertEquals("sally", pros.get("ranger3"));

	}
	
}








