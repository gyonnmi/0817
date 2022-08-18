package org.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardViewCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("BoardViewCommend");
		
		int mId=Integer.parseInt(request.getParameter("mId"));
		
		Dao dao=Dao.getInstance();
		BoardDto board=dao.boardViewDo(mId);
		
		String url="";
		if(board!=null) {
			System.out.println("게시글 상세 조회 Ok");
			url="/boardView.jsp";
			request.setAttribute("board", board);
		} else {
			System.out.println("게시글 상세 조회 Fail");
			url="/index.do";
		}
		request.setAttribute("url", url);
	}

}
