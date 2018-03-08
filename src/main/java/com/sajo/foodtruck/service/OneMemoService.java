package com.sajo.foodtruck.service;

import java.util.List;
import java.util.Map;

public interface OneMemoService {
	//목록용]
	List<OneMemoDto> selectList(Map map);
	//전체 레코드 수]
	int getTotalCount(Map map);
	//상세보기용]
	OneMemoDto selectOne(OneMemoDto dto);
	//입력/수정/삭제용]
	int insert(OneMemoDto dto);
	int update(OneMemoDto dto);
	int delete(OneMemoDto dto);
	//로그인 용]
	boolean isMember(Map map);
}
