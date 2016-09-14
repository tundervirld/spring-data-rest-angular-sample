package com.programmingfree.springservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface StateRepository extends CrudRepository<State, Integer> {
	List<State> findByStateActive(@Param("active") String stateActive);
}
