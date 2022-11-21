package org.proj.controller;

import java.util.List;
import java.util.Map;

import org.proj.dto.OneonOneDTO;
import org.proj.service.OneonOneService;
import org.proj.vo.OneonOne;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/oneonone")
public class OneonOneController {

	private final OneonOneService oneonOneService;

	public OneonOneController(OneonOneService oneonOneService) {
		this.oneonOneService = oneonOneService;
	}

	@ApiOperation(value = "1:1 Get", notes = "GET방식으로 1대1 문의조회")
	@GetMapping("/board/list")
	public ResponseEntity<List<OneonOne>> selectAll() throws Exception {
		List<OneonOne> vo = oneonOneService.selectAll();
		return ResponseEntity.ok().body(vo);
	}

	@ApiOperation(value = "1:1 Post", notes = "POST방식으로 1대1 문의등록")
	@PostMapping("/board/register")
	public ResponseEntity<String> register(@RequestParam OneonOne oneonOne){
		ResponseEntity<String> entity = null;
		try {
			oneonOneService.register(oneonOne);
			entity = new ResponseEntity<>("regSuccess", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
}
