package com.ex;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="CourseAnn")
public class Course {
	@Id
	@Column(name="cid")
	private int cid;
	@Column(name="cname")
	private String cname;
	@Column(name="price")
	private int price;
	@ManyToMany(mappedBy = "c_obj")
	private Set<Student> s_obj;
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
	public Set<Student> getS_obj() {
		return s_obj;
	}
	public void setS_obj(Set<Student> s_obj) {
		this.s_obj = s_obj;
	}
	

}
