package project.spring.data.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project.spring.data.model.Telephone;

@Repository
public interface InterfaceTelephone extends CrudRepository<Telephone, Long> {

}
