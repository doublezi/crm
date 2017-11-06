package com.crm.test;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.pojo.CstCustomer;
import com.crm.pojo.CstLinkMan;
import com.crm.service.CstCustomerService;
import com.crm.service.CstLinkManService;
/**
 * 
 * @author Administrator
 *
 */
@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class CstLinkManTest {

	@Autowired
	public CstLinkManService cstLinkManService;
	@Autowired
	public CstCustomerService cstCustomerService;
	
	@Test
	public void test_delete() {
		CstLinkMan cstLinkMan = cstLinkManService.findById(6l);
		cstLinkManService.delete(cstLinkMan);
	}
	
	@Test
	@Transactional //用于测试时，解决no session问题
	public void test_findById() {
		CstLinkMan cstLinkMan = cstLinkManService.findById(1L);
		if(cstLinkMan.getCstCustomer()==null) {
			System.out.println("cstLinkMan#cstCustomer is null");
		}else {
			System.out.println(cstLinkMan.getCstCustomer().getCustName());
		}
	}
	
	@Test
	public void test_add() {
		CstCustomer cstCustomer = cstCustomerService.findById("jlwqjdl");
		System.out.println(cstCustomer);
		CstLinkMan cstLinkMan = new CstLinkMan();
		cstLinkMan.setLkmId(9L);
		cstLinkMan.setLkmName("LinkManTest");
		if(cstCustomer!=null) {
			cstLinkMan.setCstCustomer(cstCustomer);
			cstLinkManService.add(cstLinkMan);
		}else {
			System.out.println("execute failed");
		}
	}
}
