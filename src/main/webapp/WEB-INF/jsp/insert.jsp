<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta content="yes" name="apple-mobile-web-app-capable">
<meta content="black" name="apple-mobile-web-app-status-bar-style">
<meta content="yes" name="apple-touch-fullscreen">
<meta content="telephone=no" name="format-detection">
<meta name="format-detection" content="telephone=no,email=no">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1, user-scalable=no, minimal-ui">
<title>增加界面</title>
<style type="text/css">
html, body {
	padding: 0;
	margin: 20px;
	border: 0;
	font-family: microsoft yahei;
}

a {
	text-decoration: none;
	color: #333;
	font-size: 18px;
	margin-right: 30px;
}

a:HOVER {
	text-decoration: underline;
}
</style>
</head>
<body>
	<header>
		<h3>增加界面</h3>
	</header>
	<section>
		用户名:<input type="text" id="username"><br> 密码:<input
			type="password" id="password"><br>
		<button id="submit">增加用户</button>
	</section>
</body>
<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
<script>
	$("#submit").click(function() {
		console.log("submit");
		var username = $("#username").val();
		var password = $("#password").val();
		var param = "username=" + username + "&password=" + password;
		$.ajax({
			type : "POST",
			url : "insert",
			data : param,
			success : function(msg) {
				console.log(msg.returnMessage);
				$("#username").val("");
				$("#password").val("");
				alert(msg.returnMessage);
			}
		});
	});
</script>
</html>