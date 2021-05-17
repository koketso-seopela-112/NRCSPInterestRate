package com.interestRate.ncrspinterestrate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Date;
import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.interestRate.ncrspinterestrate.dao.SpecificatioDao;

@SpringBootTest
public class TestStoredProcedure {

	@Autowired
	private SpecificatioDao repository;

	@Test
	public void testProcedure() {
		DecimalFormat f = new DecimalFormat("##.00");
		double amount = repository.getSPCalculatedValue(Float.valueOf(15), 50000.00, "Unsecured credit transactions",
				Date.valueOf("2021-05-13"), Date.valueOf("2021-08-11"));
		System.out.println("The amount is: " + Double.parseDouble(f.format(amount)));

		assertEquals(Double.parseDouble(f.format(amount)), 6164.38);
	}
}
