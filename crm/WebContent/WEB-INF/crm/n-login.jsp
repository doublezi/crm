<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="/crm/sysuser/login?username=${username}&userpassword=${userpassword}">
		<label>账户：</label><input type="text" name="userName"/>
		<label>密码：</label><input type="password" name="userPassword"/>
		<button type="submit">登陆</button>
	</form>
</body>
</html>