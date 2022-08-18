package org.project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JoinOkCommend implements ExcuteCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("JoinOkCommend");
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		String userName=request.getParameter("userName");
		
		Dao dao=Dao.getInstance();
		int rs=dao.insertDo(userId, userPw, userName);
		
		String url="";
		if(rs!=1) {
			System.out.println("회원가입 실패");
			url="/index.do";
		} else {
			System.out.println("회원가입 성공");
			url="/index.do";
		}
		request.setAttribute("url", url);
	}

}
