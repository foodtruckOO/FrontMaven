package com.sajo.foodtruck.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.sajo.foodtruck.service.CommentDto;
import com.sajo.foodtruck.service.CommentService;
import com.sajo.foodtruck.service.OneMemoDto;

@Repository
public class CommentDao implements CommentService{
	
	//SqlSessionTemplate객체 주입
	@Resource(name="sqlMapper")
	private SqlSessionTemplate sqlMapper;
	
	@Override
	public List<CommentDto> selectList(Map map) {
		return sqlMapper.selectList("commentSelectList",map);
	}

	@Override
	public int getTotalCount(Map map) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public OneMemoDto selectOne(CommentDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(CommentDto dto) {
		return sqlMapper.insert("commentInsert",dto);
	}

	@Override
	public int update(CommentDto dto) {
		return sqlMapper.update("commentUpdate", dto);
	}

	@Override
	public int delete(CommentDto dto) {
		return sqlMapper.delete("commentDelete", dto);
	}
	
}
