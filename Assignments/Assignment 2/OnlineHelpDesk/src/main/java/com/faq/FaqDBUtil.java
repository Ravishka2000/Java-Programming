package com.faq;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class FaqDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	@SuppressWarnings("unused")
	private static ResultSet rs  = null;
	
	public static boolean insertquestion(String stdID,String question) {
		
		isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into faq (id,student,question) values (0,'"+stdID+"','"+question+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
		
	}
	
	public static boolean updatefaq(String id,String question,String answer,String lecturer) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update faq set question = '"+question+"', answer = '"+answer+"', lecturer = '"+lecturer+"'"
					+"where id = '"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	public static boolean deletefaq(String id) {
		
		int conID = Integer.parseInt(id);
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from faq where id ='"+conID+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
    			isSuccess = true;
    		}
    		else {
    			isSuccess = false;
    		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
