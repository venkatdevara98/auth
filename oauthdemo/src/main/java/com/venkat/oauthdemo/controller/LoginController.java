package com.venkat.oauthdemo.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	  @GetMapping("/noAuth")
	  public String noAuth() {
		  return "You need not login to see this";
	  }
	  
	  @GetMapping("/authRequired")
	  public String authRequired() {
		  return "You have to be logged in to see this";
	  }
	  
	  @RequestMapping("/user")
	  public Principal user(Principal principal) {
		  return principal;
	  }
}
