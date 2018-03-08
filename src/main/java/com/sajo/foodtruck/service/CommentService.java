package com.sajo.foodtruck.service;

import java.util.List;
import java.util.Map;

public interface CommentService {
	//목록용
	List<CommentDto> selectList(Map map);
	//전체 레코드 수 
	int getTotalCount(Map map);
	//상세 보기용
	OneMemoDto selectOne(CommentDto dto);
	//입력/수정/삭제용
	int insert(CommentDto dto);
	int update(CommentDto dto);
	int delete(CommentDto dto);
}
