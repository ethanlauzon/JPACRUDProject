package com.skilldistillery.weighttraining.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.skilldistillery.weighttraining.data.WeightTrainingDAO;
import com.skilldistillery.weighttraining.entities.WeightTraining;

@Controller
public class WeightTrainingController {

	@Autowired
	private WeightTrainingDAO wtd;
	
	@RequestMapping(path = {"/", "home.do"})
	public String index(Model model) {
		model.addAttribute("weightTraining", wtd.findAll());
		return "index";
	}
	
	@RequestMapping(path = "getWeightTrainer.do")
	public String showTrainer(Integer wtid, Model model) {
		WeightTraining wt = wtd.findById(wtid);
		model.addAttribute("weightTraining", wt);
		return "trainer";
	}
	
	@RequestMapping(path = "deleteTrainer.do")
	public String deleteTrainer(Integer id) {
		wtd.deleteById(id);
		return"deleteConfirmation";
	}
	
	@RequestMapping(path ="editTrainer.do")
	public String editTrainer(Integer id, WeightTraining wt) {
		wtd.update(id, wt);
		return "editConfirmation";
	}
	@RequestMapping(path="createEditForm.do", method = RequestMethod.GET)
	public String createEditForm(Model model, WeightTraining wt) {
		return "edit";
	}
	
	@RequestMapping(path="createTrainer.do", method = RequestMethod.POST)
	public String createTrainer(Model model, WeightTraining wt) {
		wtd.create(wt);
		model.addAttribute("weightTraining", wt);
		return "confirmation";
	}
	
	@RequestMapping(path="createForm.do", method = RequestMethod.GET)
	public String createForm(Model model, WeightTraining wt) {
		return "create";
	}
	
	
}
