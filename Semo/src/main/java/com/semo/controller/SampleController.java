package com.semo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@Log
@RestController
public class SampleController {
	
	@GetMapping("/hello")
	public String hello() {

		return "hi, 나는 정상 작동 중 8번째, pull 연습";
	}
}
