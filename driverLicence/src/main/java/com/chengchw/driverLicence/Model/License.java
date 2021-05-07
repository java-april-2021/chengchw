package com.chengchw.driverLicence.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "licenses")
public class License {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int licenseNum;
	private String State;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date expireDate;
	@Column (updatable = false)
	private Date createAt;
	private Date updateAt;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "driver_id")
	//This column is only used for squal to make a join
	private Driver driver;
	
	public License() {}

	public License(int licenseNum, String state, Date expireDate, Date createAt, Date updateAt, Driver driver) {
		
		this.licenseNum = licenseNum;
		this.State = state;
		this.expireDate = expireDate;
		
		this.driver = driver;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(int licenseNum) {
		this.licenseNum = licenseNum;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	
	public String getLicenseStr() {
		
		Integer licenceNumInt = this.licenseNum;
		int numLength = String.valueOf(licenceNumInt).length();
		
		int delta = 7 - numLength;
		
		String licStr = "";
		
		for (int i = 0; i < delta ; i++) {
			
			licStr += '0';
		}
		
		licStr += String.valueOf(licenceNumInt);
		
		return licStr;
	}
	
	
	
}
