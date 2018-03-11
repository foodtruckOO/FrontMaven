package com.sajo.foodtruck.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sajo.foodtruck.impl.OneMemoServiceImpl;
import com.sajo.foodtruck.impl.PagingUtil;
import com.sajo.foodtruck.service.OneMemoDto;

@Controller
public class OneMemoController {
	//서비스 주입]
	@Resource(name="oneMemoService")
	private OneMemoServiceImpl service;
	
	//로그인 폼으로 이동]
	@RequestMapping("/Login/Login.do")
	public String login() throws Exception{
		return "login/Login";
	}
	/*
	//로그인 처리]
	@RequestMapping("/Login/LoginProcess.do")
	public String loginProcess(
			HttpSession session,
			@RequestParam Map map,
			Model model) throws Exception{
		//서비스 호출]
		boolean flag=service.isMember(map);
		if(!flag)//비회원
			model.addAttribute("loginError", "아뒤비번 불일치");
		else	//회원인 경우]
			    //로그인 처리
			session.setAttribute("id", map.get("id"));
		return "forward:/Login/Login.do";
	}/////////////////////
	//로그아웃 처리]
	@RequestMapping("/Login/Logout.do")
	public String logout(HttpSession session) throws Exception{
		//로그아웃 처리]
		session.invalidate();
		return "forward:/Login/Login.do";
	}//////////////////////////////////////
	//목록처리]
	//리소스파일(memo.properties)에서 읽어오기
	//리소스파일(resource.properties)에서 읽어오기
	
	@Value("${PAGESIZE}")
	private int pageSize;
	@Value("${BLOCKPAGE}")
	private int blockPage;
	
	@RequestMapping("/BBS/List.do")
	public String list(Model model,HttpServletRequest req,@RequestParam(required=false,defaultValue="1") int nowPage) throws Exception{
		//페이징을 위한 로직 시작]
		//전체 레코드 수
		int totalRecordCount = service.getTotalCount(null);
		//전체 페이지수]
		int totalPage =(int)Math.ceil((double)totalRecordCount/pageSize);		
		//시작 및 끝 ROWNUM구하기]
		int start= (nowPage-1)*pageSize +1;
		int end  = nowPage*pageSize;
		//페이징을 위한 로직 끝]

		//서비스 호출]
		Map map = new HashMap();
		map.put("start", start);
		map.put("end", end);
		List<OneMemoDto> list=service.selectList(map);
		//데이타 저장]
		String pagingString = PagingUtil.pagingBootStrapStyle(totalRecordCount,pageSize,blockPage, nowPage,req.getContextPath()+"/BBS/List.do?");
		model.addAttribute("list", list);
		model.addAttribute("pagingString", pagingString);
		model.addAttribute("nowPage", nowPage);
		model.addAttribute("pageSize", pageSize);
		model.addAttribute("totalRecordCount", totalRecordCount);
		return "bbs/List.tiles";
	}//////////////////////////////
	//글등록 폼으로 이동]
	@RequestMapping(value="/BBS/Write.do",
			method=RequestMethod.GET)
	public String write() throws Exception{
		return "bbs/Write.tiles";
	}////////////////////////////
	//글등록 처리]
	@RequestMapping(value="/BBS/Write.do",
			method=RequestMethod.POST)
	public String writeOk(OneMemoDto dto,HttpSession session) throws Exception{
		//서비스 호출]
		//작성자의 id를 DTO에설정
		dto.setId(session.getAttribute("id").toString());
		service.insert(dto);
		//목록으로 이동
		return "forward:/BBS/List.do";
	}////////////////////////////
	//상세보기]
	@RequestMapping("/BBS/View.do")
	public String view(OneMemoDto onememo,Model model) throws Exception{
		//서비스 호출]
		OneMemoDto dto=service.selectOne(onememo);
		//각 메모글에 따른 코멘트들 가져오기
		Map map = new HashMap();
		map.put("no", onememo.getNo());
		List<CommentDto> comments = commentService.selectList(map);
		//데이타 저장]
		//내용 줄바꿈 처리
		dto.setContent(dto.getContent().replace("\r\n","<br/>"));
		model.addAttribute("dto", dto);
		model.addAttribute("comments", comments);
		return "bbs/View.tiles";
	}///////////////////////////
	
	//수정폼 및 수정 처리
	@RequestMapping("/BBS/Edit.do")
	public String update(OneMemoDto memo, HttpServletRequest req) throws Exception{
		if(req.getMethod().equals("GET")) {//수정폼으로
			//서비스 호출
			OneMemoDto dto = service.selectOne(memo);
			//데이터 저장
			req.setAttribute("dto", dto);
			return "bbs/Edit.tiles";
		}
		int affected = service.update(memo);
		//데이터 저장
		req.setAttribute("WHERE", "EDT");
		req.setAttribute("SUC_FAIL", affected);
		return "bbs/Message";		
	}
	//삭제 처리
	@RequestMapping("/BBS/Delete.do")
	public String delete(OneMemoDto dto,Model model) throws Exception{
		//서비스 호출
		int affected = service.delete(dto);
		//데이터 저장
		model.addAttribute("SUC_FAIL",affected);
		//목록으로 이동
		return "bbs/Message";
	}
	
	//한줄 코멘트 입력
	@RequestMapping("/Comment/Write.do")
	public String commentWrite(CommentDto dto,HttpSession session) throws Exception{
		//서비스 호출
		//아이디 설정
		dto.setId(session.getAttribute("id").toString());
		commentService.insert(dto);
		//뷰정보 반환
		return "forward:/BBS/View.do";
	}
	
	//한줄 코멘트 수정
	@RequestMapping("/Comment.Edit.do")
	public String commentEdit(CommentDto dto) throws Exception{
		//서비스 호출
		commentService.update(dto);
		
		//뷰정보 반환
		return "forward:/BBS/View.do";
	}
	
	//한줄 코멘트 삭제
	@RequestMapping("/Comment/Delete.do")
	public String commentDelete(CommentDto dto) throws Exception{
		//서비스 호출
		commentService.delete(dto);
		//뷰정보 반환
		return "forward:/BBS/View.do";
	}*/
}
