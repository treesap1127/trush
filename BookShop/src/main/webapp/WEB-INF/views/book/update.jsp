<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form method="post" action="update">
			<div>
				<label>도서번호:</label> 
				<input name="bookid" type="text"
					value="${item.bookid}" readonly>
			</div>
			<div>
				<label>도서명:</label> 
				<input name="bookname" type="text"
					value="${item.bookname}">
			</div>
			<div>
				<label>출판사:</label> 
				<input name="publisher" type="text"
					value="${item.publisher}">
			</div>
			<div>
				<label>가격:</label> 
				<input name="price" type="text"
					value="${item.price}">
			</div>
			<div>
				<input type="submit" value="변경">
			</div>
		</form>
	</div>
	<div>
		<a href="add">등록</a>
	</div>
</body>
</html>