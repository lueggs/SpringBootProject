package com.event.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE,force = true)
@Entity
public class Event {
//	Controller method參數前加@Valid來驗證表單是否符合Bean裡的規則 ex:public String addEvent(@Valid Event event,Errors errors){}
//	@CreditCardNumber(驗證是否為合法信用卡號)
//	@Digits(確保三位數信用卡驗證碼)
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long eventId;

	@NotBlank // 不能Null且除了空白需有字
	private String title;
	
	@NotNull
	private Integer categoryId;
	@NotBlank
	private String location;
	
	private String description;
	@NotBlank

	private Date startDate;
	@NotBlank
	private Date endDate;
	@CreditCardNumber(message = "wrong number")
	private Integer ccNumber;
	@Pattern(regexp = "^(0[1-9]|1[0-2]([\\/]))([1-9][0-9])$",message = "Muse Be formatted MM/YY")
	private String ccExpiration;
	@Digits(integer = 3,fraction = 0,message = "Invalid CVV")
	private Integer ccCVV;
//	@NotNull
//	private String locationName;

//	private String onsales;
//	@Pattern(正則表示)
//	private String price;

//	private String showunit;



//	private String website;

	

//	private String image;
	
	
	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(Integer ccNumber) {
		this.ccNumber = ccNumber;
	}
	public String getCcExpiration() {
		return ccExpiration;
	}
	public void setCcExpiration(String ccExpiration) {
		this.ccExpiration = ccExpiration;
	}
	public Integer getCcCVV() {
		return ccCVV;
	}
	public void setCcCVV(Integer ccCVV) {
		this.ccCVV = ccCVV;
	}
}
