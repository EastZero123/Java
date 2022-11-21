package org.proj.repository.search;

import org.proj.vo.OneonOne;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface OneonOneSearch {

	Page<OneonOne> search1(Pageable pageable);

	Page<OneonOne> searchAll(String[] types, String keyword, Pageable pageable);
}
