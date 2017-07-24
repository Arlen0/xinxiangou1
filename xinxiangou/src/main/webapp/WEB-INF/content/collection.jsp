<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<title>收藏夹</title>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-ui"></script>
<link href="http://www.francescomalagrino.com/BootstrapPageGenerator/3/css/bootstrap-combined.min.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/bootstrap.min.js"></script>
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
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
				<script type="text/javascript">
					jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
							event.preventDefault();
							$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
						});
					});
				</script>
<!--slider-script-->
		<script src="js/responsiveslides.min.js"></script>
			<script>
				$(function () {
				  $("#slider1").responsiveSlides({
					auto: true,
					speed: 500,
					namespace: "callbacks",
					pager: true,
				  });
				});
			</script>
<!--//slider-script-->
<script>$(document).ready(function(c) {
	$('.alert-close').on('click', function(c){
		$('.message').fadeOut('slow', function(c){
	  		$('.message').remove();
		});
	});	  
});
</script>
<script>$(document).ready(function(c) {
	$('.alert-close1').on('click', function(c){
		$('.message1').fadeOut('slow', function(c){
	  		$('.message1').remove();
		});
	});	  
});
</script>
</head>
<body>
  <!--header-->
	<div class="header">
		<div class="header-top">
			<div class="container">	
			<div class="header-top-in">			
				<div class="logo">
					<a href="index.html"><img src="image/logo.png" alt=" " ></a>
				</div>
				<div class="header-in">
						<div>当前在线人数：${applicationScope.count}</div>
						 <div>${ sessionScope.user.username }</div>
						 <a href ="loginForm">注销</a>
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

						<li class="active"><a href="collection.action?username=${ sessionScope.user.username }" >我的收藏<br>Collection</a></li>
                		<li><a href="cart.action?username=${ sessionScope.user.username }"  class="btn btn-warning btn-lg"><span class="glyphicon glyphicon-home"></span> <strong>购物车<br>Cart</strong> </a>  </li>
					</ul>
				<script type="text/javascript" src="js/nav.js"></script>
			</div>
		</div>
		</div>
  <div class="container">
   <h2>我的收藏</h2>
    <table class="table table-condensed" border="1">
     	<thead>
        	<tr> 
            	<th >商品图片</th>     
                <th >商品名称</th>
                <th >商品价格</th>
                <th >商品描述 </th>
                <th >操作</th>
            </tr>
       </thead>
            <c:forEach items="${requestScope.collect_list }" var="c">
             <tr >
             	<td style="vertical-align: middle;"><img src="image/${c.image }" height="40"></td>
             	<td style="vertical-align: middle;">${c.goodsname }</td>
             	<td style="vertical-align: middle;">${c.price }</td>
             	<td style="vertical-align: middle;">${c.descripts }</td> 
             	<td style="vertical-align: middle;"> 
             		<a href="cart">查看购物车</a>
                     </td>
             </tr>
            </c:forEach>
       
     </table>
 </div>
  <hr>

 
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