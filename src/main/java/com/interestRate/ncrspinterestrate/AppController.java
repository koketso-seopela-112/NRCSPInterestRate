package com.interestRate.ncrspinterestrate;

import java.text.DecimalFormat;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.interestRate.ncrspinterestrate.dao.InputDao;
import com.interestRate.ncrspinterestrate.dao.SpecificatioDao;
import com.interestRate.ncrspinterestrate.entity.Specification;

@Controller()
public class AppController {

	@Autowired
	private SpecificatioDao repo;

	@RequestMapping("/")
	public String showInputPage(Model model) {
		model.addAttribute("input", new InputDao());
		return "index";
	}

	@PostMapping("/")
	public String showInputPageResult(@Valid @ModelAttribute("input") InputDao dao, BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			return "index";
		}
		DecimalFormat f = new DecimalFormat("##.00");
		Double calculatedValue = repo.getSPCalculatedValue(dao.getRepoRate(), dao.getAmount(), dao.getAgreement(),
				dao.getStartDate(), dao.getEndDate());
		dao.setCalculatedInterest(Double.valueOf(f.format(calculatedValue)));
		model.addAttribute("input", dao);
		return "index";
	}

	@RequestMapping("/table")
	public String showMainPage(Model model) {
		List<Specification> specifications = repo.getAllSpecifications();
		model.addAttribute("specs", specifications);
		return "agreements";
	}

}
