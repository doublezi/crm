package com.crm.pojo;

import java.util.List;

/**
 * �˵���
 * �������˵���v1.0��Ҫ���������˵���
 * 1.Ӫ������(market manage)</br>
 * 2.�ͻ�����(customer manage)</br>
 * 3.�������(service manage)</br>
 * 4.ͳ�Ʊ���(statistical report)</br>
 * 5.��������(basic data)<br>
 * 6.Ȩ��(rights)</br>
 * ¼��˵�����Ĺ���ȡ��������ĸСд
 * @Description TODO
 * @author ��������
 * @date 2017��7��18�� ����3:45:32
 *
 * @version
 */
public class SysRight {
	private String rightCode;//�������˵����룩
	private String rightParentCode;//���˵�����
	private String rightType;//�˵�����
	private String rightText;//�˵��ı�
	private String rightUrl;//�˵�����·��
	private String rightTip;//�˵���ʾ
	
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
