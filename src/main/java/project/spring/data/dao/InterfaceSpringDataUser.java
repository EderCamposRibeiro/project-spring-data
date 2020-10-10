package project.spring.data.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import project.spring.data.model.UserSpringData;

@Repository
public interface InterfaceSpringDataUser extends CrudRepository<UserSpringData, Long> {
	
	@Query(value = "select p from UserSpringData p where p.name like %?1%")
	public List<UserSpringData> findByName (String name);
	
	@Query(value = "select p from UserSpringData p where p.name = :paramname")
	public UserSpringData findByNameParam(@Param("paramname") String paramname);
	
	default <S extends UserSpringData> S saveActual(S entity) {
		
		// Do the process that you want!
		
		return save(entity);
	}
}