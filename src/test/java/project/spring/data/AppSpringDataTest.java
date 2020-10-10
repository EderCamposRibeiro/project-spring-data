package project.spring.data;

import java.util.List;
import java.util.Optional;

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
		userSpringData.setName("Deletable");
		
		interfaceSpringDataUser.save(userSpringData);
		
		System.out.println("Inserted Users -> " + interfaceSpringDataUser.count());
		
	}
	
	@Test
	public void testFind() {
		
		Optional<UserSpringData> userSpringData = interfaceSpringDataUser.findById(1L);

		System.out.println(userSpringData.get().getId());
		System.out.println(userSpringData.get().getAge());
		System.out.println(userSpringData.get().getEmail());
		System.out.println(userSpringData.get().getLogin());
		System.out.println(userSpringData.get().getName());
		System.out.println(userSpringData.get().getPassword());

		
	}	
	
	@Test
	public void testFindAll() {
		
		Iterable<UserSpringData> list = interfaceSpringDataUser.findAll();
		
		for (UserSpringData userSpringData : list) {
			System.out.println(userSpringData);
			System.out.println("------------------------------------");
		}
		
	}		
	
	@Test
	public void testUpdate() {
		
		Optional<UserSpringData> userSpringData = interfaceSpringDataUser.findById(3L);
		
		UserSpringData data = userSpringData.get();
		
		data.setName("Eder Campos Updated");
		
		interfaceSpringDataUser.save(data);
		
	}	
	
	@Test
	public void testDelete() {
		
		System.out.println("Inserted Users before delete -> " + interfaceSpringDataUser.count());
		
		interfaceSpringDataUser.deleteById(5L);
		
		System.out.println("Inserted Users after delete -> " + interfaceSpringDataUser.count());
		
	}
	
	@Test
	public void testDeleteConsult() {
		
		System.out.println("Inserted Users before delete -> " + interfaceSpringDataUser.count());
		
		Optional<UserSpringData> userSpringData = interfaceSpringDataUser.findById(3L);
		
		interfaceSpringDataUser.delete(userSpringData.get());
		
		System.out.println("Inserted Users after delete -> " + interfaceSpringDataUser.count());
	}	
	
	@Test
	public void testFindByName() {
		
		List<UserSpringData> list = interfaceSpringDataUser.findByName("Eder");
		
		for (UserSpringData userSpringData : list) {
			System.out.println(userSpringData);
			System.out.println("------------------------------------");
		}
	}	
	
	@Test
	public void testFindByNameParam() {
		
		UserSpringData userSpringData = interfaceSpringDataUser.findByNameParam("Ribeiro");
		
			System.out.println(userSpringData);
		
	}		

	@Test
	public void testDeleteByName() {
		
		System.out.println("Inserted Users before delete -> " + interfaceSpringDataUser.count());
		
		interfaceSpringDataUser.deleteByName("Deletable");
		
		System.out.println("Inserted Users after delete -> " + interfaceSpringDataUser.count());
	}
	
	@Test
	public void testUpdateByName() {
		
		interfaceSpringDataUser.updateEmailByName("alterado@gmail.com", "Ribeiro");
	}

}












