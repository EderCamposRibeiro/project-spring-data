package project.spring.data.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project.spring.data.model.UserSpringData;

@Repository
public interface InterfaceSpringDataUser extends CrudRepository<UserSpringData, Long> {
	
	
}
