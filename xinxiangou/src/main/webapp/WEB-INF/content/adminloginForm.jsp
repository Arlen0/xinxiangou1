<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>管理员登录</title>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-ui"></script>
<link href="http://www.francescomalagrino.com/BootstrapPageGenerator/3/css/bootstrap-combined.min.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span4">
		</div>
		<div class="span4">
			<h3 class="text-center">
				欢迎管理员登录
			</h3>
			<form class="form-horizontal"action="adminlogin" method="post">
				<div class="control-group">
					<label class="control-label" for="inputAdminloginname">管理员用户名</label>
					<div class="controls">
						<input id="inputAdminloginname" name="adminloginname" type="text" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputPassword">管理员密码</label>
					<div class="controls">
						<input id="inputPassword" name="adminpassword" type="password" />
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<br /> <button class="btn" type="submit">登陆</button>
					</div>
				</div>
			</form>
		</div>
		<div class="span4">
		</div>
	</div>
</div>>
</body>
</html>