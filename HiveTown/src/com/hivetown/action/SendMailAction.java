package com.hivetown.action;

public class SendMailAction {
	private String username;
	 
	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}
 
	// all struts logic here
	public String execute() {
 
		return "SUCCESS";
 
	}
}
