<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../include/header.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<form method="post" class="mt-4">
			<div class="input-group mt-2">
				<label class="input-group-text col-2">제품명:</label> 
				<input type="text" name="name" class="form-control" value="${item.name}">
			</div>
			<div class="mt-2 input-group">
				<label class="input-group-text col-2">규격:</label>
				<input type="text" name="spec" class="form-control" value="${item.spec}">
			</div>
			<div class="mt-2 input-group">
				<label class="input-group-text col-2">카테고리:</label>
				<input type="text" name="category" class="form-control" value="${item.category}"> 
			</div>
			<div class="mt-2 input-group">
				<label class="input-group-text col-2">제조사:</label>
				<input type="text" name="manufacture" class="form-control" value="${item.manufacture}">
			</div>
			<div class="mt-2 input-group">
				<label class="input-group-text col-2">가격:</label>
				<input type="number" name="price" class="form-control" value="${item.price}"> 
			</div>
			<div class="row mt-4">
				<div class="col"></div>
				<div class="col">
					<button class="btn btn-primary form-control">변경</button>
				</div>
				<div class="col"></div>
			</div>
		</form>
	</div>
	<jsp:include page="../include/body.jsp"></jsp:include>
</body>
</html>