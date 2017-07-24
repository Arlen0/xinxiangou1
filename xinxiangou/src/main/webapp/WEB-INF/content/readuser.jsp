<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<title>找回密码</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='https://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<!--//fonts-->
</head>
<body >
<div class="header">
		<div class="header-top">
			<div class="container">	
			<div class="header-top-in">			
				<div class="logo">
					<a href="index.html"><img src="image/logo.png" alt=" " ></a>
				</div>
				
			</div>
			</div>
		</div>
		<div class="header-bottom">
		<div class="container">
			<div class="h_menu4">
				<ul class="nav nav-tabs">
				<li >
					<a href="home">首页<br>Home</a>
				</li>
				<li><a href="loginForm">已有账号？直接登录</a></div></li>
					</ul>
				<script type="text/javascript" src="js/nav.js"></script>
			</div>
		</div>
		</div>
<div class=" container">
    <div class="row">
			<div class="col-md-6 col-md-offset-3" style="padding:100px  0px 0px 0px ; ">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							<div class="text-center">
                            	<p><strong>恭喜你成功找回密码！</strong></p> 
							</div>
						</div>
						<hr>
					</div>
		  	 <form action="findpassword" method="post"> 
		  	   <font color="red">${requestScope.message }</font>
		  	 <div class="col-md-12 ">
		  	     <div class="row">
						<div class="form-group">
                           <div class="col-md-3 ">  你的密码是：</div>
                           <div class="col-md-9">
                                   <input type="text" name="password" id="password" tabindex="1" class="form-control" value="${sessionScope.user1.password}">
                           </div> 
		   		        </div>
		   		         
				        <div class="form-group">
							<div class="row">
								<div class="col-sm-5 col-sm-offset-4">
									<div class="col-md-4 col-md-offset-2"><a class="btn btn-warning btn-lg" href="loginForm" role="button">我要登录</a></div>
								</div>
							</div>
						</div>
						<div class="form-group">
							<div class="row">
								<div class="col-sm-5 col-sm-offset-4">
									<div class="col-md-4 col-md-offset-2"><a class="btn btn-warning btn-lg" href="newpassword" role="button">修改密码</a></div>
								</div>
							</div>
						</div>
			</div>
			</div>
		</form>
	</div>
	</div>
	
	</div>
</div>

</body>
</html>

