<%--
  Created by IntelliJ IDEA.
  User: SONY
  Date: 05/08/2025
  Time: 1:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <title>creat home</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h3 class="text-center">Thêm phim mới</h3>
    <form action="/AddMovie" method="POST">
        <div class="mb-3">
            <h5 class="text-danger">${msg}</h5>
            <label for="tittle" class="form-label">Tiêu Đề</label>
            <input type="text" class="form-control" id="tittle" aria-describedby="tittleHelp" name="tittle" required>
            <div id="tittleHelp" class="form-text"></div>

        </div>
        <div class="mb-3">
            <label for="director" class="form-label">Tác Giả</label>
            <input type="text" class="form-control" id="director" aria-describedby="directorHelp" name="director" required>
            <div id="directorHelp" class="form-text"></div>
        </div>
        <div class="mb-3">
            <label for="genre" class="form-label">Thể Loại</label>
            <input type="text" class="form-control" id="genre" aria-describedby="genreHelp" name="genre" required>
            <div id="genreHelp" class="form-text"></div>
        </div>
        <div class="mb-3">
            <label for="duration" class="form-label">Thời gian (phút)</label>
            <input type="number" class="form-control" id="duration" aria-describedby="durationHelp" name="duration" required>
            <div id="durationHelp" class="form-text"></div>
        </div>
        <div class="mb-3">
            <label for="description" class="form-label">Mô tả</label>
            <textarea class="form-control" id="description" rows="3"></textarea>
        </div>
        <div class="mb-3">
            <label for="language" class="form-label">Ngôn ngữ</label>
            <input type="text" class="form-control" id="language" aria-describedby="languageHelp" name="language" required>
            <div id="language" class="form-text"></div>
        </div>
        <button type="submit" class="btn btn-primary">Thêm mới</button>
        <button type="reset" class="btn btn-secondary">Cancel</button>
    </form>
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
