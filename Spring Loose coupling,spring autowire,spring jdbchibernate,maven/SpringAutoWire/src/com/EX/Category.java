package com.EX;

public class Category {
private String cname;
private Book bk;


public Category(Book bk) {
	super();
	this.bk = bk;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Book getBk() {
	return bk;
}
public void setBk(Book bk) {
	this.bk = bk;
}

}
