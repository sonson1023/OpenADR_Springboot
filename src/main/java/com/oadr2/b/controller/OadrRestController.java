package com.oadr2.b.controller;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.oadr2.b.OadrQueryRegistration;
import com.oadr2.b.services.OadrHttpUtils;

@RestController
public class OadrRestController {
	OadrHttpUtils oHttp ;
//	@GetMapping("/oadr/eiregister")
	@RequestMapping(value="/oadr", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public String register() {
		return "SUCCESS";
	}
	
	@CrossOrigin("*")
	@RequestMapping(value="/eiregister", method=RequestMethod.POST)
	public void eiregister(@RequestBody Map<String, Object>payload,  HttpServletResponse response) throws JAXBException, IOException {
		String venID = (String) payload.get("venID");
		String venName = (String)payload.get("venName");
		String vtnIP = (String)payload.get("vtnIP");
		System.out.println("venID : " + venID);
		System.out.println("venName : " + venName);
		
		oHttp = new OadrHttpUtils(vtnIP);
		OadrQueryRegistration query = new OadrQueryRegistration();
		query.setRequestID(UUID.randomUUID().toString());
		query.setSchemaVersion("2.0B");
		//
		
		
		
		
		response.setStatus(HttpServletResponse.SC_ACCEPTED);
	}
	
	public String index() {
		return "Hello!!";
	}
	

}
