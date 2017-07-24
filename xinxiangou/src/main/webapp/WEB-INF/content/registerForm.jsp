<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册</title>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-ui"></script>
<link href="http://www.francescomalagrino.com/BootstrapPageGenerator/3/css/bootstrap-combined.min.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/bootstrap.min.js"></script>	
</head>
<body>

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span4">
			<a href="home"> <button class="btn" type="button">天天鲜购</button></a>
		</div>
		<div class="span4">
		</div>
		<div class="span4">
			<a href="loginForm"> <button class="btn" type="button">已有账号立即登录</button></a>
		</div>
	</div>
</div>
<div class="container">
    	<div class="row">
			<div class="col-md-6 col-md-offset-3" style="padding:150px  5px ; ">
				<div class="panel panel-login">
					<div class="panel-heading">
						<div class="row">
							
							<div class="text-center">
                            	<p>欢迎新会员注册</p> 
							</div>
						</div>
						<hr>
					</div>
					
<form  action="register" method="post" >
						<div class="control-group">
                            <font color="black">${requestScope.message }</font>
							 <label class="control-label" for="loginname">用户名</label>
							<div class="controls">
								<input type="text" name="loginname" id="loginname" tabindex="1" class="form-control" placeholder="注册用户名" >
							</div>
						</div>
						<div class="control-group">
							 <label class="control-label" for="Password">密码</label>
							<div class="controls">
								<input type="password" name="password" id="password" tabindex="" class="form-control" placeholder="输入密码">
							</div>
						</div>
                        <div class="control-group">
							 <label class="control-label" for="username">用户姓名</label>
							<div class="controls">
								<input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="用户姓名" >
							</div>
						</div>
						<div class="control-group">
							 <label class="control-label" for="phonenumber">联系电话</label>
							<div class="controls">
								<input type="text" name="phonenumber" tabindex="1" class="form-control" placeholder="联系电话" >
                                        </div>
							</div>
                        <div class="control-group">
							 <label class="control-label" for="email">邮箱地址</label>
							<div class="controls">
								<input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="邮箱地址" >
							</div>
						</div>
                       
						
						<div class="control-group">
							<div class="controls">
								  <button type="submit" class="btn btn-default btn-lg">立即注册</button>
							</div>
						</div>
					</form>
							</div>
						</div>
					</div>
				</div>
		<!---->
		<br><br><br><br><br>
			<div class="row-fluid">
				<div class="span6">
					<div class="row-fluid">
						<div class="span6">
							<img alt="140x140" src="image/底面1.png" />
						</div>
						<div class="span6">
							<div class="row-fluid">
								<div class="span6">
									<img alt="140x140" src="image/底面2.png" />
								</div>
								<div class="span6">
									<img alt="140x140" src="image/底面3.png" />
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="span6">
					<div class="row-fluid">
						<div class="col-xs-3 span3">
							<ul>
								<li>
									<b>购物指南</b>>
								</li><br>
								<li>
									新用户注册
								</li><br>
								<li>
									在线下单
								</li><br>
								<li>
									支付方式
								</li>
							</ul>
						</div>
						<div class="col-xs-3 span3">
							<ul>
								<li>
									<b>配送说明</b>>
								</li>
								<br>
								<li>
									运费说明
								</li>
								<br>
								<li>
									运费方式
								</li>
								<br>
								<li>
									发票说明
								</li>
							</ul>
						</div>
						<div class="col-xs-3 span3">
							<ul>
								<li>
									<b>售后服务</b>>
								</li>
								<br>
								<li>
									退换货规则
								</li>
								<br>
								<li>服务保障承诺								</li><br>
								<li>
									验货与签收
								</li>
							</ul>
						</div>
						<div class="col-xs-3 span3">
							<ol>
								<li>
									<b>企业服务</b>>
								</li><br>
								<li>
									企业订购
								</li><br>
								<li>
									公司简介
								</li><br>
								<li>
									定制专区
								</li>
								
							</ol>
						</div>
					</div>
				</div>
			</div>
			<div class="row-fluid">
				<div class="span4">
				</div>
				<div class="span4">
				</div>
				<div class="span4">
					 <address> <strong>中国江苏</strong><br /> 徐州大学路1号<br /> 中国矿业大学王德智<br /> <abbr title="Phone">P:</abbr> 15162185378</address>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>		
