package org.zerock.controller;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/root-context.xml" })
public class CTest {

	private static final Logger log = Logger.getLogger(CTest.class);

//	private DataSource dataSource;
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	final String DRIVER = "org.mariadb.jdbc.Driver";
	final String URL = "jdbc:mariadb://127.0.0.1:3306";
	final String USER = "book_ex";
	final String PASSWORD = "book_ex";

//	@Test
//	public void mariaTest() throws Exception {
//		try {
//			Connection con = dataSource.getConnection();
//			log.info("Connection: " + con);
//		} catch (Exception e) {
//			// TODO: handle exception
//			fail(e.getMessage());
//		}
//	}

	@Test
	public void sqlSessionFactoryTest() {
		try {
			SqlSession session = sqlSessionFactory.openSession();
			Connection connection = session.getConnection();
			log.info("Session: " + session);
			log.info("Connection: " + connection);
		} catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
	}
}
