package com.interestRate.ncrspinterestrate.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interestRate.ncrspinterestrate.entity.Specification;

@Repository
public interface SpecificationRepository extends JpaRepository<Specification, Integer> {

}
