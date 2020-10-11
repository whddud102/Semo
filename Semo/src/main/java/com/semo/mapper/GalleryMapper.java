package com.semo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.semo.domain.Advertisement;
import com.semo.domain.Criteria;

@Mapper
public interface GalleryMapper {
	public List<Advertisement> getList(Criteria cri);
}
