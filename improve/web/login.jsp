<%--
  Created by IntelliJ IDEA.
  User: 18235
  Date: 2022/11/4
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>用户登录</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://code.jquery.com/jquery-3.6.1.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style>
    .main {
      height: 650.15px;
      width: 1519.2px;
      background-image: url("https://lining-store-online-1302115263.file.myqcloud.com/icon/login/login-bg.png");
      background-size: 1519.2px 828.15px;
      margin: 0 auto;
    }

    .Login {
      background-color: #fff;
      display: block;
      float: right;
      width: 400px;
      height: 280px;
      margin-top: 5%;
      margin-right: 15%;
      border-radius: 10px;
      text-align: center;
    }

    .right {
      padding: 10px;
      padding-top: 20px;
      display: inline-block;
      width: 80%;
      text-decoration: none;
      color: #ff3333;
      font-weight: 600;
      border-bottom: 3px solid gray;
    }

    .rightform input {
      width: 80%;
      height: 30px;
      margin: 20px 0 5px 0;
    }

    .rightform button {
      margin: 15px 5px 20px 5px;
    }

    .Login a {
      text-decoration: none;
      color: black;
      font-weight: 600;
    }
  </style>
</head>

<body>

<nav class="navbar navbar-default" role="navigation" style="text-align:center ;padding: 3px;height: 50px;margin-bottom: 0px;">
  <!-- Brand and toggle get grouped for better mobile display -->
  <div class="navbar-header" style="display: flex;align-items: center;">
    <img style="width: 90px;height: 44px;margin-left: 10px;" src="data:image/png;base64,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">
  </div>
  <div class="collapse navbar-collapse navbar-ex1-collapse">
    <ul class="nav navbar-nav">
      <li class="active"><a href="javascript:;" style="border-radius: 4px;padding: 11px;margin-left: 10px;">李宁官方网站</a></li>
      <li><a style="padding: 11px;">欢迎登录</a></li>
    </ul>


    <!-- /.navbar-collapse -->
</nav>
<div class="main">
  <div class="Login">
    <div class="right" style="align-items: center;"><a href="javascript:;">手机号登录</a></div>
    <form action="index.html" method="post" class="rightform">
      <input type="text" name="userphone" placeholder="请输入手机号"><br>
      <input type="text" name="password" placeholder="请输入密码"><br>
      <button type="submit" class="btn btn-success">登录</button><button type="submit" class="btn btn-success" onclick="form.action='register.html'">注册</button>
    </form>
    <a href="javascript:;" style="color: #4d6ab3;font-weight:400;">忘记密码？点击修改密码</a>
  </div>
</div>

</body>

</html>