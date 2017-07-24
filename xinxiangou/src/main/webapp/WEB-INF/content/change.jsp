<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>修改密码</title>
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
<body>
<div class="header">
		<div class="header-top">
			<div class="container">	
			<div class="header-top-in">			
				<div class="logo">
					<a href="index.html"><img src="image/logo.png" alt=" " ></a>
				</div>
				<div class="header-in">
						<a href="loginForm">已有账号？直接登录</a></div>
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
				<li  >
					<a href="total">用户评价<br>Comment</a>
				</li>
						<li><a href="collection.action?username=${ sessionScope.user.username }" >我的收藏<br>Collection</a></li>
                		<li><a href="cart.action?username=${ sessionScope.user.username }"  class="btn btn-warning btn-lg"><span class="glyphicon glyphicon-home"></span> <strong>购物车<br>Cart</strong> </a>  </li>
					</ul>
				<script type="text/javascript" src="js/nav.js"></script>
			</div>
		</div>
		</div>
	 <form action="change" method="post"> 
		  	   <font color="red">${requestScope.message }</font>
		  	 <div class="col-md-12 ">
		  	     <div class="row">
		  	            <div class="form-group">
                           <div class="col-md-3 ">  登录名：</div>
                           <div class="col-md-9">
                                   <input type="text" name="loginname2" id="loginname2" tabindex="1" class="form-control" placeholder="请输入你的登录名" value="">
                           </div> 
		   		        </div>
						<div class="form-group">
                           <div class="col-md-3 ">  旧密码：</div>
                           <div class="col-md-9">
                                   <input type="password" name="password2" id="password2" tabindex="1" class="form-control" placeholder="请输入你的新密码" value="">
                           </div> 
		   		        </div>
		   		        <div class="form-group">
                           <div class="col-md-3 ">  新密码：</div>
                           <div class="col-md-9">
                                   <input type="password" name="newpwd" id="newpwd" tabindex="1" class="form-control" placeholder="输入你的新密码" value="">
                           </div> 
		   		        </div>
				        <div class="form-group">
							<div class="row">
								<div class="col-sm-5 col-sm-offset-4">
									<button type="submit" class="btn btn-default btn-lg" >立即修改</button>
								</div>
							</div>
						</div>
			</div>
			</div>
		</form>
</body>
</html>