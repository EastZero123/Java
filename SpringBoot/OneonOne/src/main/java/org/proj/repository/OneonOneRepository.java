package org.proj.repository;

import org.proj.repository.search.OneonOneSearch;
import org.proj.vo.OneonOne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OneonOneRepository extends JpaRepository<OneonOne, Long>, OneonOneSearch {

}
