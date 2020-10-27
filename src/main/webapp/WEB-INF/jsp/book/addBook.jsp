<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<script type="text/javascript" src="/js/jquery-3.2.1.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.0/dist/js/bootstrap.min.js"
	integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
	crossorigin="anonymous"></script>
<title>添加图书</title>
</head>
<body>
	<div class="container-md">
		<div class="card">
			<h5 class="card-header">添加图书</h5>
			<div class="card-body">
				<form id="insertForm" action="/book/insert" method="post" enctype="multipart/form-data">
					<div class="form-group">
						<label for="id">图书编号</label> <input type="number"
							class="form-control" id="id" name="id">

					</div>
					<div class="form-group">

						<label for="name">图书名称</label> <input type="text"
							class="form-control" id="name" name="name">

					</div>
					<div class="form-group">

						<label for="price">图书价格</label> <input type="text"
							class="form-control" id="price" name="price">
					</div>

					<div class="form-group">
						<label for="img">图书封面</label> <input type="file"
							class="form-control" id="img" name="img">
					</div>

					<input id="submit" type="submit" class="btn btn-primary"
						value="添加图书" />
				</form>
			</div>
		</div>

	</div>
</body>
</html>