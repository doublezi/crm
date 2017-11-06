package com.crm.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crm.pojo.SysRole;
import com.crm.service.SysRoleService;

@RunWith(value=SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SysRoleTest {
	
	@Autowired
	private SysRoleService sysRoleService;
	
	@Test
	public void testAdd(){
		
		// ���Ʋ�
		String role_name="����";
		String role_desc="����1������2";
		int role_flag=1;
		SysRole sysRole=new SysRole();
		//δ֪��
		sysRole.setRoleId(6);
		sysRole.setRoleName(role_name);
		sysRole.setRoleDesc(role_desc);
		sysRole.setRoleFlag(role_flag);
		//ҵ���
		sysRoleService.add(sysRole);

	}
	

	
}
