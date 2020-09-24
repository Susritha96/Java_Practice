package com.ex;
import java.util.Set;
public class Course {
	private int cid;
	private String cname;
	private int price;
	private Set s_obj;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Set getS_obj() {
		return s_obj;
	}
	public void setS_obj(Set s_obj) {
		this.s_obj = s_obj;
	}

}
