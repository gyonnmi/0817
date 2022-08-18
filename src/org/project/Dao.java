package org.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class Dao {
	private static class singleton {
		private static final Dao INSTANCE=new Dao(); 
	}
	
	private Dao() {}
	
	public static Dao getInstance() {
		return singleton.INSTANCE;
	}
	
	
	//회원가입
	public int insertDo(String userId, String userPw, String userName) {
		int rs=0;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		String query="";
		
		try {
			conn=DBConnet.getConnetion();
			query="insert into member_0817 values (?,?,?)";
			pstm=conn.prepareStatement(query);
			pstm.setString(1, userId);
			pstm.setString(2, userPw);
			pstm.setString(3, userName);
			
			rs=pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return rs;
	}
	
	
	//게시글 목록 조회
	public ArrayList<BoardDto> list() {
		ArrayList<BoardDto> lists = new ArrayList<BoardDto>();
		
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		String query="";
		
		try {
			conn=DBConnet.getConnetion();
			query="select * from board_0817";
			pstm=conn.prepareStatement(query);
			rs=pstm.executeQuery();
			while(rs.next()) {
				lists.add(new BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getDate(5)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
				if(rs!=null) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return lists;
	}
	
	
	//게시글 상세 조회
	public BoardDto boardViewDo(int mId) {
		BoardDto board=null;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		String query="";
		
		try {
			conn=DBConnet.getConnetion();
			query="select * from board_0817 where mId=?";
			pstm=conn.prepareStatement(query);
			pstm.setInt(1, mId);
			rs=pstm.executeQuery();
			if(rs.next()) {
				board=new BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getDate(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
				if(rs!=null) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return board;
	}
	
	
	//게시글 수정
	public int updateDo(int mId, String nickName, String title, String content, String sDate) {
		int rs=0;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		String query="";
		
		try {
			conn=DBConnet.getConnetion();
			query="update board_0817 set nickName=?, title=?, content=?, sDate=? "
					+ "where mId=?";
			pstm=conn.prepareStatement(query);
			pstm.setString(1, nickName);
			pstm.setString(2, title);
			pstm.setString(3, content);
			pstm.setString(4, sDate);
			pstm.setInt(5, mId);
			rs=pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return rs;
	}
	
	
	//게시글번호 마지막번호+1
	public int maxNo() {
		int maxNo=0;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		String query="";
		
		try {
			conn=DBConnet.getConnetion();
			query="select max(mId)+1 from board_0817";
			pstm=conn.prepareStatement(query);
			rs=pstm.executeQuery();
			if(rs.next()) {
				maxNo=rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}	
		return maxNo;
	}
	
	
	//게시글 작성
	public int boardWriteDo(int mId, String nickName, String title, String content, String sDate) {
		int rs=0;
		
		Connection conn=null;
		PreparedStatement pstm=null;
		String query="";
		
		try {
			conn=DBConnet.getConnetion();
			query="insert into board_0817 values (?,?,?,?,?)";
			pstm=conn.prepareStatement(query);
			pstm.setInt(1, mId);
			pstm.setString(2, nickName);
			pstm.setString(3, title);
			pstm.setString(4, content);
			pstm.setString(5, sDate);

			rs=pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null) conn.close();
				if(pstm!=null) pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return rs;
	}
	
	
	
	
	
	
	
	
	
}
