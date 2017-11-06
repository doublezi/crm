package com.crm.dao;

import java.util.List;

import com.crm.pojo.SysRole;

/**
 * 菜单表数据访问层
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年9月27日 下午2:22:40
 *
 * @version 1.0
 */
public interface SysRoleDao {
	
	public void add(SysRole sysRole);
	
	public void delete(SysRole sysRole);
	
	public void update(SysRole sysRole);
	
	public SysRole findById(Long id);
	
	public List<SysRole> findAll();
}
