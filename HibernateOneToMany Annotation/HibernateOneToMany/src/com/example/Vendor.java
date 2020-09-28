package com.example;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vendor1")
public class Vendor {
	@Id
	@Column(name="vid")
	private int vid;
	@Column(name="vname")
	private String vname;
	@OneToMany(targetEntity=Customer.class,cascade=CascadeType.ALL)
	@JoinColumn(name="fkvid")
	private Set c_obj;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public Set getC_obj() {
		return c_obj;
	}
	public void setC_obj(Set c_obj) {
		this.c_obj = c_obj;
	}
	
	

}
