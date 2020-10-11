package com.semo.domain;

import lombok.Data;

@Data
public class Criteria {
	int num;	// 메뉴 번호
	String keyword;	// 검색 키워드
	
	public Criteria(String num, String keyword) {
		this.num = num == null ? 1 : Integer.parseInt(num);
		this.keyword = keyword == null ? "#" : keyword;
	}
}
