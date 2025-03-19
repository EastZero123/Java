package com.jong.yeop.service;

import com.jong.yeop.mapper.LoginMapper;
import com.jong.yeop.model.LoginVO;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private LoginMapper loginMapper;

    private LoginService(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    public LoginVO login(String id, String password) {
        return loginMapper.login(id, password);
    }

    public void SignUp(LoginVO loginVO) {
        loginMapper.save(loginVO);
    }
}
