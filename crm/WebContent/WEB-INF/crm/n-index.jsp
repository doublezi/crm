<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    	<h6>CRM·客户关系管理系统（简易学习版）·主页</h6>
    	<div id="1">
    		<ul>
				<li><small>登陆人信息：</small><h5></h5></li>
				<li><a href="">注销</a></li>
    		</ul>
    	</div>
    	<div id="2">
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
    	</div>
 	</body>
</html>