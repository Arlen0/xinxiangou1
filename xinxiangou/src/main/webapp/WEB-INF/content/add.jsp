<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>商品添加</title>
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
				<li class="active">
					<a href="add">商品添加</a>
				</li>
				<li>
					<a href="productManagement">商品管理</a>
				</li>
				<li>
					<a href="#">订单管理</a>
				</li>
				
			</ul>
		</div>
	</div>
	<div class="row-fluid">
		<div class="span4">
		</div>
		<div class="span4">
			<h3 class="text-center">
				商品添加
			</h3>
			<form  action="insertproduct" method="post" >
						<div class="control-group">
							 <label class="control-label" for="name">商品名</label>
							<div class="controls">
								<input type="text" name="name" id="name" tabindex="1" class="form-control" placeholder="价格" >
							</div>
						</div>
						<div class="control-group">
							 <label class="control-label" for="price">密码</label>
							<div class="controls">
								<input type="price" name="price" id="price" tabindex="" class="form-control" placeholder="价格">
							</div>
						</div>
                        <div class="control-group">
							 <label class="control-label" for="descripts">商品描述</label>
							<div class="controls">
								<input type="text" name="descripts" id="descripts" tabindex="1" class="form-control" placeholder="商品描述" >
							</div>
						</div>
						<div class="control-group">
							 <label class="control-label" for="image">image</label>
							<div class="controls">
								<input type="file" name="image" id="image" tabindex="1" class="form-control" placeholder="image" >
							</div>
						</div>
						<div class="control-group">
							 <label class="control-label" for="image">image2</label>
							<div class="controls">
								<input type="file" name="image2" id="image2" tabindex="1" class="form-control" placeholder="image2" >
							</div>
						</div>
						<div class="control-group">
							 <label class="control-label" for="image3">image3</label>
							<div class="controls">
								<input type="file" name="image3" id="image3" tabindex="1" class="form-control" placeholder="image3" >
							</div>
						</div>
						<div class="control-group">
							 <label class="control-label" for="descripts">image4</label>
							<div class="controls">
								<input type="file" name="image4" id="image4" tabindex="1" class="form-control" placeholder="image4" >
							</div>
						</div>
						<div class="control-group">
							 <label class="control-label" for="stock">库存</label>
							<div class="controls">
								<input type="text" name="stock" tabindex="1" class="form-control" placeholder="库存" >
                                        </div>
							</div>
                        <div class="control-group">
							 <label class="control-label" for="sales">销量</label>
							<div class="controls">
								<input type="text" name="sales" id="sales" tabindex="1" class="form-control" placeholder="销量" >
							</div>
						</div>
                       
						
						<div class="control-group">
							<div class="controls">
								  <button type="submit" class="btn btn-default btn-lg">立即添加</button>
							</div>
						</div>
					</form>
		</div>
		<div class="span4">
		</div>
	</div>
</div>
</body>
</html>