package com.crm.test;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.pojo.CstCustomer;
import com.crm.pojo.CstLost;
import com.crm.service.CstCustomerService;
import com.crm.service.CstLostService;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class CstLostTest {
	
	@Autowired
	public CstLostService cstLostService;
	
	@Autowired
	public CstCustomerService cstCustomerService;
	
	
	@Test
	public void test_findAll() {
		List<CstLost> cstLostList = cstLostService.findAll();
		for(CstLost cstLost:cstLostList) {
			System.out.println(cstLost);
		}
	}
	
	@Transactional
	@Test
	public void test_findById() {
		CstLost cstLost = cstLostService.findById(1l);
		if(cstLost!=null) {
			CstCustomer cstCustomer = cstLost.getCstCustomer();
			System.out.println(cstCustomer.getCustName());
		}
		
	}
	
	@Test
	public void test_delete() {
		
	}
	
	@Test
	public void test_add() {
		CstLost cstLost = new CstLost();
		cstLost.setLstId(1l);
		cstLost.setLstLostDate(new Date());
		cstLost.setLstReason("no money");
		cstLost.setLstStatus("-1");
		cstLost.setLstCustManagerId(2l);
		cstLost.setLstCustManagerName("Íõ¾­Àí");
		
		
		CstCustomer cstCustomer = cstCustomerService.findById("jlwqjdl");
		
		if(cstCustomer!=null) {
			cstLost.setCstCustomer(cstCustomer);
		}
		
		cstLostService.add(cstLost);
	}
}
