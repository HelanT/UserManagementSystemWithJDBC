package com.takeo.query;

public interface QueryConstants {
	
	public String USER_INSERT_QUERY = "insert into login(first_name,last_name,email,username,password)values(?,?,?,?,?)";
	
	public String USER_SELECT_QUERY ="select * from login";
	
	public String USER_VALID_QUERY = "select * from login where email=? and password =?";

}
