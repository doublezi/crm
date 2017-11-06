package com.crm.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.pojo.SysRoleRight;
import com.crm.service.SysRoleRightService;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SysRoleRightTest {
	
	@Autowired
	public SysRoleRightService sysRoleRightService;
	
	@Test
	public void findById() {
		SysRoleRight sysRoleRight = sysRoleRightService.findById(2l);
		if(sysRoleRight!=null) {
			System.out.println(sysRoleRight.getSysRole().getRoleName());
		}
	}
	
	@Test
	public void findAll(){
		List<SysRoleRight> all = sysRoleRightService.findAll();
		for(SysRoleRight sysRoleRight:all) {
			System.out.println(sysRoleRight.getSysRole().getRoleName());
		}
	}
}
