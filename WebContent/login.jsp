<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
<link rel="stylesheet" href="./css/color.css">
</head>
<body>
	<%
		if ((String)request.getAttribute("str") == "false") {
	%>
	<script>
		alert("登录失败！用户名或密码错误");
	</script>
	<%
		}
	%>
	<%
		if ((String)request.getAttribute("str2") == "true") {
	%>
	<script>
		alert("注册成功");
	</script>
	<%
		}
	%>
	<div style="top:0; left:0; position: fixed;z-index: -1;width:100%;height: 100%;">
	<img src="./image/wallhaven-p8jvxm.jpg" width="100%" height="100%">
	</div>
	<form action="LoginServlet" method="post">
		<div id="id1">
			<div>
				<div>
					<p id="id2">登录</p>
				</div>
				<div >
					<font id="id5">用户名:</font><input type="text" placeholder="输入用户名" name="uname"/>
				</div>
				<div>
					<font id="id5">密码：   </font><input type="password"placeholder="输入用户密码" name="upwd"/>
				</div>
				<div>
				<input type="submit" value="登录" id="id3">
				</div>
			</div>
		</div>
		<div id="id1">
			<a href="register.jsp" id="id5">注册</a>
		</div>
	</form>
</body>
</html>