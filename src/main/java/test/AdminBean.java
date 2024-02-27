package test;

import java.io.*;
@SuppressWarnings("serial")
public class AdminBean implements Serializable{
	private String userId;
	private String name;
	private String pWord;
	public AdminBean() {
		super();
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getpWord() {
		return pWord;
	}
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
}
