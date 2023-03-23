package com.dth.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BankDetails {
	@Id
	private long accountNumber;
	private String bankName;
	private String bankIFSC_Code;
	private String branchName;
	@OneToOne(cascade = CascadeType.ALL)
	private Employee employee;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankIFSC_Code() {
		return bankIFSC_Code;
	}
	public void setBankIFSC_Code(String bankIFSC_Code) {
		this.bankIFSC_Code = bankIFSC_Code;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
}
