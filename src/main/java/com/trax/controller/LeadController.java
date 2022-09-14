package com.trax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trax.entities.Lead;
import com.trax.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewCreateLead")
	public String viewCreateLeadPage() {
		return "create_lead";
	}
	@RequestMapping(value="/saveLead", method= RequestMethod.POST)
	public String saveLead(@ModelAttribute("Lead") Lead lead, ModelMap model) {
		try {
			leadService.saveLeadInfo(lead);
			model.addAttribute("lead", lead);
		}
		catch(Exception e){
			model.addAttribute("emailError", "email id exist");
			return "create_lead";
		}			
		return "lead_info";
	}
}

