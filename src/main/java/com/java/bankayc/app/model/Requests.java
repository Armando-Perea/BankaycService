package com.java.bankayc.app.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="requests", schema="bankayc")
@Entity
public class Requests {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	Integer id;
	
	@Column(name="originIp")
	String originIp;
	
	@Column(name="requestDate")
	LocalDate requestDate;
	
	@Column(name="methodCalled")
	String methodCalled;

	public Requests() {}

	
	public Requests(Integer id, String originIp, LocalDate requestDate, String methodCalled) {
		super();
		this.id = id;
		this.originIp = originIp;
		this.requestDate = requestDate;
		this.methodCalled = methodCalled;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOriginIp() {
		return originIp;
	}

	public void setOriginIp(String originIp) {
		this.originIp = originIp;
	}

	public LocalDate getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}

	public String getMethodCalled() {
		return methodCalled;
	}

	public void setMethodCalled(String methodCalled) {
		this.methodCalled = methodCalled;
	}

	@Override
	public String toString() {
		return "Requests [id=" + id + ", originIp=" + originIp + ", requestDate=" + requestDate + ", methodCalled="
				+ methodCalled + "]";
	}

	
}
