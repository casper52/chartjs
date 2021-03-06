package org.gorany.controller;

import java.util.List;
import java.util.Locale;

import org.gorany.domain.IncomeVO;
import org.gorany.service.IncomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import lombok.Setter;
import lombok.extern.java.Log;

@Controller
@Log
public class IncomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(IncomeController.class);

	@Setter(onMethod_=@Autowired)
	private IncomeService service;
	
	@RequestMapping(value = "dateIncome", method = RequestMethod.GET)
	public String dateIncome(Locale locale, Model model) {
		return "dateIncome";
	}
	
	@RequestMapping(value = "incomeList", method = RequestMethod.GET, produces="text/plain;charset=UTF-8")
	public @ResponseBody String incomeList(Locale locale, Model model) {
		Gson gson = new Gson();
		List<IncomeVO> list = service.getIncome();
		
		return gson.toJson(list);
	}

	
}
