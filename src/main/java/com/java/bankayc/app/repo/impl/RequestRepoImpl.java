package com.java.bankayc.app.repo.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.java.bankayc.app.model.Requests;
import com.java.bankayc.app.repository.RequestRepository;

@Repository
public class RequestRepoImpl {

	RequestRepository requestRepository;
	
	public RequestRepoImpl(RequestRepository requestRepository) {
		this.requestRepository = requestRepository;
	}

	public List<Requests> getAllRequests() {
		return (List<Requests>) requestRepository.findAll();
	}
	
	public Optional<Requests> getRequestsById(Integer id) {
		return requestRepository.findById(id);
	}
	
	public Requests saveRequests(Requests requests) {
		return requestRepository.save(requests);
	}
	
	public Requests updateRequests(Requests requests) {
		return requestRepository.save(requests);
	}
	
	public void deleteRequests(Integer id) {
		requestRepository.deleteById(id);
	}

}
