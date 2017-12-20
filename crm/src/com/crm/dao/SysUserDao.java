package com.crm.dao;

import java.util.List;

import com.crm.pojo.SysUser;

public interface SysUserDao {

	//.--------------------------------
	public void add(SysUser sysUser);
	
	public void delete(SysUser sysUser);
	
	public void update(SysUser sysUser);
	
	public void updatePassword(long usrId,String newPassword);
	
	public SysUser findById(long id);
	
	public List<SysUser> findAll();
	//.---------------------------------
	
	//.=================================
	public SysUser validate(String username,String userpassword);
	//.=================================
	
}
