package org.proj.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class OneonOneDAO {

    private final SqlSession sqlSession;

    public OneonOneDAO(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<Object> selectAll() {
        return sqlSession.selectList("OneonOneDAO.selectAll");
    }
}
