<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户评价</title>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-ui"></script>
<link href="http://www.francescomalagrino.com/BootstrapPageGenerator/3/css/bootstrap-combined.min.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<img alt="140x140" src="image/logo.png" />

			<ul class="nav nav-tabs">
				<li >
					<a href="home">首页<br>Home</a>
				</li>
<li  class="active">
					<a href="total">用户评价<br>Comment</a>
				</li>
						<li><a href="collection.action?username=${ sessionScope.user.username }" >我的收藏<br>Collection</a></li>
                		<li><a href="cart.action?username=${ sessionScope.user.username }"  class="btn btn-warning btn-lg"><span class="glyphicon glyphicon-home"></span> <strong>购物车<br>Cart</strong> </a>  </li>
					</ul>
<div class="container">
   <h2>用户评价</h2>
    <table class="table table-condensed" border="1">
     	<thead>
        	<tr> 
            	<th >物流评价</th>     
                <th >质量评价</th>
                <th >服务评价</th>
                <th >客户评论 </th>
                <th >图片展示</th>
            </tr>
       </thead>
            <c:forEach items="${requestScope.comment_list }" var="c">
             <tr >
                <td style="vertical-align: middle;">${c.logistica }</td>
                <td style="vertical-align: middle;">${c.quality }</td>
             	<td style="vertical-align: middle;">${c.service }</td>
             	<td style="vertical-align: middle;">${c.comments }</td> 
             	<td style="vertical-align: middle;"><img src="image/${c.image5 }" height="80"></td>

 
             </tr>
            </c:forEach>
       
     </table>
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