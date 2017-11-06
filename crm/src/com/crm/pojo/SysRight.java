package com.crm.pojo;

import java.util.List;

/**
 * 菜单表
 * 管理界面菜单，v1.0主要有六个主菜单：
 * 1.营销管理(market manage)</br>
 * 2.客户管理(customer manage)</br>
 * 3.服务管理(service manage)</br>
 * 4.统计报表(statistical report)</br>
 * 5.基本数据(basic data)<br>
 * 6.权限(rights)</br>
 * 录入菜单编码的规则：取单词首字母小写
 * @Description TODO
 * @author 隔壁老王
 * @date 2017年7月18日 下午3:45:32
 *
 * @version
 */
public class SysRight {
	private String rightCode;//主键（菜单编码）
	private String rightParentCode;//父菜单编码
	private String rightType;//菜单类型
	private String rightText;//菜单文本
	private String rightUrl;//菜单访问路径
	private String rightTip;//菜单提示
	
	private List<SysRoleRight> sysRoleRight;
	
	public List<SysRoleRight> getSysRoleRight() {
		return sysRoleRight;
	}
	public void setSysRoleRight(List<SysRoleRight> sysRoleRight) {
		this.sysRoleRight = sysRoleRight;
	}
	public String getRightCode() {
		return rightCode;
	}
	public void setRightCode(String rightCode) {
		this.rightCode = rightCode;
	}
	public String getRightParentCode() {
		return rightParentCode;
	}
	public void setRightParentCode(String rightParentCode) {
		this.rightParentCode = rightParentCode;
	}
	public String getRightType() {
		return rightType;
	}
	public void setRightType(String rightType) {
		this.rightType = rightType;
	}
	public String getRightText() {
		return rightText;
	}
	public void setRightText(String rightText) {
		this.rightText = rightText;
	}
	public String getRightUrl() {
		return rightUrl;
	}
	public void setRightUrl(String rightUrl) {
		this.rightUrl = rightUrl;
	}
	public String getRightTip() {
		return rightTip;
	}
	public void setRightTip(String rightTip) {
		this.rightTip = rightTip;
	}
	
}
