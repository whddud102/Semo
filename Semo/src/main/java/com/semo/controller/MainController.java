package com.semo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.semo.domain.Advertisement;
import com.semo.domain.Criteria;
import com.semo.domain.PageMaker;
import com.semo.service.GalleryService;

import lombok.extern.java.Log;

@Log
@Controller
public class MainController {
	
	@Autowired
	private GalleryService galleryService;
	
	@GetMapping("/gallery")
	public void goToGallery(Criteria cri, Model model) {
		log.info("갤러리로 이동 요청, 검색 조건 : " + cri);
		List<Advertisement> ad_list = galleryService.getList(cri);
		
		model.addAttribute("ad_list", ad_list);
		model.addAttribute("pageMaker", new PageMaker(cri));
	}
	
	@GetMapping("/detail")
	public void goToDetail() {
		log.info("상세 페이지로 이동");
	}
}
