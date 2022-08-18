<%@page import="org.project.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardDto board = (BoardDto)request.getAttribute("board");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board</title>
<link rel="stylesheet" href="css/boardView.css" />
<script src="js/updateOk.js" defer></script>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="container">
		<div class="inner-con">
			<form action="updateOk.do" method="post" id="updateForm">
				<table>
					<thead>
						<tr>
							<th colspan="2">게시글 상세보기 / 수정</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><label for="mId">번호</label></td>
							<td>
								<input type="hidden" name="mId" id="mId" value="<%=board.getmId() %>" />
								<span><%=board.getmId() %></span>
							</td>
						</tr>
						<tr>
							<td><label for="nickName">닉네임</label></td>
							<td>
								<input type="text" name="nickName" id="nickName" value="<%=board.getNickName() %>" />
							</td>
						</tr>
						<tr>
							<td><label for="title">제목</label></td>
							<td>
								<input type="text" name="title" id="title" value="<%=board.getTitle() %>" />
							</td>
						</tr>
						<tr>
							<td><label for="content">내용</label></td>
							<td>
								<textarea rows="10" cols="25" name="content" id="content" style="resize: none" >
									<%=board.getContent() %>
								</textarea>
							</td>
						</tr>
						<tr>
							<td><label for="sDate">작성시간</label></td>
							<td>
								<input type="text" name="sDate" id="sDate" value="<%=board.getsDate() %>" />
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td colspan="2">
								<input type="button" id="updateOkBtn" value="수정하기" />
							</td>
						</tr>
					</tfoot>
				</table>
			</form>
		</div>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>