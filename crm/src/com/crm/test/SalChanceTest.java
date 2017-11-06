package com.crm.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.pojo.SalChance;
import com.crm.service.SalChanceService;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SalChanceTest {
	
	@Autowired
	public SalChanceService salChanceService;
	
	@Test
	public void test_delete() {
		SalChance salChance = salChanceService.findById(8l);
		salChanceService.delete(salChance);
	}
	
	@Test
	public void test_findAll() {
		List<SalChance> salChanceList = salChanceService.findAll();
		for(SalChance salChance:salChanceList) {
			System.out.println(salChance);
		}
	}
	
	@Test
	public void test_findById() {
		SalChance salChance = salChanceService.findById(8l);
		System.out.println(salChance);
	}
	
	@Test
	public void test_add() {
		SalChance salChance = new SalChance();
		salChance.setChcId(8l);
		salChance.setChcCustName("王宝强");
		salChance.setChcTitle("测试项.2017.10.12");
		salChance.setChcDesc("测试项.Desc.2017.10.12");
		salChance.setChcCreateId(5l);
		salChance.setChcCreateName("测试项.createName.2017.10.12");
		salChance.setChcCreateDate(new Date());
		salChance.setChcStatus("1");
		
		salChanceService.add(salChance);
	}
}
