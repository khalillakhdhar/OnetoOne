package com.doranco.relations.dao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="user_profile")
public class UserProfile implements Serializable {
	//pour obtenir les toString des classes automatiquement pour nos RestAPI
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false,length = 100)
	
	private String adress1;
	@Column(length = 100)
	private String adress2;
	@Column(nullable = false,length = 15)

	private String phoneNumber;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Gender gender;
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	@Column(nullable = false,length = 100)
	private String city;
	@Column(nullable = false,length = 100)

	private String state;
	@Column(nullable = false,length = 100)
	private String country;
	@Column(nullable = false,length = 100)

	private String street;
	@Column(nullable = false,length = 32)

	private String zipCode;
	@OneToOne(optional = false)
	@JoinColumn(name = "user_id",nullable = false)
	//la classe dominé contient le JoinColumn
	private User user;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getAdress1() {
		return adress1;
	}
	public void setAdress1(String adress1) {
		this.adress1 = adress1;
	}
	public String getAdress2() {
		return adress2;
	}
	public void setAdress2(String adress2) {
		this.adress2 = adress2;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserProfile [id=" + id + ", adress1=" + adress1 + ", adress2=" + adress2 + ", phoneNumber="
				+ phoneNumber + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", city=" + city + ", state="
				+ state + ", country=" + country + ", street=" + street + ", zipCode=" + zipCode + ", user=" + user
				+ ", getId()=" + getId() + ", getAdress1()=" + getAdress1() + ", getAdress2()=" + getAdress2()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", getGender()=" + getGender() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", getCity()=" + getCity() + ", getState()=" + getState() + ", getCountry()="
				+ getCountry() + ", getStreet()=" + getStreet() + ", getZipCode()=" + getZipCode() + ", getUser()="
				+ getUser() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
