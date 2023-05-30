package com.spring.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.BoardDTO;
import com.spring.domain.Criteria;
import com.spring.domain.PageDTO;
import com.spring.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService service;

	// 전체 리스트 보여주기 컨트롤러 작성 : list.jsp 보여주기
	@GetMapping("/list")
	public void listGet(Model model, @ModelAttribute("cri") Criteria cri) {
		log.info("전체 리스트 요청");
		log.info("type " + Arrays.toString(cri.getTypeArr()));
		// 사용자가 요청한 번호에 맞는 게시물 목록 요청
		List<BoardDTO> list = service.getList(cri);
		// 전체 게시물 숫자
		int total = service.getTotalCnt(cri);

		model.addAttribute("list", list);
		model.addAttribute("pageDTO", new PageDTO(cri, total));
	}

	// register.jsp 보여주기
	@GetMapping("/register")
	public void registerGet() {
		log.info("글 작성 폼 요청");
	}

	@PostMapping("/register")
	public String registerPost(BoardDTO dto, RedirectAttributes rttr, Criteria cri) {
		log.info("글 작성 등록 요청 " + dto);

		// 첨부파일 확인
//		if (dto.getAttaList() != null) {
//			dto.getAttaList().forEach(attach -> log.info(attach.toString()));
//		}
		
		  if (service.insert(dto)) {
		  
		  log.info("글 번호 : "+dto.getBno());
		  
		  rttr.addFlashAttribute("result",dto.getBno()); // 페이지 나누기 정보 주소줄에 같이 보내기
		  rttr.addAttribute("page", cri.getPage()); rttr.addAttribute("amount",
		  cri.getAmount()); return "redirect:/board/list"; }
		 
		return "/board/register";
	}

	// http://www.localhost:8080/board/read?bno=22
	// http://www.localhost:8080/board/modify?bno=22
	// bno에 맞는 내용 가져오기
	@GetMapping({ "/read", "/modify" })
	public void readPost(int bno, Model model, @ModelAttribute("cri") Criteria cri) {
		log.info("회원번호 요청 " + bno);

		// bno에 맞는 내용 가져오기
		BoardDTO dto = service.getRow(bno);
		model.addAttribute("dto", dto);
	}

	@PostMapping("/modify")
	public String modifyPost(BoardDTO dto, RedirectAttributes rttr, Criteria cri) {
		log.info("게시글 수정 요청 " + cri);
		// 성공 시 리스트
		service.update(dto);

		rttr.addFlashAttribute("result", "수정이 완료되었습니다.");

		// 페이지 나누기 정보 주소줄에 같이 보내기
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("amount", cri.getAmount());
		// 검색 정보
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());
		return "redirect:/board/list";
	}

	// 글삭제
	@GetMapping("/remove")
	public String removeGet(int bno, RedirectAttributes rttr, Criteria cri) {
		log.info("글 삭제 요청");
		service.delete(bno);

		rttr.addFlashAttribute("result", "삭제가 완료되었습니다.");

		// 페이지 나누기 정보 주소줄에 같이 보내기
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("amount", cri.getAmount());
		// 검색 정보
		rttr.addAttribute("type", cri.getType());
		rttr.addAttribute("keyword", cri.getKeyword());

		return "redirect:/board/list";

	}

}
