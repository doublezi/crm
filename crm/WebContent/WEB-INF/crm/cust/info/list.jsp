<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- BEGIN -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- END   -->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>客户管理页面</title>
        <!-- 外部样式表引入 开始 -->
        <!-- 外部样式表引入 结束 -->
    </head>
    <body>
    	<!-- 顶部基础导航栏 开始 -->
    	<div class="basic-nav-bar">
    		<label style="color:red"><b>基础导航栏区域</b></label>
    		<ul>
				<li><a href=#>登陆者：</a></li>
				<li><a href="#">注销</a></li>
				<li><a href="#">开发</a></li>
    		</ul>
    	</div>
    	<!-- 顶部基础导航栏 结束 -->
    	
	    <!-- --------------------------------------------------------------------------- -->
	    	
	    <!-- 核心区域 开始 -->
		<div class="core-block">
	
	    	<div class="function-nav-bar"><!-- 左侧功能导航栏 开始 -->
	    		<p style="color:red"><b>功能导航栏区域</b></p>
	    		<table border="1">
	    			<tr>
						<td><b>系统级别</b></td>
						<td><b>客户级别</b></td>
					</tr>
					<tr>
						<td><a href="<c:url value="/sysuser/list"/>">用户管理</a></td>
						<td><a href="<c:url value="/cstcustomer/list"/>">客户管理</a></td>
					</tr>
					<tr>
						<td><a href="">权限管理</a></td>
						<td><a href="">服务管理</a></td>
					</tr>
					<tr>
						<td><a href="">菜单管理</a></td>
						<td><a href="">活动管理</a></td>
					</tr>
					<tr>
						<td><a href="">系统日志</a></td>
						<td><a href="">开发中...</a></td>
					</tr>
	    		</table>
	    	</div><!-- 左侧功能导航栏 结束 -->
	
	    	
	    	<div class="data-view-block"><!-- 数据展示区域 开始 -->
				
				<div class="search-block"><!-- 查询区域（模糊查询，精准查询） 开始 -->
					<form action="">
					<label style="color:red"><b>搜一搜区域</b></label>
					<input type="text" />
					<button type="submit">提交查询</button>
					</form>
				</div><!-- 查询区域（模糊查询，精准查询）结束 -->
				
				<div class="data-list-block"><!-- 数据列表区域 开始 -->
					<a href="<c:url value="/cstcustomer/redirectAddPage"/>">添加新用户</a>
			    	<p style="color:red"><b>数据列表：/</b></p>
			    	<table border="1">
			              <thead>
			              <tr>
			                <th ><input type="checkbox" /></th>
			                <th >客户编号</th>
			                <th >客户姓名</th>
			                <th >隶属客户经理的编号</th>
			                <th >客户证件照</th>
			                <th >邮编</th>
			                <th >等级</th>
			                <th >操作</th>
			              </tr>
			              </thead>
			              <tbody>
			              <!-- 掌握c:forEach的用法，以及掌握这一相似技术的用法 -->
			              <c:forEach items="${cstCustomerList}" var="cstCustomer">
			              <tr>
			                <td><input type="checkbox" /></td>
			                <td>${cstCustomer.custNo}</td>
			                <td><a href="#">${cstCustomer.custName}</a></td>
			                <td>${cstCustomer.custManagerId}</td>
			                <td><img alt="" src="${cstCustomer.custIDC}"></td>
			                <td>${cstCustomer.custZip}</td>
			                <td>${cstCustomer.custLevel}</td>
			                <td>
			                  <div >
			                    <div>
			                      <a href="<c:url value="/cstcustomer/redirectEditPage/${cstCustomer.custNo}"/>" ><span></span> 修改密码</a>
			                      <a href="<c:url value="/cstcustomer/delete?userId=${cstCustomer.custNo}"/>" ><span></span> 删除用户</a>
			                    </div>
			                  </div>
			                </td>
			              </tr>
			              </c:forEach>
			              </tbody>
			            </table>
		            </div><!-- 数据列表区域 结束 -->
	    	</div><!-- 数据展示区域 结束 -->
	    
	    </div><!--  -->
    
    
   		<!-- 页脚 开始 -->
	    <div class="foot-block">
	    	<p style="color:red"><b>页脚，版权区域</b></p>
	    </div>
		<!-- 页脚 结束 -->
 	</body>
</html>