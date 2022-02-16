package com.generation.helloworld.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   
@RequestMapping("/hello")
public class HelloContoller { 
	
	@GetMapping 
	public String getHello () {
		return "Hello World";
	}
	
	@GetMapping ("/turma44")
	public String getHello2 () {
		return "A turma 44 é TOP";
	}
	
	@GetMapping ("/melhor")
	public String getHello3 () {
		return "A turma 44 é TOP, melhor que a 46";
	}
}
