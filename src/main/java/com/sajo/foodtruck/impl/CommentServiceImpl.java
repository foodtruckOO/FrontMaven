package com.sajo.foodtruck.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sajo.foodtruck.service.CommentDto;
import com.sajo.foodtruck.service.CommentService;
import com.sajo.foodtruck.service.OneMemoDto;

@Service("commentService")
public class CommentServiceImpl implements CommentService{
	
	//CommentDao주입
	@Resource(name="commentDao")
	private CommentDao dao;
	
	@Override
	public List<CommentDto> selectList(Map map) {
		return dao.selectList(map);
	}

	@Override
	public int getTotalCount(Map map) {
		return dao.getTotalCount(map);
	}

	@Override
	public OneMemoDto selectOne(CommentDto dto) {
		return dao.selectOne(dto);
	}

	@Override
	public int insert(CommentDto dto) {
		return dao.insert(dto);
	}

	@Override
	public int update(CommentDto dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(CommentDto dto) {
		return dao.delete(dto);
	}
}
