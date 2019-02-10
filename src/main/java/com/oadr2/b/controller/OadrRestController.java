package com.oadr2.b.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OadrRestController {
	
//	@GetMapping("/oadr/eiregister")
	@RequestMapping(value="/oadr", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public String register() {
		return "SUCCESS";
	}
	
	@RequestMapping(value="/eiregister", method=RequestMethod.POST)
	public String eiregister(@RequestBody Map<String, Object>payload) {
		String value1 = (String) payload.get("ID");
		System.out.println(value1);
		return value1;
	}
	
	public String index() {
		return "Hello!!";
	}
	

}
