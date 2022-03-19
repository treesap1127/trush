<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../include/header.jsp"></jsp:include>
</head>
<body>
	<div class="container">
		<form method="post" class="mt-4">
			<div class="mt-2">
				<label>제품명:</label> <select name="product" class="form-select">
					<c:forEach var="product" items="${listProduct}">
						<option value="${product.code}" ${item.product == product.code ? 'selected' : ''}>${product.name}</option>
					</c:forEach>
				</select>

			</div>
			<div class="mt-2">
				<label>거래처:</label> <select name="partner" class="form-select">
					<c:forEach var="partner" items="${listPartner}">
						<option value="${partner.code}"${item.partner == partner.code ? 'selected' : '' }>${partner.name}</option>
					</c:forEach>
				</select>
			</div>
			<div class="mt-2 input-group">
				<label class="input-group-text col-2">수량:</label> <input
					type="number" name="amount" class="form-control"
					value="${item.amount}">
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