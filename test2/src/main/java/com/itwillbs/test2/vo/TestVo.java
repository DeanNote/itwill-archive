package com.itwillbs.test2.vo;

//~DTO, ~Bean, ~Vo 같은 뜻
public class TestVo {
	private String subject;
	private String content;
	
	public TestVo() {}
	
	public TestVo(String subject, String content) {
		super();
		this.subject = subject;
		this.content = content;
	}

	@Override
	public String toString() {
		return "TestVo [subject=" + subject + ", content=" + content + "]";
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
}
