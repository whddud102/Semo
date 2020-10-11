package com.semo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semo.domain.Advertisement;
import com.semo.domain.Criteria;
import com.semo.mapper.GalleryMapper;

import lombok.extern.java.Log;

@Log
@Service
public class GalleryServiceImpl implements GalleryService{
	
	@Autowired
	private GalleryMapper galleryMapper;
	
	public List<Advertisement> getList(Criteria cri) {
		log.info("getList(" + cri + ")");
		List<Advertisement> result = galleryMapper.getList(cri);
		
		for(Advertisement ad : result) {
			log.info(ad.toString());
		}
		
		return result;
	};
}
