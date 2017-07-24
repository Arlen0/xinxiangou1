<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>商品管理</title>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-2.0.0.min.js"></script>
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/jquery-ui"></script>
<link href="http://www.francescomalagrino.com/BootstrapPageGenerator/3/css/bootstrap-combined.min.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="http://www.francescomalagrino.com/BootstrapPageGenerator/3/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<ul class="nav nav-pills">
				<li >
					<a href="add">商品添加</a>
				</li>
				<li class="active">
					<a href="productManagement">商品管理</a>
				</li>
				<li>
					<a href="#">订单管理</a>
				</li>
				
			</ul>
		</div>
	</div>
 <table class="table table-hover">
                
                <tr>
			<th class="thtd">产品图片</th>
			<th class="thtd">商品描述</th>
			<th class="thtd">产品名称</th>
			<th class="thtd">产品价格</th>
			<th class="thtd">产品库存</th>
			<th class="thtd">产品销量</th>
			<th><a class="btn btn-danger" href="clear" role="button">清空购物车</a></th>
		    </tr>
	  
<c:forEach items="${requestScope.product_list }" var="product">
		<tr>
			<td><img src="image/${product.image }" height="60"></td>
			<td>${product.descripts }</td>	
						<td>${product.name }</td>	
				<td>${product.price }</td>
				<td>${product.stock}</td>
				<td>${product.sales }</td>
				<td><p><a class="btn btn-danger" href="remove?product_id=${product.id}" role="button">删除</a></p></td>
		</tr>

	</c:forEach>		
        </table>
</body>
</html>