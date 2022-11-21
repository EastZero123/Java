package org.proj.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.apache.ibatis.session.SqlSession;
import org.modelmapper.ModelMapper;
import org.proj.dao.OneonOneDAO;
import org.proj.dto.OneonOneDTO;
import org.proj.dto.PageRequestDTO;
import org.proj.dto.PageResponseDTO;
import org.proj.repository.OneonOneRepository;
import org.proj.vo.OneonOne;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
public class OneonOneServiceImpl implements OneonOneService {


    private final OneonOneDAO oneonOneDAO;

    private final SqlSession sqlSession;

    public OneonOneServiceImpl(OneonOneDAO oneonOneDAO, SqlSession sqlSession) {
        this.oneonOneDAO = oneonOneDAO;
        this.sqlSession = sqlSession;
    }

    @Override
    public List<OneonOne> selectAll() throws Exception {
        return sqlSession.selectList("OneonOneDAO.selectAll");
    }

    @Override
    public void register(OneonOne oneonOne) throws Exception {
        return sqlSession.insert("OneonOneDAO.register",oneonOne);
    }

}
