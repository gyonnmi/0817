package org.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardUpdateCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("BoardUpdateCommend");
		
		int mId=Integer.parseInt(request.getParameter("mId"));
		String nickName=request.getParameter("nickName");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String sDate=request.getParameter("sDate");
		
		Dao dao=Dao.getInstance();
		int rs=dao.updateDo(mId, nickName, title, content, sDate);
		
		String url="";
		if(rs!=1) {
			System.out.println("게시글 수정 Fail");
			url="/index.do";
		} else {
			System.out.println("게시글 수정 Ok");
			url="/boardListView.do";
		}
		request.setAttribute("url", url);
	}

}
