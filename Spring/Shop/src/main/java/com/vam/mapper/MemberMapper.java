package com.vam.mapper;

import com.vam.model.MemberVO;

public interface MemberMapper {

	public void memberJoin(MemberVO member);
	
	public int idCheck(String memberId);
}
