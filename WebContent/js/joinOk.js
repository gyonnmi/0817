/*joinOk.js*/

const joinForm=document.querySelector('#joinForm');
const userId=document.querySelector('#userId');
const idCheckBtn=document.querySelector('#idCheckBtn');
const userPw=document.querySelector('#userPw');
const userPw2=document.querySelector('#userPw2');
const userName=document.querySelector('#userName');
const joinOkBtn=document.querySelector('#joinOkBtn');

//비밀번호 체크
userPw2.addEventListener('keyup',()=>{
	if(userPw.value!=userPw2.value) {
		pwch.innerText="비밀번호가 틀립니다.";
		pwch.classList.remove('pwch2');
	} else {
		pwch.innerText="비밀번호가 일치합니다.";
		pwch.classList.add('pwch2');
	}
});

//유효성 검사
joinOkBtn.addEventListener('click', ()=>{
	if(userId==null || userId.value=="" || userId.value<=0) {
		alert("아이디 미입력");
		userId.focus();
		return false;
	}
	if(userPw==null || userPw.value=="" || userPw.value<=0) {
		alert("비밀번호 미입력");
		userPw.focus();
		return false;
	}
	if(userPw2==null || userPw2.value=="" || userPw2.value<=0) {
		alert("비밀번호 미입력");
		userPw2.focus();
		return false;
	}
	if(userPw.value!=userPw2.value) {
		alert("비밀번호가 일치하지 않습니다.");
		userPw2.focus();
		return false;
	}
	if(userName==null || userName.value=="" || userName.value<=0) {
		alert("이름 미입력");
		userName.focus();
		return false;
	}
	alert("회원가입 실행!");
	joinForm.submit();
});
















