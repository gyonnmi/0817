package org.project;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardListViewCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("BoardListViewCommend");
		
		Dao dao=Dao.getInstance();
		ArrayList<BoardDto> lists=dao.list();
		
		String url="";
		if(lists!=null) {
			System.out.println("게시글 조회 Ok");
			url="/boardListView.jsp";
			request.setAttribute("lists", lists);
		} else {
			System.out.println("게시글 조회 Fail");
			url="/index.do";
		}
		request.setAttribute("url", url);
	}

}
