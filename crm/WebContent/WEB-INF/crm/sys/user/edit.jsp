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
    	<!-- 【1】顶部基础导航栏 开始 -->
    	<div class="basic-nav-bar">
    		<label style="color:red"><b>基础导航栏区域</b></label>
    		<ul>
				<li><a href=#>登陆者：</a></li>
				<li><a href="#">注销</a></li>
				<li><a href="#">开发</a></li>
    		</ul>
    	</div>
    	<!-- 【1】顶部基础导航栏 结束 -->
    	
	    <!-- --------------------------------------------------------------------------- -->
	    	
	    <!-- 【2】核心区域 开始 -->
		<div class="core-block">
		
	    	<div class="function-nav-bar"><!-- 【2】-1左侧功能导航栏 开始 -->
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
	    	</div><!-- 【2】-1 左侧功能导航栏 结束 -->
	
	    	
	    	<div class="password-update-block"><!-- 【2】-2 密码修改区域  开始 -->
				
				<div class="password-update-form"><!-- 【2】-2-1  密码修改表单  开始 -->
					<form action="${pageContext.servletContext.contextPath}/sysuser/edit/${sysUser.userId}" method="post">
						<div>
							<label>旧密码：</label><br>
							<input type="text" readonly="readonly" value="${sysUser.userPassword}"/>
						</div>
						<div>
							<label>新密码：</label><br>
							<input type="text" name="userPassword" value=""/>
						</div>
						<div>
							<label>确认密码：</label><br>
							<input type="text" name="checkPassword" value=""/>
						</div>
						<div>
							<button type="submit">提交修改</button>
						</div>
					</form>
		        </div><!-- 密码修改表单 结束 -->
		            
	    	</div><!-- 密码修改区域 结束-->
	    
	    </div><!--  -->
    
    
   		<!-- 页脚 开始 -->
	    <div class="foot-block">
	    	<p style="color:red"><b>页脚，版权区域</b></p>
	    	<hr>
      		<p>© 2017 隔壁老王拥有著作权及解释权</p>
	    </div>
		<!-- 页脚 结束 -->
 	</body>
</html>