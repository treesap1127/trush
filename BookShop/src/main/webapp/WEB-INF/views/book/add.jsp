<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div>
		<form method="post" action="add">
			<div>
				<label>도서번호:</label> <input name="bookid" type="text">
			</div>
			<div>
				<label>도서명:</label> <input name="bookname" type="text">
			</div>
			<div>
				<label>출판사:</label> <input name="publisher" type="text">
			</div>
			<div>
				<label>가격:</label> <input name="price" type="text">
			</div>
			<div>
				<input type="submit" value="등록">
			</div>
		</form>
	</div>
</body>
</html>