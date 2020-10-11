package com.semo.domain;

import lombok.Data;

@Data
public class PageMaker {
	int menu_num;
	
	public PageMaker (Criteria cri) {
		this.menu_num = cri.getNum();
	}
}
