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
<title>查询界面</title>
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

th, td {
	border: none;
	box-shadow: 0px 0px 1px 1px #999;
}

a:HOVER {
	text-decoration: underline;
}
</style>
</head>
<body>
	<header>
		<h3>查询界面</h3>
	</header>
	<section>
		<button id="search">查询</button>
		<table id="result">

		</table>
	</section>
</body>
<script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.min.js"></script>
<script>
	$("#search").click(
			function() {
				console.log("search");
				$.ajax({
					type : "POST",
					url : "queryStudents",
					data : "",
					success : function(result) {
						var students = result.data;
						var sLength = result.data.length;
						var show = "<tr><th>姓名</th><th>密码</th></tr>";
						for (var i = 0; i < sLength; i++) {
							show += "<tr><td>" + result.data[i].username
									+ "</td><td>" + result.data[i].password
									+ "</td></tr>";
						}
						console.log(show);
						$("#result").html(show);
					}
				});
			});
</script>
</html>