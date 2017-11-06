package com.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.service.SysRoleService;

/**
 * 
 *****************************
 * 作者：隔壁老王(ಥ _ ಥ)        
 * ***************************
 * 日期：2017年10月28日              
 * ***************************
 * 时间：上午9:18:25              
 * ***************************
 */

@Controller 
@RequestMapping("/sysrole")
public class SysRoleController {

	@Autowired
	private final SysRoleService sysRoleService;
	
	public SysRoleController(SysRoleService sysRoleService) {
		this.sysRoleService=sysRoleService;
	}
	
	public String add() {
		return "";
	}
	
	public String delete() {
		return "";
	}
	
	public String update() {
		return "";
	}
	
	public String findAll() {
		return "";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
