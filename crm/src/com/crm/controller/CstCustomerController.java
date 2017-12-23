package com.crm.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.crm.pojo.CstCustomer;
import com.crm.service.CstCustomerService;

/**
 * 
 * </br>
 * *********************
 * </br>
 * 作者：隔壁老王(ಥ _ ಥ) 21岁
 * </br>          
 * *********************
 * </br>
 * 日期：2017年12月21日
 * </br>                
 * *********************
 * </br>
 * 时间：下午2:10:30        
 * </br>        
 * *********************
 * </br>
 */
@Controller
@RequestMapping("/cstcustomer")
public class CstCustomerController {
	
	@Autowired
	private CstCustomerService ccs;
	
	@RequestMapping(value="/redirectAddPage",method=RequestMethod.GET)
	private String redirectAddPage() {
		
		return "cust/info/add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	private String add(MultipartFile file
			,HttpServletRequest req,CstCustomer csc) throws IOException {
		//【1】判断文件是否存在，不存在则重新注册
		if(!file.isEmpty()) {
			String path=req.getServletContext().getRealPath("uploads");
			String filename = file.getOriginalFilename();
			System.err.println("PATH ["+path+"] FILENAME ["+filename+"]");
			File targetFile = new File(path,filename);
			if(!targetFile.exists()) {
				targetFile.mkdirs();
			}
			//保存图片
			file.transferTo(targetFile);
			
			return "redirect:list";
		}else {
			//测试阶段返回error页面,上线阶段返回add页面
			return "error";
		}
		//【2】存储文件并保存新注册的客户
		
		//【3】查看新注册客户的信息资料
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model) {
		//【1】查询所有
		List<CstCustomer> cstCustomerList = ccs.findAll();
		if(cstCustomerList!=null) {
			//【2】将集合存储到Model中	
			model.addAttribute("cstCustomerList", cstCustomerList);
		}
		//【3】转发到list页面上
		return "cust/info/list";
	}
	
}
