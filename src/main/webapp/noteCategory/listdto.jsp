<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 20/2/2024
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container mt-6">
    <h2 style="color: blue">Danh sách ghi chú</h2>

    <table class="table">
        <thead>
        <tr>
            <th>id</th>
            <th>Tên thể loại</th>
            <th>Mô tả</th>
            <th>Tên ghi chú</th>
            <th>Nội dung</th>
            <th>Ngày ghi chú</th>
            <th>Sửa</th>
            <th>Xóa</th>
        </tr>
        </thead>
<c:forEach items="${dtoNoCaList}" var="dtoNoCaList">
    <tr>
        <td>${dtoNoCaList.id}</td>
        <td>${dtoNoCaList.nameCategory}</td>
        <td>${dtoNoCaList.descriptions}</td>
        <td>${dtoNoCaList.nameNote}</td>
        <td>${dtoNoCaList.content}</td>
        <td>${dtoNoCaList.dayNote}</td>
    </tr>
</c:forEach>
    </table>
</div>
</body>
</html>
