package com.crm.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.pojo.SalChance;
import com.crm.pojo.SalPlan;
import com.crm.service.SalChanceService;
import com.crm.service.SalPlanService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SalPlanTest {

	@Autowired
	public SalPlanService salPlanService;
	@Autowired
	public SalChanceService salChanceService;

	@Test
	public void test_add() {
		SalChance salChance = salChanceService.findById(1l);

		if (salChance != null) {
			 SalPlan salPlan = new SalPlan();
			 salPlan.setPlaId(1l);
			 salPlan.setPlaDate(new Date());
			 salPlan.setPlaTodo("to do something");
			 salPlan.setPlaResult("good nice");
			 salPlan.setSalChance(salChance);
			 salPlanService.add(salPlan);
		}else {
			System.out.println("Ö´ÐÐÊ§°Ü£¡");
		}
	}
}
