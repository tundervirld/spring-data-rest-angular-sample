package com.programmingfree.springservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PriorityRepository extends CrudRepository<Priority, Integer> {
	List<Priority> findByPriorityActive(@Param("active") String priorityActive);
}
