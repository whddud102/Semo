package com.semo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping("/hello")
	public String hello() {
		return "hi, 나는 정상 작동 중 4번째";
	}
}
