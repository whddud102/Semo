package com.semo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.java.Log;

@Log
@Controller
public class MainController {
	
	@GetMapping("/gallery")
	public void goToGallery(String num) {
		log.info("갤러리로 이동 요청 (메뉴 : " + num + ")");
	}
}
