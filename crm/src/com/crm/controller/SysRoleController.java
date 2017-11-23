package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.pojo.SysRole;
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
 * 
 */
@Controller 
@RequestMapping("/sysrole")
public class SysRoleController {
	
	

	@Autowired
	private final SysRoleService sysRoleService;
	
	public SysRoleController(SysRoleService sysRoleService) {
		this.sysRoleService=sysRoleService;
	}
	

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(SysRole sysRole) {
		
		if(sysRole!=null) {
			sysRoleService.add(sysRole);
			return "/sysrole/list.jsp";
		}else{
			return "/sysrole/error.jsp";
		}
	}
	
	/**
     * 作用：获取对象ID，根据ID做对象存在判别，确定是否删除。
	 * @param roleId 
	 * @return 返回列表
	 */
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete(@RequestParam(value="roleId",required=true)Long roleId) { 
		
		SysRole sysRole = sysRoleService.getById(roleId);
		if(sysRole==null) {
			return "/sysrole/error.jsp";
		}else {
			sysRoleService.delete(sysRole);
		    return "/sysrole/list.jsp";
		}
	}

	@RequestMapping(value="/update",method=RequestMethod.GET)
	public String update(SysRole sysRole) {
		
		sysRoleService.update(sysRole);
		
		return "sysrole/list.jsp";
	}

	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public String findAll() {
		
		List<SysRole> sysRoles = sysRoleService.findAll();
		
		return "/sysrole/list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
