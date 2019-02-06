package com.seongwan.demo;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
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
	
	
	public String index() {
		return "Hello!!";
	}
	

}
