package org.hdcd.controller;

import org.hdcd.controller.service.BoardService;
import org.hdcd.domain.Board;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/board")
public class BoardController {

	private final BoardService service;

	@GetMapping("/register")
	public void registerForm(Board board, Model model) throws Exception {

	}

	@PostMapping("/register")
	public String register(Board board, RedirectAttributes rttr) throws Exception {
		service.register(board);

		rttr.addFlashAttribute("msg", "등록이 완료되었습니다.");

		return "redirect:/board/list";
	}
	
	@GetMapping("/list")
	public void list(Model model) throws Exception {
		model.addAttribute("list", service.list());
	}
	
	@GetMapping("/read")
	public void read(Long boardNo, Model model) throws Exception {
		model.addAttribute(service.read(boardNo));
	}
}
