package model1.board;

import javax.servlet.ServletContext;

import common.JDBCConnect;

public class BoardDAO extends JDBCConnect {

	public BoardDAO(ServletContext application) {
		super(application);
	}
}
