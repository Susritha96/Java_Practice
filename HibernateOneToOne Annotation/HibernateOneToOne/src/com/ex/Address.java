package com.ex;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address30")
public class Address {
@Id
@Column(name="aid")
private int aid;
@Column(name="city")
private String city;
@Column(name="state")
private String state;
@OneToOne(targetEntity=Student.class,cascade=CascadeType.ALL)
@JoinColumn(name="s_id",referencedColumnName="sid")
private Student s_obj;
public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Student getS_obj() {
	return s_obj;
}
public void setS_obj(Student s_obj) {
	this.s_obj = s_obj;
}

}
