package org.zerock.domain;

import java.util.Date;

public class MemberVO {
	
	private String userid;
	private String userpw;
	private String username;
	private String email;
	private Date regdate;
	private Date updatedate;
	
	
	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}
	/**
	 * @return the userpw
	 */
	public String getUserpw() {
		return userpw;
	}
	/**
	 * @param userpw the userpw to set
	 */
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the regdate
	 */
	public Date getRegdate() {
		return regdate;
	}
	/**
	 * @param regdate the regdate to set
	 */
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	/**
	 * @return the updatedate
	 */
	public Date getUpdatedate() {
		return updatedate;
	}
	/**
	 * @param updatedate the updatedate to set
	 */
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", userpw=" + userpw
				+ ", username=" + username + ", email=" + email + ", regdate="
				+ regdate + ", updatedate=" + updatedate + "]";
	}
	
	
	
}
