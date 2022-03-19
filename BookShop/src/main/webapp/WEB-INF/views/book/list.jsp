<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<jsp:include page="../include/header.jsp"></jsp:include>
</head>
<body>
      <div>
      <table border="1" class="table table-sm" >
          <thead class="table-dark">
            <tr>
               <td>도서번호</td>
               <td>도서명</td>
               <td>출판사</td>
               <td>가격</td>
               <td>관리</td>
            </tr>
         </thead>
        	<tbody>
				<c:forEach var="item" items="${list}">
					<tr>
						<td>${item.bookid}</td>
						<td>${item.bookname}</td>
						<td>${item.publisher}</td>
						<td><fmt:formatNumber value="${item.price}"></fmt:formatNumber> </td>
						<td><a href="delete/${item.bookid}" class="btn btn-sm btn-danger">삭제</a> 
						<a href="update/${item.bookid}" class="btn btn-sm btn-warning">변경</a></td>
					</tr>
				</c:forEach>
				<c:if test="${list.size() < 1}">
					<tr>
						<td colspan="5">등록 된 제품이 없습니다</td>
					</tr>
				</c:if>
			</tbody>
			
         
      </table>
   </div>
<div>
   <a href="add" class="btn btn-sm btn-primary">등록</a>
   <a href=".." class="btn btn-sm btn-primary">이전메뉴</a>
</div>
<jsp:include page="../include/body.jsp"></jsp:include>
</body>
</html>