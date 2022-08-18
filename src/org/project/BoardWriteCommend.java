package org.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardWriteCommend implements ExcuteCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("BoardWriteCommend");
		
		int mId=Integer.parseInt(request.getParameter("mId"));
		String nickName=request.getParameter("nickName");
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		String sDate=request.getParameter("sDate");
		
		Dao dao=Dao.getInstance();
		int rs=dao.boardWriteDo(mId, nickName, title, content, sDate);
		
		String url="";
		if(rs!=1) {
			System.out.println("게시글 작성 Fail");
			url="/index.do";
		} else {
			System.out.println("게시글 작성 Ok");
			url="/boardListView.do";
		}
		request.setAttribute("url", url);
	}

}
