package com.velocity.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Cust_name")
	private String name;
	@Column(name="mobile_num")
	private long mobilenumber;
	@OneToOne(targetEntity=Transection.class,cascade=CascadeType.ALL)
	private Transection transection;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public Transection getTransaction() {
		return transection;
	}
	public void setTransaction(Transection transection) {
		this.transection = transection;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobilenumber=" + mobilenumber + ", transaction="
				+ transection + "]";
	}

}
