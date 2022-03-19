<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
<script>
   $(function(){
      $("#upload").click(function(){
         const form =document.getElementById("uploadForm");
         const formData = new FormData(form);
         
         $.ajax("upload_ajax",{
        	 type:"POST",
            url:"upload_ajax",
            enctype:"multipart/form-data",
            data:formData,
            async:true,
            cache:false,
            contentType:false,
            processData:false,
            success:function(result){
               alert("업로드성공");
            },
            error:function(xhr,status,err){
               alert("업로드 실패:"+err);
            }
         
         });
      });
   });
</script>
</head>
<body>
<div>
   <h3>이미지 업로드 갤러리</h3>
   <div>
      <table border="1">
         <thead>
            <tr>
               <th>제목</th>
               <th>파일명</th>
               <th>관리</th>
            </tr>
         </thead>
         <tbody>
            <c:if test="${list.size()<1}">
               <tr><td>등록된 이미지가 없습니다</td></tr>
            </c:if>
            <c:forEach var="item" items="${list}">
            
            <tr>
               <td>${item.title}</td>
               <td><a href="upload/${item.filecode}" target="_blank">${item.filename}</a></td>
               <td><a href="delete/${item.filecode}">삭제</a></td>
            </tr>
            
            </c:forEach>
         </tbody>
      </table>   
   </div>
   <div>
      <form id = "uploadForm" action="upload" method="post" enctype="multipart/form-data">
         <div>
            <label>제목:</label>
            <input type="text" name="title">
         </div>
         <div>
            <label>첨부파일:</label>
            <input type="file" name="uploadFile">
         </div>
         <div>
            <button>[FORM]등록</button>
         </div>
      </form>
   </div>
   <hr>
   <div>
         <button id = "upload">[AJAX]등록</button>
   </div>
</div>   
</body>
</html>