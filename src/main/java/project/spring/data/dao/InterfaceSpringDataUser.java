package project.spring.data.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project.spring.data.model.UserSpringData;

@Repository
public interface InterfaceSpringDataUser extends CrudRepository<UserSpringData, Long> {
	
	@Query(value = "select p from UserSpringData p where p.name like %?1%")
	public List<UserSpringData> findByName (String name);
}
