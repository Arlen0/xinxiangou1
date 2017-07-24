<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<title>商品详情</title>
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
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-ui"></script>
<link href="http://www.francescomalagrino.com/BootstrapPageGenerator/3/css/bootstrap-combined.min.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/bootstrap.min.js"></script>
</head>
<body>
 <div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<div class="row-fluid">
				<div class="span4">
					<img alt="1000x1000" src="image/logo.png" />
				</div>
				<div class="span6">
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
				</div>
				<div class="span2">
					<div class="row-fluid">
						<div class="span4">
						</div>
						<div class="span4">
						</div>
						<div class="span4">
							<a href="loginForm"> <button class="btn" type="button">登录</button></a><a href="register" > <button class="btn" type="button">注册</button></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

 <div class="container" >
 		<c:forEach items="${requestScope.p_list }" var="product">
   <div class="col-md-1" >
   				
     <div class="row">
        <div class="thumbnail"> <img src="image/${product.image }" class="img-responsive"></div>
     </div>
   
      <div class="row">
        	<div class="thumbnail"> <img src="image/${product.image2 }"  class="img-responsive"></div>
      </div>
      
      <div class="row">
      		<div class="thumbnail"> <img src="image/${product.image3 }" " class="img-responsive"></div>
      </div>
       
      <div class="row">
       		<div class="thumbnail"> <img src="image/${product.image4 }"  class="img-responsive"></div>
      </div>
    </div>
   <div class="col-md-6" >
   		<div class=" text-center"> <img src="image/${product.image }"  style="width:450px"></div>
   </div>
   <div class="col-md-4 col-md-offset-1">
   		<div><p align="left">${product.name}</p> </div>
        <br>
        <div class="panel panel-default">
            <div class="panel-heading">
                <p>${product.descripts}</p>
            </div>
        </div>
 		<div class="available">
								<ul>
									<li>发货地点:
										<select>
										<option>上海</option>
										<option>北京</option>
										<option>郑州</option>
										<option>广州</option>
									</select></li>
								<li>物流方式:<select>
									<option>顺丰</option>
									<option>中通</option>
									<option>韵达</option>
									<option>圆通</option>
									<option>申通</option>
								</select></li>
								<li>数量:<select>
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
								</select></li>
							</ul>
						</div>
        <p>价格  ${product.price}   </p>
       	<div class="row">          
         </div>  
         <p> <div class="col-md-6">已销售： ${product.sales}  件</div> 
             <div class="col-md-6">库存：${product.stock}   件</div> 
         <br><br> 
         <form action="newcollect">
         <div class="col-md-9">
         		<input type="hidden" name="id" id="id" tabindex="1" class="form-control" value="${product.id}" > 
                <input type="hidden" name="name" id="name" tabindex="1" class="form-control" value="${product.name}" >
                <input type="hidden" name="price" id="price" tabindex="1" class="form-control" value="${product.price}" >
                <input type="hidden" name="image" id="image" tabindex="1" class="form-control" value="${product.image}" >
                <input type="hidden" name="descripts" id="descripts" tabindex="1" class="form-control" value="${product.descripts}" >
                <input type="hidden" name="username" id="username" tabindex="1" class="form-control" value="${ sessionScope.user.username }" >
          </div> 
        <div class="row">
            <div class="col-md-5  col-md-offset-1">
                 <button type="submit" class="btn btn-danger btn-lg " >添加收藏夹</button>
            </div>          
         </div>
        </form>
         <form action="savecart">
         <div class="col-md-9">
         		<input type="hidden" name="id" id="id" tabindex="1" class="form-control" value="${product.id}" > 
                <input type="hidden" name="name" id="name" tabindex="1" class="form-control" value="${product.name}" >
                <input type="hidden" name="price" id="price" tabindex="1" class="form-control" value="${product.price}" >
                <input type="hidden" name="image" id="image" tabindex="1" class="form-control" value="${product.image}" >
                <input type="hidden" name="descripts" id="descripts" tabindex="1" class="form-control" value="${product.descripts}" >
                <input type="hidden" name="username" id="username" tabindex="1" class="form-control" value="${ sessionScope.user.username }" >
          </div> 
        <div class="row">
            <div class="col-md-5  col-md-offset-1">
                  <p><a href="save?product_id=${product.id}" class="btn btn-danger btn-lg " role="button"> 加入购物车</a></p>
            </div>
           </div>          
        </form>
        </div> 
   </c:forEach>
   </div>   
 <hr>
 <div class="container">
 <form action="product.comment" method="post">
 <c:forEach items="${requestScope.comment_list }" var="c">
  <div class="row">
            <h1 class="text-left">商品评论</h1>
    </div>
   <div class="row">
   		<div class="col-md-2">
           <p>用户名 ${c.username}</p>
        </div>
        <div class="col-md-10">
        <div class="row">
         	<ul>
            	<li>商品质量:   <a class="text-danger">${c.quality}分 </a></li>
            	<li>卖家服务:   <a class="text-danger">${c.service}分 </a> </li>
                <li>物流服务:   <a class="text-danger">${c.logistics}分 </a></li>
            </ul> 
        </div>
        <div class="panel panel-default">
            <div class="panel-body">
                <p>${c.comments}</p>
            </div>
            <div class="row">
            <div class="col-md-2 col-md-offset-2">
             <img src="1.jpg" class="img-responsive">
            </div>
            <div class="col-md-2">
             <img src="1.jpg" class="img-responsive">
            </div>
            </div>
        </div>
             
        </div>
   </div>
   </c:forEach>
   
   </form>
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