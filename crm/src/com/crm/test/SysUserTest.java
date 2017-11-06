package com.crm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.pojo.SysRole;
import com.crm.pojo.SysUser;
import com.crm.service.SysRoleService;
import com.crm.service.SysUserService;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SysUserTest {
	
	@Autowired
	public SysUserService sysUserService;
	@Autowired
	public SysRoleService sysRoleService;
	
	@Test
	public void test_findById() {
		SysUser sysUser = sysUserService.findById(7l);
		System.out.println(sysUser);
		System.out.println(sysUser.getSysRole());
	}
	
	@Test
	public void test_add() {
		SysUser sysUser = new SysUser();
		sysUser.setUserId(7l);
		sysUser.setUserName("≤‚ ‘");
		sysUser.setUserPassword("test");
		
		SysRole sysRole = sysRoleService.getById(4l);
		if(sysRole==null) {
			System.out.println("SysRole is NULL:"+sysRole);
		}else {
			System.out.println("-------"+sysRole.getRoleName());
			sysUser.setSysRole(sysRole);
			sysUserService.add(sysUser);
		}
		
		
	}
}
