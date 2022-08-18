/*updateOk.js*/

const updateForm=document.querySelector('#updateForm');
const mId=document.querySelector('#mId');
const nickName=document.querySelector('#nickName');
const title=document.querySelector('#title');
const content=document.querySelector('#content');
const sDate=document.querySelector('#sDate');
const updateOkBtn=document.querySelector('#updateOkBtn');


//유효성 검사
updateOkBtn.addEventListener('click', ()=>{
	if(mId==null || mId.value=="" || mId.value<=0) {
		alert("번호 미입력");
		mId.focus();
		return false;
	}
	if(nickName==null || nickName.value=="" || nickName.value<=0) {
		alert("닉네임 미입력");
		nickName.focus();
		return false;
	}
	if(title==null || title.value=="" || title.value<=0) {
		alert("제목 미입력");
		title.focus();
		return false;
	}
	if(content==null || content.value=="" || content.value<=0) {
		alert("내용 미입력");
		content.focus();
		return false;
	}
	if(sDate==null || sDate.value=="" || sDate.value<=0) {
		alert("작성일시 미입력");
		sDate.focus();
		return false;
	}
	alert("회원정보 수정 완료!");
	updateForm.submit();
});
















