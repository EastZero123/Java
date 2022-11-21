package org.proj.service;

import java.util.List;

import org.proj.dto.OneonOneDTO;
import org.proj.dto.PageRequestDTO;
import org.proj.dto.PageResponseDTO;
import org.proj.vo.OneonOne;

public interface OneonOneService {

	public List<OneonOne> selectAll() throws Exception;

	void register(OneonOne oneonOne) throws Exception;
}
