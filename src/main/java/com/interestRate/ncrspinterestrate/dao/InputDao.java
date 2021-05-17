package com.interestRate.ncrspinterestrate.dao;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class InputDao {
	@NotNull
	@Range(min = 2, max = 100000, message = "Value cannot be empty/ less than 2")
	private float repoRate;
	@NotNull
	@Range(min = 2, max = 100000, message = "Value cannot be empty/ less than 2")
	private double amount;
	@NotBlank(message = "Agreement is a Mandatory field, Please select an option.")
	private String agreement;
	private Date startDate;
	private Date endDate;
	private Double calculatedInterest;

	public InputDao() {
		// TODO Auto-generated constructor stub
	}

	public InputDao(Float repoRate, Double amount, String agreement, Date startDate, Date endDate,
			Double calculatedInterest) {
		super();
		this.repoRate = repoRate;
		this.amount = amount;
		this.agreement = agreement;
		this.startDate = startDate;
		this.endDate = endDate;
		this.calculatedInterest = calculatedInterest;
	}

	public Float getRepoRate() {
		return repoRate;
	}

	public void setRepoRate(Float repoRate) {
		this.repoRate = repoRate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getAgreement() {
		return agreement;
	}

	public void setAgreement(String agreement) {
		this.agreement = agreement;
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

	public Double getCalculatedInterest() {
		return calculatedInterest;
	}

	public void setCalculatedInterest(Double calculatedInterest) {
		this.calculatedInterest = calculatedInterest;
	}

}
