package com.vam.service;

import org.springframework.stereotype.Service;

import com.vam.model.MemberVO;

public interface MemberService {
	
	public void memberJoin(MemberVO member) throws Exception;

	public int idCheck(String memberId);

}
