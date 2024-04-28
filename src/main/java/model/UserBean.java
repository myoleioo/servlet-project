package model;

import java.io.Serializable;
import java.util.ArrayList;

public class UserBean implements Serializable{
	private int userId;
	private String userName;
	private String userEmail;
	private String password;
	private String conPassword;
	public UserBean() {
		super();
		
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}
	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the conPassword
	 */
	public String getConPassword() {
		return conPassword;
	}
	/**
	 * @param conPassword the conPassword to set
	 */
	public void setConPassword(String conPassword) {
		this.conPassword = conPassword;
	}
	
}
