<%@page import="org.project.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Dao dao=Dao.getInstance();
	int mId=dao.maxNo();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Write</title>
<link rel="stylesheet" href="css/boardWrite.css" />
<script src="js/writeOk.js" defer></script>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="container">
		<div class="inner-con">
			<form action="writeOk.do" method="post" id="writeForm">
				<table>
					<thead>
						<tr>
							<th colspan="2">게시글 작성하기</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><label for="mId">번호</label></td>
							<td>
								<input type="hidden" name="mId" id="mId" value="<%=mId%>"/>
								<span><%=mId %></span>
							</td>
						</tr>
						<tr>
							<td><label for="nickName">닉네임</label></td>
							<td>
								<input type="text" name="nickName" id="nickName" />
							</td>
						</tr>
						<tr>
							<td><label for="title">제목</label></td>
							<td>
								<input type="text" name="title" id="title" />
							</td>
						</tr>
						<tr>
							<td><label for="content">내용</label></td>
							<td>
								<textarea rows="10" cols="25" name="content" id="content" style="resize: none" >
								</textarea>
							</td>
						</tr>
						<tr>
							<td><label for="sDate">작성일시</label></td>
							<td>
								<input type="text" name="sDate" id="sDate" />
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td colspan="2">
								<input type="button" id="writeOkBtn" value="작성하기" />
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