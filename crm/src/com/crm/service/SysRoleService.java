package com.crm.service;

import java.util.List;

import com.crm.pojo.SysRole;
/**
 * 
 * @Description 
 * ��һ�׶Σ�������ɾ�Ĳ� @data 17.09.28  
 * @author ��������
 * @date 2017��9��28�� ����10:05:47
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
