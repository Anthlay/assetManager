<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>宠物商城</title>
    <link rel="stylesheet" type="text/css" href="../res/static/css/main.css">
    <link rel="stylesheet" type="text/css" href="../res/layui/css/layui.css">
    <script type="text/javascript" src="../res/layui/layui.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">
</head>
<body>

<div class="site-nav-bg">
    <div class="site-nav w1200">
        <p class="sn-back-home">
            <i class="layui-icon layui-icon-home"></i>
            <a href="#">首页</a>
        </p>
        <div class="sn-quick-menu">
            <div class="login"><a href="../index.jsp">登录</a></div>
            <div class="login"><a href="register.jsp">注册</a></div>
         </div>
    </div>
</div>



<div class="header">
    <div class="headerLayout w1200">
        <div class="headerCon">
            <h1 class="mallLogo">
                <a href="#" title="宠物商城">
                    <img src="../res/static/img/logo.png">
                </a>
            </h1>
            <div class="mallSearch">
                <form action="${pageContext.request.contextPath}/pet/findByName.do" method="post" >
                    <input type="text"  name="goodsName" required  lay-verify="required" autocomplete="on" class="layui-input" placeholder="请输入需要的商品">
                    <button class="layui-btn" lay-submit lay-filter="formDemo">
                        <i class="layui-icon layui-icon-search"></i>
                    </button>
                </form>
            </div>
        </div>
    </div>
</div>


<div class="content content-nav-base  login-content">
    <div class="main-nav">
        <div class="inner-cont0">
            <div class="inner-cont1 w1200">
                <div class="inner-cont2">
                    <a href="${pageContext.request.contextPath}/pet/petShop.do" class="active">宠物推荐</a>
                    <a href="${pageContext.request.contextPath}/goodShop.do">商品推荐</a>
                    <a href="${pageContext.request.contextPath}/jsp/information.jsp">宠物资讯</a>
                    <a href="${pageContext.request.contextPath}/jsp/about.jsp">关于我们</a>
                </div>
            </div>
        </div>
    </div>
    <div class="login-bg">
        <div class="login-cont w1200">
            <div class="form-box">
                <form class="layui-form" action="${pageContext.request.contextPath}/register.do" method="post">
                    <legend>用户注册</legend>
                    <div class="layui-form-item">
                        <div class="layui-inline iphone">
                            <div class="layui-input-inline"style="height: 15px">
                                <input style="padding: 10px 10px 10px;position: relative;height: 30px;"type="text" name="userName"  placeholder="请输入用户名" class="layui-input">
                            </div>
                        </div>
                        <div class="layui-inline veri-code">
                            <div class="layui-input-inline">
                                <input style="padding: 10px 10px 10px;position: relative;height: 30px"type="text" name="phone"   placeholder="请输入号码" autocomplete="off" class="layui-input">
                                </P>
                            </div>
                        </div>
                        <div class="layui-form-item layui-form-text">
                            <div class="layui-input-inline"style="height: 30px">
                                <input style="padding: 10px 10px 10px;position: relative; height: 40px"type="text" name="address"   placeholder="请输入地址信息" autocomplete="off" class="layui-input">
                                </P>
                            </div>
                        </div>
                        <div class="layui-inline veri-code">
                            <div class="layui-input-inline"style="height: 15px">
                                <input style="padding: 10px 10px 10px; position: relative;height: 30px"type="password" name="passWord"  placeholder="请输入密码" autocomplete="off" class="layui-input">
                                </P>
                            </div>
                        </div>

                    <div class="layui-form-item login-btn">
                        <div class="layui-input-block">
                            <button style="top: auto; "class="layui-btn layui-btn-normal" lay-submit="" lay-filter="demo2" type="submit" id="register">注册</button>
                            </P>
                        </div>
                    </div>
                    </div>
                </form>
                </div>
        </div>
    </div>
</div>
<
            </div>




<div class="footer">
    <div class="ng-promise-box">
        <div class="ng-promise w1200">
            <p class="text">
                <a class="icon1" href="javascript:;">7天无理由退换货</a>
                <a class="icon2" href="javascript:;">所有宠物用品满99元全场免邮</a>
                <a class="icon3" style="margin-right: 0" href="javascript:;">100%安全品质保证</a>
            </p>
        </div>
    </div>
    <div class="mod_help w1200">
        <p>
            <a href="javascript:;">关于我们</a>
            <span>|</span>
            <a href="javascript:;">帮助中心</a>
            <span>|</span>
            <a href="javascript:;">售后服务</a>
            <span>|</span>
            <a href="javascript:;">母婴资讯</a>
            <span>|</span>
            <a href="javascript:;">关于货源</a>
        </p>
    </div>
</div>
<script type="text/javascript">
    $("#register").click(function() {
        alert("注册成功")
    }
    layui.config({
        base: '../res/static/js/util' //你存放新模块的目录，注意，不是layui的模块目录
    }).use(['jquery','form'],function(){
        var $ = layui.$,form = layui.form;


        $("#find").click(function() {
            if(!/^1\d{10}$/.test($("#password").val())){
                layer.msg("请输入正确的密码");
                return false;
            }
            var obj=this;
            $.ajax({
                type:"get",
                url:"../json/login.json",
                dataType:"json",//返回的
                success:function(data) {

                    if(data.result){
                        $("#find").addClass(" layui-btn-disabled");
                        $('#find').attr('disabled',"true");
                        settime(obj);
                        $("#msg").text(data.msg);
                    }else{
                        layer.msg(data.msg);
                    }
                },
                error:function(msg) {
                    console.log(msg);
                }
            });
        })
        var countdown=60;
        function settime(obj) {
            if (countdown == 0) {
                obj.removeAttribute("disabled");
                obj.classList.remove("layui-btn-disabled")
                obj.value="获取验证码";
                countdown = 60;
                return;
            } else {

                obj.value="重新发送(" + countdown + ")";
                countdown--;
            }
            setTimeout(function() {
                    settime(obj) }
                ,1000)
        }
    })

</script>

</body>
</html>