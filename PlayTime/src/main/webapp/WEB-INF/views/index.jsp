<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<ul>
		<li><a href="product/">제품관리</a></li><!--제품관리를 넘어가면 kopo/product/로 보냄 -->
		<li><a href="partner/">거래처관리</a></li>
		<li><a href="purchase/">입고관리</a></li>
		<li><a href="sales/">출고관리</a></li>
	</ul>
</div>
<div>
	<h1>지금 이 파일은 9회 실험작입니다!</h1>
</div>
<div style="top: 3rem;">
	<c:if test="${sessionScope.member !=null}">
			<div>
				<span>${sessionScope.member.id}</span><span>님 환영 합니다</span>
				<span>${sessionScope.member.address}</span><span></span>
				<span>${sessionScope.member.tel}</span><span></span>
			</div>
			<div>
				<a href="logout">로그아웃</a>
			</div>
		</c:if>
	<c:if test="${sessionScope.member ==null}">
		<div>
			<a href="login">로그인</a>
		</div>
	</c:if>
	</div>
</body>
</html>