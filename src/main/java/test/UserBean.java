package test;

import java.io.*;
public class UserBean implements Serializable{
	private long accountNo;
	private String uName;
	private String fName;
	private String dob;
	private String gender;
	private long phNo;
	private String mailId;
	private String address;
	private String idProof;
	private long idProofNo;
	private String accType;
	private long balance;
	private String pWord;
	 
	//Default Constructor
	public UserBean() {
		super();
	}

	//Setter and Getter Methods
	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public long getIdProofNo() {
		return idProofNo;
	}

	public void setIdProofNo(long idProofNo) {
		this.idProofNo = idProofNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getpWord() {
		return pWord;
	}

	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	
	/*
	 public String getpWord() {
		return pWord;
	}

	public void setpWord(String pWord) {
		StringBuffer sb = new StringBuffer(pWord);
		for(int i=0; i<pWprd.length(); i++){
			sb+=pWord.chatAt(i+10);
		}
		this.pWord = sb ;
	}*/
}
