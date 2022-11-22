package com.dxc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_tbl")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	private String pname;
	private int pcost;
	
	
	public Product() {
		super();
	}


	public Product(int pid, String pname, int pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getPcost() {
		return pcost;
	}


	public void setPcost(int pcost) {
		this.pcost = pcost;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
	
	
	
	
}
