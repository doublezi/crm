package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.pojo.CstActivity;
import com.crm.service.CstActivityService;

@Controller
@RequestMapping("/cstactivity")
public class CstActivityController {
	
	@Autowired
	private CstActivityService cstActivityService;
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(CstActivity cstActivity) {
		System.out.println("into the cst_activity add-method");
		cstActivityService.add(cstActivity);
		return "succeed";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(CstActivity cstActivity) {
		System.out.println("into the cst_activity delete-method");

		return "";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String update(CstActivity cstActivity) {
		System.out.println("into the cst_activity update-method");
		
		return "";
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String findAll(Model model) {
		System.out.println("into the cst_activity findAll-method");
		return "";
	}
	
	
}
