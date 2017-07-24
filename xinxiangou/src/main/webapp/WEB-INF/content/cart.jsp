<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>购物车</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-ui"></script>
<link href="http://www.francescomalagrino.com/BootstrapPageGenerator/3/css/bootstrap-combined.min.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/bootstrap.min.js"></script>
  </head>
  <body>
  
  
  
  
  <div class="container">
  <div class="row"> 
        <div class="col-md-10  col-sm-6"  > 
           <a>尊敬的${sessionScope.user.username}用户，欢迎访问购物车</a>
        </div>
        <div>
        <a href="comment">我要评论 </a>
        </div> 
   </div>              
       
        
   </div> 
   <hr>
 <div class="container">
  　<div class="col-md-1">
  　   
  　</div>
   <div class="col-md-9">
      	<div class="navbar navbar-default " role="navigation">
             <ul class="nav nav-tabs">
				<li >
					<a href="home">首页<br>Home</a>
				</li>
								</li>
<li  >
					<a href="total">用户评价<br>Comment</a>
				</li>
						<li><a href="collection.action?username=${ sessionScope.user.username }" >我的收藏<br>Collection</a></li>
                		<li><a href="cart.action?username=${ sessionScope.user.username }"  class="btn btn-warning btn-lg" class="active"><span class="glyphicon glyphicon-home"></span> <strong>购物车<br>Cart</strong> </a>  </li>
					</ul>
    	 </div>
   </div>
  </div>
   
  
 <div>
     <div style="width:60%;margin:auto auto;">
        
         <h2 >尊敬的${sessionScope.user.username}用户，欢迎访问购物车<a href="cart.action?username=${ sessionScope.user.username }"  class="btn btn-warning btn-lg"><span class="glyphicon glyphicon-home"></span> <strong>购物车</strong> </a>
            &emsp; <a class="btn btn-info btn-lg" href="home" role="button">继续购物</a>   
           &emsp;<a class="btn btn-danger" href="clear" role="button">清空购物车</a></h2>
           
          
         <br>
         <table class="table table-hover">
                
                <tr>
			<th class="thtd">商品图片</th>
			<th class="thtd">商品描述</th>
			<th class="thtd">产品名称</th>
			<th class="thtd">产品价格</th>
			<th class="thtd">产品数量</th>
			<th class="thtd"><font color="blue">购买</font></th>
			<th class="thtd"><font color="black">减少数量</font></th>
			<th class="thtd"><font color="red">删除</font></th>
		    </tr>
	  
           <c:forEach items="${requestScope.cart_list }" var="cart">
                <c:forEach items="${cart.product }" var="product">
			<tr>
				<td><img src="image/${product.image}"></td>
				<td>${product.descripts}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td>${cart.count }</td>
			<td>
			<a class="btn btn-info" href="saveorder?product_id=${product.id}" role="button">立即购买</a>
		    </td>
		    <td>
			<a class="btn btn-warning" href="reduce?product_id=${product.id}" role="button">减少数量</a>
		    </td>
		    <td>
			<a class="btn btn-danger" href="remove?product_id=${product.id}" role="button">删除</a>
		    </td>
		  </tr>
		          </c:forEach>  
	
		</c:forEach>		
        </table>
     </div>
 </div>
 
 
 
 
 
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