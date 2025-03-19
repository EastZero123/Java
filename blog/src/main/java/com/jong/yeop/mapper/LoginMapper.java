package com.jong.yeop.mapper;

import com.jong.yeop.model.LoginVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginMapper {

    void save(@Param("mem") LoginVO loginVO);

    LoginVO login(String id, String password);
}
