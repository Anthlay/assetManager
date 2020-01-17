<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.whut.beans.userInfo" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>个人中心</title>
  <link rel="stylesheet" type="text/css" href="../res/static/css/main.css">
  <link rel="stylesheet" type="text/css" href="../res/layui/css/layui.css">
  <script type="text/javascript" src="../res/layui/layui.js"></script>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">


  <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
  
  
  
      <style>

	  #login_click{ margin-top:32px; height:40px;}
	  #login_click a {         
	  text-decoration:none;
	  	background:#cccccc;	
		color:#ffffff;		
		padding: 10px 30px 10px 30px;	
		font-size:16px;	font-family: 微软雅黑,宋体,Arial,Helvetica,Verdana,sans-serif;	
		font-weight:bold;	
		border-radius:3px;		
		-webkit-transition:all linear 0.30s;	
		-moz-transition:all linear 0.30s;	
		transition:all linear 0.30s;		
		}  
	   #login_click a:hover { 
	   background:#eee5de; }
	   </style>
  
  
  
  
</head>

<body id="list-cont" background="../res/static/img/load_bg.jpg" >
  <div class="site-nav-bg">
    <div class="site-nav w1200">
      <p class="sn-back-home">
        <i class="layui-icon layui-icon-home"></i>
        <a href="${pageContext.request.contextPath}/toSuccess.do">首页</a>
      </p>
      </div>
  </div>


  <div class="content">
    <div class="main-nav">
      <div class="inner-cont0">
        <div class="inner-cont1 w1200">
          <div class="inner-cont2">
            <a class="active" href="${pageContext.request.contextPath}/toClient.do">个人信息</a>
            <a href="${pageContext.request.contextPath}/getUserOrder.do" >个人订单</a>
            <a href="${pageContext.request.contextPath}/getUserCost.do">交易记录</a>
              <a href="${pageContext.request.contextPath}/toSuccess.do">返回主页</a>
          </div>

        </div>
      </div>
    </div>
      <div class="col-md-3 column"  style=" margin-top: 100px; margin-left: 40%; left: -80px" >
      <form action="${pageContext.request.contextPath}/updateUser.do" method="post" >
          <table class="table table-hover  text-nowrap" align="center">
              <tr >
                  <th>ID：</th>
                  <th>${userInfo.userId}</th>
                  <input type="hidden" name="userId" value="${userInfo.userId}">
              </tr>
              <tr>
                  <th>用户名：</th>
                  <th><input type="text"  name="userName" value=${userInfo.userName}></th>
              </tr>
              <tr>
                  <th>密  码：</th>
                  <th><input type="password" name="passWord" value=${userInfo.passWord}></th>
              </tr>
              <tr>
                  <th>电  话：</th>
                  <th><input type="text" name="phone" value=${userInfo.phone}></th>
              </tr>
              <tr>
                  <th>地  址：</th>
                  <th><input type="text" name="address" value=${userInfo.address}></th>
              </tr>
              <tr>
                  <th>会员标识：</th>
                  <th>${userInfo.isMember}</th>
              </tr>
              <tr>
                  <th>账户余额：</th>
                  <th>${userInfo.account}</th>
              </tr>
              <tr>
                  <th>
                <input type="submit" value="修改信息" class="btn btn-primary" >
                  </th>
              </tr>
          </table>
      </form>
      </div>
  </div>
</body>
</html>