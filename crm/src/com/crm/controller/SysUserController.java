package com.crm.controller;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
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

			return "index";

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
	 * 
	 * @return
	 */
	@RequestMapping(value = "/redirectAddPage", method = RequestMethod.GET)
	public String redirectAddPage() {
		return "sys/user/add";
	}
	/**
	 * 添加新的系统用户
	 * @param sysUser 使用{@code @ModelAttribute}接收表单数据并封装于{@code SysUser}
	 * @return 如果成功，返回{@link list.jsp} ； 如果失败，返回{@link error.jsp}
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@ModelAttribute SysUser sysUser) {
		System.err.println("Wrap the POJO of 'sysUser' is [" + sysUser + "]");

		if (sysUser != null) {
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
     * @param userId 
     * @param sysUser
     * @param br
     * @return
     */
	@RequestMapping(value = "/edit/{userId}", method = RequestMethod.POST)
	public String edit(@PathVariable("userId") Long userId,@Validated SysUser sysUser,BindingResult br) {
		
		System.err.println("br.hasErrors() before the instance of 'sysUser' is ["+sysUser+"]");
		if(br.hasErrors()) {//. br监测到错误信息
			//. 在控制台查看页面出错信息并返回主页
			List<ObjectError> allErrors = br.getAllErrors();
			for(ObjectError or:allErrors) {
				System.err.println("Object Errors is {"+or+"}");
			}
			//. 在控制台查看Model属性情况
			Map<String, Object> model = br.getModel();
			for(Map.Entry<String, Object> entry:model.entrySet()) {
				System.err.println("KEY["+entry.getKey()+"],VALUE["+entry.getValue()+"]");
			}
			return "redirect:list";
		}else {//. br未监测到页面错误信息
			//. 提取SysRole的编号并完成修改
			Map<String, Object> model = br.getModel();
			if(model.containsKey("sysRole")) {
				Object object = model.get("sysRole");
				if(object instanceof String) {
					Long sysRoleId=Long.valueOf((String)object);
					System.out.println("sysRoleId is ["+sysRoleId+"]");
					//. 调取SysRole对象
					SysRole sysRole = SysRoleService.getById(sysRoleId);
					//. 重新保存用户权限
					sysUser.setSysRole(sysRole);
					//. 提交修改
					sysUserService.update(sysUser);
				}
			}
		}
		System.err.println("br.hasErrors() after the instance of 'sysUser' is ["+sysUser+"]");
		
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
