package project.spring.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import project.spring.data.dao.InterfaceSpringDataUser;
import project.spring.data.model.UserSpringData;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/spring-config.xml"})
public class AppSpringDataTest {
	
	@Autowired
	private InterfaceSpringDataUser interfaceSpringDataUser;
	
	@Test
	public void testInsert() {
		
		UserSpringData userSpringData = new UserSpringData();
		
		userSpringData.setEmail("edercribeiro@gmail.com");
		userSpringData.setAge(37);
		userSpringData.setLogin("test 123");
		userSpringData.setPassword("123");
		userSpringData.setName("Mazzoccante");
		
		interfaceSpringDataUser.save(userSpringData);
		
		System.out.println("Inserted Users -> " + interfaceSpringDataUser.count());
		
	}

}
