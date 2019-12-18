package com.java.SpringBootJPA.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Data")
public class Alien {
	
@Id
public int aid;
public String aname;

public int getAid() {
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}
public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}

@Override
public String toString() {
	return "Alien [aid=" + aid + ", aname=" + aname + "]";
}

}
