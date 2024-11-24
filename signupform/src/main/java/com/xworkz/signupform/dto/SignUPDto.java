package com.xworkz.signupform.dto;

public class SignUPDto {
	private String userid;
	private String email;
	private String password;
	private String confirmpassword;

	public SignUPDto() {
		// TODO Auto-generated constructor stub
	}
	public SignUPDto(String userid, String email) {
		super();
		this.userid = userid;
		this.email = email;
	}
	

	public SignUPDto(String userid, String email, String password, String confirmpassword) {
		super();
		this.userid = userid;
		this.email = email;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	@Override
	public String toString() {
		return "SignUPDto [userid=" + userid + ", email=" + email + ", password=" + password + ", confirmpassword="
				+ confirmpassword + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((confirmpassword == null) ? 0 : confirmpassword.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SignUPDto other = (SignUPDto) obj;
		if (confirmpassword == null) {
			if (other.confirmpassword != null)
				return false;
		} else if (!confirmpassword.equals(other.confirmpassword))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userid == null) {
			if (other.userid != null)
				return false;
		} else if (!userid.equals(other.userid))
			return false;
		return true;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
}
