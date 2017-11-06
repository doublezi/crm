package com.crm.service;

import java.util.List;

import com.crm.pojo.SysRole;
/**
 * 
 * @Description 
 * 第一阶段：简易增删改查 @data 17.09.28  
 * @author 隔壁老王
 * @date 2017年9月28日 上午10:05:47
 *
 * @version
 */
public interface SysRoleService {
	
	public void add(SysRole sysRole);
	
	public void delete(SysRole sysRole);
	
	public void update(SysRole sysRole);
	
	public SysRole getById(Long id);
	
	public List<SysRole> findAll();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
