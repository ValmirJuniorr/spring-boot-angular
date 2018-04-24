package com.moneyapi.model;

import javax.persistence.Embeddable;

@Embeddable
public class Adress {
	private String stret;
	private String number;
	private String complement;
	private String neighborhood;	
	private String zipCode;
	private String city;
	private String estate;
	public String getStret() {
		return stret;
	}
	public void setStret(String stret) {
		this.stret = stret;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEstate() {
		return estate;
	}
	public void setEstate(String estate) {
		this.estate = estate;
	}
	
	
	

}
