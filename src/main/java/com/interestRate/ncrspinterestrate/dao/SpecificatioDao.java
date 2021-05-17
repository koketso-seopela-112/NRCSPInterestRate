package com.interestRate.ncrspinterestrate.dao;

import java.util.Date;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.interestRate.ncrspinterestrate.controller.SpecificationRepository;
import com.interestRate.ncrspinterestrate.entity.Specification;

@Repository
public class SpecificatioDao {
	@Autowired
	private SpecificationRepository repo;
	@Autowired
	private EntityManager em;

	public double getSPCalculatedValue(Float repoRate, Double amount, String agreement, Date startDate, Date endDate) {
		StoredProcedureQuery sp = em.createNamedStoredProcedureQuery("getCalcualation");
		sp.setParameter("repo_rate_in", repoRate);
		sp.setParameter("amount_in", amount);
		sp.setParameter("agreement_in", agreement);
		sp.setParameter("start_in", startDate);
		sp.setParameter("end_in", endDate);

		return (double) sp.getSingleResult();
	}

	public List<Specification> getAllSpecifications() {
		return repo.findAll();
	}

}
