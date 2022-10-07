package org.hdcd.controller.service;

import java.util.List;


import org.hdcd.controller.repository.BoardRepository;
import org.hdcd.domain.Board;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

	private final BoardRepository repository;

	@Override
	@Transactional
	public void register(Board board) throws Exception {
		// TODO Auto-generated method stub
		repository.save(board);
	}

	@Override
	@Transactional
	public List<Board> list() throws Exception {
		// TODO Auto-generated method stub
		return repository.findAll(Sort.by(Direction.DESC, "boardNo"));
	}

	@Override
	@Transactional(readOnly = true)
	public Board read(Long boardNo) throws Exception {
		// TODO Auto-generated method stub
		return repository.getOne(boardNo);
	}
}
