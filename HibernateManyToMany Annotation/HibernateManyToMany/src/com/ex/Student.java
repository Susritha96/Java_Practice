package com.ex;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;



@Entity
@Table(name="StudentAnn")
public class Student {
	@Id
	@Column(name="sid")
	private int sid;
	@Column(name="sname")
	private String sname;
	@Column(name="marks")
	private int marks;
	@ManyToMany(cascade=CascadeType.ALL,targetEntity=Course.class)
    @JoinTable(name="student_course_ann", joinColumns={@JoinColumn(referencedColumnName="sid")}
                                        , inverseJoinColumns={@JoinColumn(referencedColumnName="cid")})
	private Set<Course> c_obj;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Set<Course> getC_obj() {
		return c_obj;
	}
	public void setC_obj(Set<Course> c_obj) {
		this.c_obj = c_obj;
	}

	


}
