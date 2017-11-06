package com.crm.dao;

import java.util.List;

import com.crm.pojo.SysRole;

/**
 * �˵������ݷ��ʲ�
 * @Description TODO
 * @author ��������
 * @date 2017��9��27�� ����2:22:40
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
