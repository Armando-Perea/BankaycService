package com.java.bankayc.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.java.bankayc.app.model.Requests;

@Repository
public interface RequestRepository extends CrudRepository<Requests, Integer> {

	@Override
	<S extends Requests> S save(S s);
	
}
