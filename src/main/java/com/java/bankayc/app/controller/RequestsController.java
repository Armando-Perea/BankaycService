package com.java.bankayc.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.bankayc.app.model.Requests;
import com.java.bankayc.app.repo.impl.RequestRepoImpl;

@RestController
@RequestMapping("request/")
public class RequestsController {

	RequestRepoImpl requestRepository;

	public RequestsController(RequestRepoImpl requestRepository) {
		this.requestRepository = requestRepository;
	}

	@GetMapping("/getAllRequests")
	public List<Requests> getAllCartSale() {
		return requestRepository.getAllRequests();
	}

	@GetMapping("/getRequestsById/{id}")
	public Optional<Requests> getCashById(@PathVariable Integer id) {
		return requestRepository.getRequestsById(id);
	}

	@PostMapping("/createRequests")
	public Requests createCash(@RequestBody Requests requests) {
		return requestRepository.saveRequests(requests);
	}

	@PutMapping("/updateRequests")
	public Requests updateCash(@RequestBody Requests requests) {
		return requestRepository.saveRequests(requests);
	}

	@DeleteMapping("/deleteRequests/{id}")
	public void deleteCash(@PathVariable Integer id) {
		requestRepository.deleteRequests(id);
	}

}
