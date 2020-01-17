<%--
  Created by IntelliJ IDEA.
  User: D_ASSUE
  Date: 2020/1/4
  Time: 1:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>宠物商店-管理员-商品管理</title>
    <link rel="stylesheet" type="text/css" href="../res/static/css/main.css">
    <link rel="stylesheet" type="text/css" href="../res/layui/css/layui.css">
    <script type="text/javascript" src="../res/layui/layui.js"></script>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
</head>
<body id="list-cont" background="../res/static/img/load_bg.jpg">
<div class="site-nav-bg">
    <div class="site-nav w1200">
        <p class="sn-back-home">
            <i class="layui-icon layui-icon-home"></i>
            <a href="../index.jsp">注销</a>
        </p>
    </div>
</div>



<div class="content content-nav-base commodity-content">

    <div class="commod-cont-wrap">
        <div class="commod-cont w1200 layui-clear">
            <div class="left-nav">
                <div class="title">欢迎使用</div>
                <div class="list-box">

                    <dl>
                        <dt>系统功能</dt>
                        <dd><a href="${pageContext.request.contextPath}/asset/fillAllAsset.do">固定资产管理</a></dd>
                        <dd><a href="${pageContext.request.contextPath}/pet/findAll.do">操作员管理</a></dd>
                    </dl>

                    <dl>
                        <dt>菜单2</dt>
                        <dd><a href="javascript:;">功能1</a></dd>
                        <dd><a href="javascript:;">功能2</a></dd>
                    </dl>

                </div>
            </div>
            <div class="right-cont-wrap">
                <div class="right-cont">
                    <div class="itemInfo">
                        <div class="title">
                            <div class="container">
                                <div class="row clearfix">
                                    <div class="col-md-12 column">
                                    </div>
                                </div>

                                <div class="row clearfix">
                                    <div class="col-md-12 column">
                                        <div class="page-header">
                                            <h1>
                                                <small>固定资产列表</small>
                                            </h1>
                                        </div>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="row">
                                        <div class="col-md-4 column">
                                            <a class="btn btn-primary" href="${pageContext.request.contextPath}/asset/toupdateAsset.do">新增</a>
                                        </div>
                                    </div>
                                    <!-- 搜索  -->
                                    <div class="tools" id="search" style="width: 80%; display:inline-block;vertical-align: top;">
                                        <ul class="searchform">       
                                            <li>
                                                <form action="${pageContext.request.contextPath}/Operater/findAll.do"
                                                      method="post">
                                                    <input type="text" name="goodsName" placeholder="根据操作员名字查询"
                                                           style="border: 1px solid #E6E6E6;;height:28px;width:120px;">
                                                    <button class="layui-btn layui-btn-sm"><i class="layui-icon">&#xa163;</i>
                                                        搜索</button>
                                                </form>
                                            </li> 
                                        </ul>
                                    </div>
                                    <div class="row clearfix">
                                        <div class="col-md-12 column">
                                            <table class="table table-hover table-striped text-nowrap">
                                                <thead>
                                                <tr>
                                                    <th>操作员编号</th>
                                                    <th>操作员名称</th>
                                                    <th>所属公司</th>
                                                    <th>所属部门</th>
                                                    <th>操作</th>

                                                </tr>
                                                </thead>
                                                <tbody>
                                                <c:forEach items="${pageInfo.list}" var="pageInfo">
                                                    <tr>
                                                        <td>${pageInfo.operatorId}</td>
                                                        <td>${pageInfo.operatorName}</td>
                                                        <td>${pageInfo.company}</td>
                                                        <td>${pageInfo.department}</td>
                                                        <td>
                                                            <a href="${pageContext.request.contextPath}/pet/toUpdate.do?id=${pet.petId}">更改</a> |
                                                            <a href="${pageContext.request.contextPath}/pet/delete.do?petId=${pet.petId}">删除</a>
                                                        </td>

                                                    </tr>
                                                </c:forEach>
                                                </tbody>
                                            </table>
                                        </div>
                                        <div class="box-tools pull-left">
                                            <ul class="pagination">
                                                <li>
                                                    <a href="${pageContext.request.contextPath}/operator/findAll.do?page=1&size=5"
                                                       aria-label="Previous">首页</a></li>
                                                <li>
                                                    <a href="${pageContext.request.contextPath}/operator/findAll.do?page=${pageInfo.pageNum-1}&size=5">上一页</a>
                                                </li>
                                                <c:forEach begin="1" end="${pageInfo.pages}" var="pageNum">
                                                    <li>
                                                        <a href="${pageContext.request.contextPath}/operator/findAll.do?page=${pageNum}&size=5">${pageNum}</a>
                                                    </li>
                                                </c:forEach>
                                                <li>
                                                    <a href="${pageContext.request.contextPath}/operator/findAll.do?page=${pageInfo.pageNum+1}&size=5">下一页</a>
                                                </li>
                                                <li>
                                                    <a href="${pageContext.request.contextPath}/operator/findAll.do?page=${pageInfo.pages}&size=5"
                                                       aria-label="Next">尾页</a></li>
                                            </ul>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>


