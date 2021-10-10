package br.com.example.boleto.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String hello() {
		return "hello world Boleto!";
	}
}
