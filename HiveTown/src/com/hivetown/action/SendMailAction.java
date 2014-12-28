package com.hivetown.action;

import com.hivetown.Impl.SendMailImpl;

public class SendMailAction {
	private String emailId;

	private String content;

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	// all struts logic here
	public String execute() {
		System.out.println("here " + emailId + "..........." + content);
		SendMailImpl.SendMail(emailId, content);
		return "SUCCESS";

	}
}
