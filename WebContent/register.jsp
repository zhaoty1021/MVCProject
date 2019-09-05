<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
<link rel="stylesheet" href="./css/register.css">
</head>
<body>
	<%
		if ((String)request.getAttribute("str2") == "passwderror") {
	%>
	<script>
		alert("两次密码不一致！");
	</script>
	<%
		}
	%>
	<div>
	<h1 id="id1">注册</h1>
	</div>
	<div style="top:0; left:0; position: fixed;z-index: -1;width:100%;height: 100%;">
	<img src="./image/45373.jpg" width="100%" height="100%">
	</div>
	<div style="position: relative;zoom:1;">
	<form action="RegisterServlet" method="post">
	<p>
	<label>id：</label>
	<input type="text" name="uid" autocomplete="off" value placeholder="请输入id号">
	</p>
	<p>
	<label >username：</label>
	<input type="text" style="display:none;">
	<input type="text" name="username" autocomplete="off" value placeholder="请设置用户名">
	</p>
	<p>
	<label>password：</label>
	<input type="password" name="upasswd" autocomplete="off" value placeholder="请设置密码">
	</p>
	<p>
	<label>confirm password：</label>
	<input type="password" name="upasswd2" autocomplete="off" value placeholder="请再次输入密码">
	</p>
	<button type="formaction" id="id2">注册</button>
	</form>
	</div>
</body>
</html>