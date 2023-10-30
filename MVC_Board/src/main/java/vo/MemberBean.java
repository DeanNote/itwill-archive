package vo;

import java.sql.Date;

/*
CREATE TABLE member(
 idx  int PRIMARY KEY AUTO_INCREMENT,
 name varchar(10) NOT NULL,
 id varchar(16) UNIQUE NOT NULL,
 passwd varchar(16) NOT NULL,
 jumin varchar(14) UNIQUE NOT NULL,
 address varchar(100) NOT NULL,
 email varchar(50) NOT NULL UNIQUE,
 job varchar(10) NOT NULL,
 gender varchar(1) NOT NULL,
 hobby varchar(50) NOT NULL,
 motivation varchar(500) NOT NULL,
 reg_date DATETIME NOT NULL
 );

 */
public class MemberBean {
	private int idx;
	private String name;
	private String id;
	private String passwd;
	private String jumin;
	private String address;
	private String email;
	private String job;
	private String gender;
	private String hobby;
	private String motivation;
	private Date reg_date;
	
	@Override
	public String toString() {
		return "MemberBean [idx=" + idx + ", name=" + name + ", id=" + id + ", passwd=" + passwd + ", jumin=" + jumin
				+ ", address=" + address + ", email=" + email + ", job=" + job + ", gender=" + gender + ", hobby="
				+ hobby + ", motivation=" + motivation + ", reg_date=" + reg_date + ", toString()=" + super.toString()
				+ "]";
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public String getMotivation() {
		return motivation;
	}
	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	
	
}
