package com.semo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.semo.domain.Advertisement;

@Mapper
public interface GalleryMapper {
	public List<Advertisement> getList(int menu_num);
}
