<%@page import="java.text.SimpleDateFormat"%>
<%@page import="org.project.BoardDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<BoardDto> lists = (ArrayList<BoardDto>)request.getAttribute("lists");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardList</title>
<link rel="stylesheet" href="css/boardList.css" />
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="container">
		<div class="inner-con">
			<table>
				<thead>
					<tr>
						<th colspan="6" class="t1">게시글 목록</th>
					</tr>
					<tr>
						<th>번호</th>
						<th>닉네임</th>
						<th class="a1">제목</th>
						<th class="a2">내용</th>
						<th>작성시간</th>
						<th>보기</th>
					</tr>
				</thead>
				<tbody>
						<%
							for(BoardDto list:lists) {
					/* 		Date day1=list.getsDate();
							SimpleDateFormat simp=new SimpleDateFormat("YYYY년 MM월 DD일");
							String day2=simp.format(day1); */
						%>
					<tr>
						<td><%=list.getmId() %></td>
						<td><%=list.getNickName() %></td>
						<td><%=list.getTitle() %></td>
						<td><%=list.getContent() %></td>
						<td><%=list.getsDate() %></td>
						<td><a href="boardView.do?mId=<%=list.getmId() %>">내용보기</a></td>
						<%		
							}
						%>					
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="6"><a href="boardWriteView.do">글쓰기</a></td>
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>