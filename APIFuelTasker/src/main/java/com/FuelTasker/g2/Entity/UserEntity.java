package com.FuelTasker.g2.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tblUsers")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(name = "firstname")
	private String fName;
	@Column(name = "lastname")
	private String lName;
	@Column(name = "eMail")
	private String eMail;
	@Column(name = "passWord")
	private String pWord;
	
	public UserEntity() {}

	public UserEntity(int userId, String fName, String lName, String eMail, String pWord) {
		super();
		this.userId = userId;
		this.fName = fName;
		this.lName = lName;
		this.eMail = eMail;
		this.pWord = pWord;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getpWord() {
		return pWord;
	}

	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
}
