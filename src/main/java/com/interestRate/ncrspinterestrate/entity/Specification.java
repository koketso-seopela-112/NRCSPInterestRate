package com.interestRate.ncrspinterestrate.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "specification")

@NamedStoredProcedureQuery(name = "getCalcualation", procedureName = "calculate_interest", parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "repo_rate_in", type = Float.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "amount_in", type = Double.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "agreement_in", type = String.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "start_in", type = Date.class),
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "end_in", type = Date.class) })

public class Specification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String agreementType;
	private int rate;

	public Specification() {
		// TODO Auto-generated constructor stub
	}

	public Specification(String agreementType, int rate) {
		super();
		this.agreementType = agreementType;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAgreementType() {
		return agreementType;
	}

	public void setAgreementType(String agreementType) {
		this.agreementType = agreementType;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}
