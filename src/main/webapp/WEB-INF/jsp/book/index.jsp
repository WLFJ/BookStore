<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Jekyll v4.0.1">
    <title>用户登陆</title>

    <link rel="canonical" href="https://v4.bootcss.com/docs/examples/floating-labels/">

    <!-- Bootstrap core CSS -->
<link href="/docs/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    <!-- Favicons -->
<link rel="apple-touch-icon" href="/docs/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
<link rel="icon" href="/docs/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
<link rel="icon" href="/docs/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
<link rel="manifest" href="/docs/assets/img/favicons/manifest.json">
<link rel="mask-icon" href="/docs/assets/img/favicons/safari-pinned-tab.svg" color="#563d7c">
<link rel="icon" href="/docs/assets/img/favicons/favicon.ico">
<meta name="msapplication-config" content="/docs/assets/img/favicons/browserconfig.xml">
<meta name="theme-color" content="#563d7c">


    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>
    <!-- Custom styles for this template -->
    <link href="floating-labels.css" rel="stylesheet">
  </head>
  <body>
<form class="form-signin" action="login" method="POST">
  <div class="text-center mb-4">
    <img class="mb-4" src="/docs/assets/brand/ss_blue_logo.jpg" alt="" width="120" height="120">
    <h1 class="h3 mb-3 font-weight-normal">图书馆用户登陆</h1>
  </div>

  <div class="form-label-group">
    <input type="text" id="inputEmail" name="username" class="form-control" placeholder="用户名" required autofocus>
    <label for="inputEmail">用户名</label>
  </div>

  <div class="form-label-group">
    <input type="text" id="inputPassword" name="password" class="form-control" placeholder="密码" required>
    <label for="inputPassword">密码</label>
  </div>

  <button class="btn btn-lg btn-primary btn-block" type="submit">登陆</button>
  <p class="mt-5 mb-3 text-muted text-center">中北大学-软件学院</p>

</form>
</body>
</html>