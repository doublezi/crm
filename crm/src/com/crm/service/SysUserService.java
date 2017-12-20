package com.crm.service;

import java.util.List;

import com.crm.pojo.SysUser;

public interface SysUserService {

	//.----------------------------------
	public void add(SysUser sysUser);
	
	public void delete(SysUser sysUser);
	
	public void update(SysUser sysUser);
	
	public void updatePassword(long userId,String newPassword);
	
	public SysUser findById(long id);
	
	public List<SysUser> findAll();
	//.----------------------------------

	//.==================================
	public SysUser validate(String username,String userpassword);
}
