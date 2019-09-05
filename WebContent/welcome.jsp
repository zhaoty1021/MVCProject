<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.login.entity.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户<%
			Login login=(Login)request.getAttribute("login");
			out.println(login.getUsername());				
			%>
</title>
<link rel="stylesheet" href="./css/color.css">
</head>
<body>
	<%
		if ((String)request.getAttribute("str") == "true") {
	%>
	<script>
		alert("登录成功！");
	</script>
	<%
		}
	%>
	<div style="top:0; left:0; position: fixed;z-index: -1;width:100%;height: 100%;">
	<img src="./image/1035357.jpg" width="100%" height="100%">
	</div>
	<table align="center">
  <tr style="color: #e22018">
    <th>id</th>
    <th>username</th>
    <th>name</th>
    <th>age</th>
    <th>address</th>
  </tr>
  <tr>
    <td><%=login.getId() %></td>
    <td><%=login.getUsername() %></td>
    <td><%=login.getName() %></td>
    <td><%=login.getAge() %></td>
    <td><%=login.getAddress() %></td>
  </tr>
  <div id="id1">
   <a href="change.jsp">修改</a></div>
</table>
</body>
</html>