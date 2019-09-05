package org.login.entity;

public class Login {
	private int id;
	private String username;
	private String passwd;
	private String name;
	private int age;
	private String address;
	public Login() {
	}
	public Login(int id,String username,String passwd) {
		this.id=id;
		this.username=username;
		this.passwd=passwd;
	}
	public Login(int id, String username, String passwd, String name, int age, String address) {
		super();
		this.id = id;
		this.username = username;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
