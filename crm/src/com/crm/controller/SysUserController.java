package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crm.pojo.SysRole;
import com.crm.pojo.SysUser;
import com.crm.service.SysRoleService;
import com.crm.service.SysUserService;

@Controller
@RequestMapping("/sysuser")
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private SysRoleService SysRoleService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute SysUser sysUser, Model model) {

		if (sysUser == null)
			return "error";

		System.err.println("Wrap Into the instance 'SysUser' is [" + sysUser + "]");

		String username = sysUser.getUserName();
		String password = sysUser.getUserPassword();

		SysUser sysUserFromDao = sysUserService.validate(username, password);

		System.err.println("SysUser From DAO is [" + sysUserFromDao + "]");

		if (sysUserFromDao != null) {
			model.addAttribute("username", username);
			return "index";
		} else {
			return "error";
		}

	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model){
		List<SysUser> listUser = sysUserService.findAll();
		List<SysRole> listRole = SysRoleService.findAll();
		if(listUser!=null && listRole!=null) {
			model.addAttribute("listUser", listUser);
			model.addAttribute("listRole", listRole);
			return "/sys/user/list";
		}else {
			return "error";
		}
	}
	
	public String add() {
		
		return "";
	}
	
	public String edit() {
		
		return "";
	}
	
	public String delete() {
		
		return "";
	}
}
