package com.example;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer1")
public class Customer {
	@Id
	@Column(name="cid")
	private int cid;
	@Column(name="cname")
	private String cname;
	@ManyToOne
	private Vendor fkvid;
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
	public Vendor getFkvid() {
		return fkvid;
	}
	public void setFkvid(Vendor fkvid) {
		this.fkvid = fkvid;
	}


}
