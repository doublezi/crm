package com.crm.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	/**
	 * 效仿于{@code 《spring-framework-4.3·【22.10.4:Handling a file upload in a form】》}
	 * @param custName 客户（公司）姓名
	 * @param custManagerId 客户经理编号
	 * @param custLevel 客户（公司）等级
	 * @param custZip 客户（公司）邮政编码
	 * @param file 身份证
	 * @return 成功则返回到list页面，失败则返回到error页面
	 * @throws IOException
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	private String add(HttpServletRequest req,
					@RequestParam("custName") String custName,
					@RequestParam("custManagerId") String custManagerId,
					@RequestParam("custLevel") String custLevel,
					@RequestParam("custZip") String custZip, 
					@RequestParam("custIDC") MultipartFile file,
					Model model) throws IOException {
		
		//【1】判断文件是否存在，不存在则重新注册
		if(!file.isEmpty()) {
			//.【1】-1 获取文件信息
			byte[] bytes = file.getBytes();
			long size = file.getSize();
			String filename = file.getOriginalFilename();
			String contentType = file.getContentType();
			String name = file.getName();
			//. ~ 文件的基本信息：
			System.err.println(
					"Info: "
					+ "BYTES ["+bytes+"]"
					+ "FILENAME ["+filename+"]"
					+ "CONTENTTYPE ["+contentType+"]"
					+ "SIZE ["+size+"]"
					+ "NAME ["+name+"]");
			//.【1】-2 保存文件到指定位置
			//.【1】-2.1 【改名】给上传的文件更名
			String renameFile = UUID.randomUUID()+"-"+filename;
			//.【1】-2.2 【设置文件路径】为已更名文件设置路径
			String path="E:/eclipse-crm/crm/WebContent/fileupload/"+renameFile;
			//.【1】-2.3 【创建文件对象】给定path,将文件对象化（你要用java操作文件，就必须先把文件对象化！！！） 
			File localFile = new File(path);
			//.【1】-2.4 【文件本地存储】
			file.transferTo(localFile);
			
			//.【2】-1 CstCustomer对象持久化操作
			//.【2】-1.1 创建一个新的CstCustomer对象并赋值
			CstCustomer cstCustomer = new CstCustomer();
			cstCustomer.setCustNo("20171228-3");
			cstCustomer.setCustName(custName);
			cstCustomer.setCustLevel(Integer.valueOf(custLevel));
			cstCustomer.setCustManagerId(Long.valueOf(custManagerId));
			cstCustomer.setCustZip((char) 000000);
			cstCustomer.setCustIDC(localFile.getPath());
			//.【2】-1.2 保存已赋值的对象
			ccs.add(cstCustomer);
			
			return "redirect:list";
		}else {
		
			return "error";
		}
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
