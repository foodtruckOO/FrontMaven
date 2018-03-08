package com.sajo.foodtruck.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.sajo.foodtruck.service.OneMemoDto;
import com.sajo.foodtruck.service.OneMemoService;

@Repository
public class OneMemoDao implements OneMemoService {
	
	//SqlSessionTemplate객체 주입]
	@Resource(name="sqlMapper")
	private SqlSessionTemplate sqlMapper;
	
	//목록용]
	@Override
	public List<OneMemoDto> selectList(Map map) {
		return sqlMapper.selectList("memoSelectList",map);		
	}////////////////

	@Override
	public int getTotalCount(Map map) {
		return sqlMapper.selectOne("memoTotalCount",map);
	}
	//상세보기용]
	@Override
	public OneMemoDto selectOne(OneMemoDto dto) {
		
		return sqlMapper.selectOne("memoSelectOne",dto);
	}////////////////////
	//입력처리용]
	@Override
	public int insert(OneMemoDto dto) {		
		return sqlMapper.insert("memoInsert",dto);
	}////////////////////////////

	@Override
	public int update(OneMemoDto dto) {
		// TODO Auto-generated method stub
		return sqlMapper.update("memoUpdate",dto);
	}

	@Override
	public int delete(OneMemoDto dto) {
		/*메모 삭제 - 프로그래밍적으로 혹은 부모 삭제시 자동으로 해당 자식도 삭제하도록 FK설정
		 * REFERENCES 부모테이블(PK컬럼) ON CASCADE DELETE
		 */
		
		sqlMapper.delete("commentDeleteByNO",dto);
		//메모글 삭제
		int affected = sqlMapper.delete("memoDelete",dto);
		return affected;
	}

	@Override
	public boolean isMember(Map map) {
		return (Integer)sqlMapper.selectOne("memoIsMember",map)==1 ? true:false;
		
	}//////////////////////////////

}
