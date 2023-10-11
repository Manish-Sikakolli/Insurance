package com.example.insurance.java;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Insurance")
public class Insurance {
	@Id
	int policyId;
	@Column(name="name")
	String name;
	@Column(name="policyAmt")
	int policyAmt;
	@Column(name="emi")
	int emi;
	public Insurance() {
		
	}
	public Insurance(int policyId,String name,int policyAmt,int emi) {
		super();
		this.policyId=policyId;
		this.name=name;
		this.policyAmt=policyAmt;
		this.emi=emi;
		
		
		
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPolicyAmt() {
		return policyAmt;
	}
	public void setPolicyAmt(int policyAmt) {
		this.policyAmt = policyAmt;
	}
	public int getEmi() {
		return emi;
	}
	public void setEmi(int emi) {
		this.emi = emi;
	}
	public String toString() {
		return "\npolicy_id : "+policyId+"\nname : "+name+"\npolicy_amount : "+policyAmt+"\nemi : "+emi;
	}

}
