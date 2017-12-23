package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.pojo.SysRole;
import com.crm.pojo.SysUser;
import com.crm.service.SysRoleService;
import com.crm.service.SysUserService;
/**
 * 
 * </br>
 * *********************
 * </br>
 * 作者：隔壁老王(ಥ _ ಥ) 21岁
 * </br>          
 * *********************
 * </br>
 * 日期：2017年12月6日
 * </br>                
 * *********************
 * </br>
 * 时间：下午4:19:35        
 * </br>        
 * *********************
 * </br>
 * 总体目标：全心全意精华这个类及相关类的开发。
 */
@Controller
@RequestMapping("/sysuser")
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private SysRoleService SysRoleService;
	/**
	 * 
	 * @param sysUser
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute SysUser sysUser, Model model) {

		if (sysUser == null)
			return "error";

		System.err.println("Wrap Into the instance 'SysUser' is [" + sysUser + "]");

		String b_username = sysUser.getUserName();
		String b_password = sysUser.getUserPassword();

		SysUser sysUserFromDao = sysUserService.validate(b_username, b_password);

		if (sysUserFromDao != null) {

			String s_username = sysUserFromDao.getUserName();
			String s_userrole = sysUserFromDao.getSysRole().getRoleName();

			System.err.println("SysUser From DAO is [" + sysUserFromDao + "]");

			model.addAttribute("username", s_username);
			model.addAttribute("userrole", s_userrole);

			return "n-index";

		} else {

			return "error";

		}

	}
	/**
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<SysUser> listUser = sysUserService.findAll();
		List<SysRole> listRole = SysRoleService.findAll();
		if (listUser != null && listRole != null) {
			model.addAttribute("listUser", listUser);
			model.addAttribute("listRole", listRole);
			return "/sys/user/list";
		} else {
			return "error";
		}
	}
	/**
	 * 创建新的系统用户
	 * @return
	 */
	@RequestMapping(value = "/redirectAddPage", method = RequestMethod.GET)
	public String redirectAddPage(Model model) {
		/*
		 * 【1】获取用户权限列表
		 */
		List<SysRole> listSysRole = SysRoleService.findAll();
		/*
		 * 【2】存放到模型之中
		 */
		model.addAttribute("listSysRole", listSysRole);
		/*
		 * 【3】转发到n-add页面
		 */
		return "sys/user/add";
	}
	/**
	 * 添加新的系统用户
	 * @param sysUser 使用{@code @ModelAttribute}接收表单数据并封装于{@code SysUser}
	 * @return 如果成功，返回{@link list.jsp} ； 如果失败，返回{@link error.jsp}
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(SysUser sysUser) {
		System.err.println("Wrap the POJO of 'sysUser' is [" + sysUser + "]");

		if (sysUser != null && sysUser.getSysRole()!=null) {
			sysUserService.add(sysUser);
			return "redirect:list";
		} else {
			return "error";
		}

	}
	/**
	 * 跳转到修改页面
	 * @param userId 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/redirectEditPage/{userId}", method = RequestMethod.GET)
	public String redirectEditPage(@PathVariable("userId") Long userId, Model model) {

		SysUser sysUser = sysUserService.findById(userId);

		if (sysUser != null) {
			model.addAttribute("sysUser", sysUser);
			return "sys/user/edit";
		} else {
			return "error";
		}

	}
    /**
     * 修改（编辑）/.暂且只修改密码
     * 1. 使用URI模板技术接受用户ID
     * 2. 使用对象封装表单数据
     * @param userId 
     * @param sysUser
     * @param br
     * @return
     */
	@RequestMapping(value = "/edit/{userId}", method = RequestMethod.POST)
	public String edit(@PathVariable("userId") Long userId,SysUser frontSysUser) {
		System.out.println("SysUser ["+frontSysUser);
		/*
		 * 【1】传入新密码及用户ID完成更新sysUser对象
		 */
		sysUserService.updatePassword(userId,frontSysUser.getUserPassword());
		
		return "redirect:/sysuser/list";
	}
	/**
	 * 
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam("userId") Long userId) {

		SysUser sysUser = sysUserService.findById(userId);

		if (sysUser != null) {
			sysUserService.delete(sysUser);
			return "forward:list";
		} else {
			return "error";
		}
	}
}
