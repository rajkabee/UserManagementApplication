package com.hospital.userManagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long address_id;
	private String country;
	private String state;
	private String district;
	private String municipality;
	private int ward;
	private String street;
	private int POB_no;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(long address_id, String country, String state, String district, String municipality, int ward,
			String street, int pOB_no) {
		super();
		this.address_id = address_id;
		this.country = country;
		this.state = state;
		this.district = district;
		this.municipality = municipality;
		this.ward = ward;
		this.street = street;
		POB_no = pOB_no;
	}
	public Address(String country, String state, String district, String municipality, int ward, String street,
			int pOB_no) {
		super();
		this.country = country;
		this.state = state;
		this.district = district;
		this.municipality = municipality;
		this.ward = ward;
		this.street = street;
		POB_no = pOB_no;
	}
	public long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getMunicipality() {
		return municipality;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	public int getWard() {
		return ward;
	}
	public void setWard(int ward) {
		this.ward = ward;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPOB_no() {
		return POB_no;
	}
	public void setPOB_no(int pOB_no) {
		POB_no = pOB_no;
	}
	
	
}
