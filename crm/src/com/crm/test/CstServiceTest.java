package com.crm.test;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.pojo.CstCustomer;
import com.crm.pojo.CstService;
import com.crm.service.CstCustomerService;
import com.crm.service.CstServiceService;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class CstServiceTest {

	@Autowired
	public CstServiceService cstServiceService;
	
	@Autowired
	public CstCustomerService cstCustomerService;
	
	
	/**
	 * {@code @Transactional}:</br>
	 *  -----------------------------------------------------</br>
	 *  -solving the problem of LazyInitializationException:-</br>
	 *  -could not initialize proxy - no Session-------------</br>
	 *  -----------------------------------------------------</br>
	 *  <strong>update the CstService instance failed: dont update the database sql 
	 *  and data</strong>  
	 *  
	 *  if field isnt null ,must be set it with setter method
	 */
	@Transactional
	@Rollback(false)
	@Test
	public void test_update() {
		CstService cstService = cstServiceService.findById(1l);
		//.~update before
		if(cstService!=null) {
			System.out.println("");
			System.out.println("-------------------------------------------------------");
			System.out.println("SERVICE ID:"+cstService.getSvrId());
			System.out.println("SERVICE TYPE:"+cstService.getSvrType());
			System.out.println("SERVICE TITLE:"+cstService.getSvrTitle());
			System.out.println("SERVICE STATUS:"+cstService.getSvrStatus());
			System.out.println("SERVICE CREATE-ID:"+cstService.getSvrCreateId());
			System.out.println("SERVICE CREATE-NAME:"+cstService.getSvrCreateName());
			System.out.println("SERVICE CREATE-DATE:"+cstService.getSvrCreateDate());
			System.out.println("-------------------------------------------------------");
			System.out.println("");
		}
		//.~updating
		cstService.setSvrType("update svr type`");
		cstService.setSvrTitle("update svr title`");
		cstService.setSvrStatus("÷ÿ¥¥Ω®`");
		cstService.setSvrCreateId(5l);
		cstService.setSvrCreateName("update svr create name`");
		cstService.setSvrCreateDate(new Date());
		cstService.setCstCustomer(cstCustomerService.findById("001"));
		//.~update after
		System.out.println("");
		System.out.println("-------------------------------------------------------");
		System.out.println("update cstService instance after now:"+cstService);
		System.out.println("-------------------------------------------------------");
		System.out.println("");
		//.~invoking update method
		cstServiceService.update(cstService);
	}
	
	
	@Test
	public void test_findAll() {
		List<CstService> cstServiceList = cstServiceService.findAll();
		for(CstService cstService:cstServiceList) {
			System.out.println(cstService);
		}
	}
	
	/**
	 * {@code @Transactional}:</br>
	 *  -----------------------------------------------------</br>
	 *  -solving the problem of LazyInitializationException:-</br>
	 *  -could not initialize proxy - no Session-------------</br>
	 *  -----------------------------------------------------</br>
	 */
	@Transactional  
	@Test
	public void test_findById() {
		CstService cstService = cstServiceService.findById(1l);
		if(cstService!=null) {
			CstCustomer cstCustomer = cstService.getCstCustomer();
			System.out.println(cstCustomer.getCustName());
		}
	}
	
	@Test
	public void test_delete() {
		
	}
	
	@Test
	public void test_add() {
		CstService cstService = new CstService();
		cstService.setSvrId(1l);
		cstService.setSvrType("type.test");
		cstService.setSvrTitle("title.test");
		cstService.setSvrCreateId(2l);
		cstService.setSvrCreateName("create.name.test");
		cstService.setSvrCreateDate(new Date());
		cstService.setSvrStatus("-1");
		
		CstCustomer cstCustomer = cstCustomerService.findById("jlwqjdl");
		
		if(cstCustomer!=null) {
			cstService.setCstCustomer(cstCustomer);
		}
		
		cstServiceService.add(cstService);
	}
}
