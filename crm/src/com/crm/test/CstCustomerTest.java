package com.crm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.pojo.CstCustomer;
import com.crm.service.CstCustomerService;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class CstCustomerTest {
	
	@Autowired
	public CstCustomerService cstCustomerService;
	
	@Test
	public void test_update() {
		CstCustomer cstCustomer = cstCustomerService.findById("001");
		if(cstCustomer!=null) {
			cstCustomer.setCustName("updateThisName");
			cstCustomerService.update(cstCustomer);
		}
	}
	
	@Test
	public void test_findAll() {
		List<CstCustomer> cstCustomerList = cstCustomerService.findAll();
		for(CstCustomer cstCustomer:cstCustomerList) {
			System.out.println(cstCustomer);
		}
	}
	
	@Test
	public void test_delete() {
		CstCustomer cstCustomer = cstCustomerService.findById("001");
		if(cstCustomer!=null) {
			cstCustomerService.delete(cstCustomer);
		}
	}
	
	@Test
	public void test_add() {
		CstCustomer cstCustomer = new CstCustomer();
		cstCustomer.setCustNo("001");
		cstCustomer.setCustName("Íõ´ó´¸");
		
		cstCustomerService.add(cstCustomer);
	}
}
