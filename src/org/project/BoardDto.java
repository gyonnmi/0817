package org.project;

import java.util.Date;

public class BoardDto {
	private int mId;
	private String nickName;
	private String title;
	private String content;
	private Date sDate;
	
	public BoardDto(int mId, String nickName, String title, String content, Date sDate) {
		super();
		this.mId = mId;
		this.nickName = nickName;
		this.title = title;
		this.content = content;
		this.sDate = sDate;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getsDate() {
		return sDate;
	}

	public void setsDate(Date sDate) {
		this.sDate = sDate;
	}
	
	
	
}
