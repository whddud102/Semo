package com.semo.service;

import java.util.List;

import com.semo.domain.Advertisement;
import com.semo.domain.Criteria;

public interface GalleryService {
	public List<Advertisement> getList(Criteria cri); 
}