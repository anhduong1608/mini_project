<%--
  Created by IntelliJ IDEA.
  User: SONY
  Date: 05/08/2025
  Time: 11:43 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<%--<%--%>
<%--    application.getAttribute("movielist");--%>
<%--%>--%>
<div class="container">
    <h1>List movie</h1>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">No</th>
            <th scope="col">ID</th>
            <th scope="col">Tiêu Đề</th>
            <th scope="col">Đạo diễn</th>
            <th scope="col">Thể Loại</th>
            <th scope="col">Thời lượng</th>
            <th scope="col">Ngôn Ngữ</th>
            <th scope="col">Hành Động</th>
        </tr>
        </thead>
        <tbody>
      <c:forEach items="${movies}" var="movie" varStatus="loop">
          <tr>
              <th scope="row">${loop.index + 1}</th>
              <td>${movie.id}</td>
              <td>${movie.title}</td>
              <td>${movie.director}</td>
              <td>${movie.genre}</td>
              <td>${movie.duration}</td>
              <td>${movie.language}</td>
              <td>
                  <a href="<%=request.getContextPath()%>/update?action=updateHome&id=${movie.id}" class="btn btn-primary">update</a>
                  <a href="<%=request.getContextPath()%>/update?action=delete&id=${movie.id}" class="btn btn-danger">delete</a>
              </td>
          </tr>
      </c:forEach>
        </tbody>
    </table>
    <a href="movie/addHome.jsp" class="btn btn-success">add new movie</a>
</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>