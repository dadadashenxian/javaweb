<%--
  Created by IntelliJ IDEA.
  User: 18235
  Date: 2022/11/4
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link href="css/bootstrap.min.css">
  <script src="js/jquery.js"></script>
  <script src="js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
      <span class="sr-only">Toggle navigation</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="#">李宁</a>
  </div>
  <div class="collapse navbar-collapse navbar-ex1-collapse">
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">所有分类</a></li>
      <li><a href="#">鞋子</a></li>
    </ul>

    <ul class="nav navbar-nav navbar-right" style="visibility: hidden;">
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">个人中心<b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a href="#">我的信息</a></li>
          <li><a href="#">我的购物车</a></li>
          <li><a href="#">我的订单</a></li>
          <li><a href="#">余额</a></li>
        </ul>
      </li>
    </ul>
    <form class="navbar-form navbar-left" role="search" action="" method="get" style="float: right;">
      <button type="submit" class="btn btn-default">点击登录</button>
    </form>
  </div>
</nav>

<div id="carousel-id" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carousel-id" data-slide-to="0" class=""></li>
    <li data-target="#carousel-id" data-slide-to="1" class=""></li>
    <li data-target="#carousel-id" data-slide-to="2" class=""></li>
    <li data-target="#carousel-id" data-slide-to="3" class=""></li>
    <li data-target="#carousel-id" data-slide-to="4" class=""></li>
    <li data-target="#carousel-id" data-slide-to="5" class=""></li>
    <li data-target="#carousel-id" data-slide-to="6" class=""></li>
    <li data-target="#carousel-id" data-slide-to="7" class=""></li>
  </ol>
  <div class="carousel-inner">
    <div class="item"><img src='https://mlining-1302115263.file.myqcloud.com/postsystem/docroot/images/cps/zyx/20221031/Badfive-opposite-direction-pc_kv.jpg'></div>
    <div class="item"><img src='https://mlining-1302115263.file.myqcloud.com/postsystem/docroot/images/cps/zyx/20221024/classic-series-pc_kv.jpg'></div>
    <div class="item"><img src='https://mlining-1302115263.file.myqcloud.com/postsystem/docroot/images/cps/zyx/20221018/cealess-happiness-pc_kv.jpg'></div>
    <div class="item"><img src='https://mlining-1302115263.file.myqcloud.com/postsystem/docroot/images/cps/zyx/20221018/Thermal-down-jacket-pc_kv.jpg'></div>
    <div class="item"><img src='https://mlining-1302115263.file.myqcloud.com/postsystem/docroot/images/cps/zyx/20221031/Double-11-started1-pc4_01.gif'></div>
    <div class="item"><img src='https://mlining-1302115263.file.myqcloud.com/postsystem/docroot/images/cps/zyx/20221028/yushuai14-hufu_jh.jpg'></div>
    <div class="item"><img src='https://mlining-1302115263.file.myqcloud.com/postsystem/docroot/images/cps/zyx/20221028/liren2_kv.jpg'></div>
    <div class="item active"><img src='https://mlining-1302115263.file.myqcloud.com/postsystem/docroot/images/cps/zyx/20221031/wade-xunyicao_kv.jpg'></div>
  </div>
  <a class="left carousel-control" href="#carousel-id" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
  <a class="right carousel-control" href="#carousel-id" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
</div>

</body>

</html>