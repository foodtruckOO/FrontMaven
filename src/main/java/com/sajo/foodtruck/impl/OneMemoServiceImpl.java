package com.sajo.foodtruck.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sajo.foodtruck.service.OneMemoDto;
import com.sajo.foodtruck.service.OneMemoService;

@Service("oneMemoService")
public class OneMemoServiceImpl implements OneMemoService {

	//OneMemoDAO객체 주입]
	@Resource(name="oneMemoDao")
	private OneMemoDao dao;	
	
	@Override
	public List<OneMemoDto> selectList(Map map) {		
		return dao.selectList(map);
	}/////////////////////////

	@Override
	public int getTotalCount(Map map) {	
		return dao.getTotalCount(map);
	}///////////////////

	@Override
	public OneMemoDto selectOne(OneMemoDto dto) {		
		return dao.selectOne(dto);
	}////////////////////

	@Override
	public int insert(OneMemoDto dto) {		
		return dao.insert(dto);
	}//////////////////////

	@Override
	public int update(OneMemoDto dto) {		
		return dao.update(dto);
	}//////////////////////////////

	@Override
	public int delete(OneMemoDto dto) {		
		return dao.delete(dto);
	}/////////////////////////

	@Override
	public boolean isMember(Map map) {		
		return dao.isMember(map);
	}/////////////////////////

}
