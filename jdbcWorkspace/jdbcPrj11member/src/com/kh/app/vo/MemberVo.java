package com.kh.app.vo;

public class MemberVo {

	private String id;
	private String pwd;

	public MemberVo() {
		super();
	}

	public MemberVo(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String toString() {
		return "MemberVo [id=" + id + ", pwd=" + pwd + "]";
	}

}
