package project.spring.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import project.spring.data.dao.InterfaceSpringDataUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring-config.xml"})
public class AppSpringDataTest {
	
	@Autowired
	private InterfaceSpringDataUser interfaceSpringDataUser;
	
	@Test
	public void testInsert() {
		System.out.println("Spring has initiate successfuly!");
	}

}
