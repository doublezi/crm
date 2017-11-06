package com.crm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.pojo.SysRight;
import com.crm.service.SysRightService;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SysRightTest {
	
	@Autowired
	public SysRightService sysRightService;
	
	@Test
	public void test_delete() {
		SysRight sysRight = sysRightService.findById("test");
		if(sysRight!=null) {
			sysRightService.delete(sysRight);
		}else {
			System.out.println("…æ≥˝ ß∞‹");
		}
	}
	
	@Test
	public void test_add() {
		SysRight sysRight = new SysRight();
		sysRight.setRightCode("test");
		sysRight.setRightParentCode("root_catalog");
		sysRight.setRightText("≤‚ ‘");
		
		sysRightService.add(sysRight);
	}
}
