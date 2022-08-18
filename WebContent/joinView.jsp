<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
<link rel="stylesheet" href="css/join.css" />
<script src="js/joinOk.js" defer></script>
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="container">
		<div class="inner-con">
			<form action="joinOk.do" method="post" id="joinForm">
				<table>
					<thead>
						<tr>
							<th>회원 가입</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>
								<input type="text" name="userId" id="userId" placeholder="아이디 입력" />
								<input type="button" id="idCheckBtn" value="아이디체크" />
							</td>
						</tr>
						<tr>
							<td>
								<input type="password" name="userPw" id="userPw" placeholder="비밀번호 입력" class="i1"/>
							</td>
						</tr>
						<tr>
							<td>
								<input type="password" name="userPw2" id="userPw2" placeholder="비밀번호 확인" class="i1"/>
							</td>
						</tr>
						<tr>
							<td><span id="pwch" class="pwch2"></span></td>
						</tr>
						<tr>
							<td>
								<input type="text" name="userName" id="userName" placeholder="이름 입력" class="i1"/>
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td>
								<input type="button" id="joinOkBtn" value="회원가입" />
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