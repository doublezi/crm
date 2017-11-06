package com.crm.test;

import java.util.Date;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.pojo.CstActivity;
import com.crm.pojo.CstCustomer;
import com.crm.service.CstActivityService;
import com.crm.service.CstCustomerService;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class CstActivityTest {
	
	@Autowired
	public CstActivityService cstActivityService;
	@Autowired
	public CstCustomerService cstCustomerService;
	
	@Transactional
	@Test
	public void test_findById() {
		CstActivity cstActivity = cstActivityService.findById(5l);
		System.out.println(cstActivity.getCstCustomer().getCustName());
	}
	
	@Test
	public void test_add() {
		CstActivity cstActivity = new CstActivity();
		cstActivity.setAtvId(5l);
		cstActivity.setAtvDate(new Date());
		cstActivity.setAtvPlace("BeiJing");
		cstActivity.setAtvTitle("title test");
		CstCustomer cstCustomer = cstCustomerService.findById("jlwqjdl");
		if(cstCustomer!=null) {
			cstActivity.setCstCustomer(cstCustomer);
		}
		cstActivityService.add(cstActivity);
	}
	
		
}
