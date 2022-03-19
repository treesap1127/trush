<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../include/header.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<form method="post" class="mt-4">
			<div class="mt-2 form-floating">
				<input type="text" id="name"name="name" class="form-control" placeholder="제품명">
				<label>제품명:</label>
			</div>
			<div class="mt-2 form-floating">
				<input type="text" id="spec"name="spec" class="form-control" placeholder="규격">
				<label>규격:</label>
			</div>
			<div class="mt-2 form-floating">
				<input type="text" id="category"name="category" class="form-control" placeholder="카테고리">
				<label>카테고리:</label>
			</div>
			<div class="mt-2 form-floating">
				<input type="text" id="manufacture"name="manufacture" class="form-control" placeholder="제조사">
				<label>제조사:</label>
			</div>
			<div class="mt-2 form-floating">
				<input type="number" id="price"name="price" class="form-control" placeholder="가격">
				<label>가격:</label>
			</div>
			<div class="row mt-4">
			<div class="col"></div>
			<div class="col"><button class="btn btn-primary form-control">등록</button></div>
			<div class="col"></div>
			</div>
		</form>
	</div>
<jsp:include page="../include/body.jsp"></jsp:include>
</body>
</html>