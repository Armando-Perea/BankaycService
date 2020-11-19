package com.java.bankayc.app.repo.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.java.bankayc.app.model.Requests;

public class RequestBuilder {
	
	public static Logger logger = Logger.getLogger(RequestBuilder.class.getName());

	public static Requests getRequest(String methodCalled){	
		Requests requests = new Requests();
		try {
		requests.setId(0);
		requests.setMethodCalled(methodCalled);
		requests.setOriginIp(InetAddress.getLocalHost().toString());
		requests.setRequestDate(LocalDate.now());
		} catch (UnknownHostException ex) {
			logger.info("Error at RequestBuilder getRequest: "+ex);
		}
		return requests;
	}
}
