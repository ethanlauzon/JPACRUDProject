package com.skilldistillery.weighttraining.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.weighttraining.data.WeightTrainingDAO;

@Controller
public class WeightTrainingController {

	@Autowired
	private WeightTrainingDAO wtd;
	
	@RequestMapping(path = {"/", "home.do"})
	public String index(Model model) {
		model.addAttribute("weightTraining", wtd.findAll());
		return "index";
	}
}
