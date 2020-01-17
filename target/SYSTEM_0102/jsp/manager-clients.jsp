<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <script type="text/javascript" src="../res/layui/layui.js"></script>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="../res/static/css/main.css">
    <link rel="stylesheet" type="text/css" href="../res/layui/css/layui.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">


    <style type="text/css">
        search{
            float:right;
            margin:0px;
            display:none;
        }
    </style>
</head>
<body>




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
                        <dd><a href="${pageContext.request.contextPath}/fillAllGood.do">商品管理</a></dd>
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
                        <div >
                            <div class="row">


                                <!-- 搜索  -->
                                <div class="tools"  id="search" style="width: 80%; display:inline-block;vertical-align: top;">
                                    <ul class="searchform">       
                                        <li>
                                            <form action="${pageContext.request.contextPath}/pet/findPetByName.do" method="post">
                                                <input type="text" name="petName" placeholder="根据关键字查询" style="border: 1px solid #E6E6E6;;height:28px;width:120px;">
                                                <button class="layui-btn layui-btn-sm"><i class="layui-icon">&#xa163;</i> 搜索</button>
                                            </form>
                                        </li>
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


<script>

    layui.config({
        base: '../res/static/js/util/' //你存放新模块的目录，注意，不是layui的模块目录
    }).use(['mm','jquery'],function(){
        var mm = layui.mm,$ = layui.$;
        var cur = $('.number-cont input').val();
        $('.number-cont .btn').on('click',function(){
            if($(this).hasClass('add')){
                cur++;

            }else{
                if(cur > 1){
                    cur--;
                }
            }
            $('.number-cont input').val(cur)
        })

    });


    layui.config({
        base: '../res/static/js/util/' //你存放新模块的目录，注意，不是layui的模块目录
    }).use(['mm','laypage','jquery'],function(){
        var laypage = layui.laypage,$ = layui.$,
            mm = layui.mm;
        laypage.render({
            elem: 'demo0'
            ,count: 100 //数据总数
        });
        $('.sort a').on('click',function(){
            $(this).addClass('active').siblings().removeClass('active');
        })
        $('.list-box dt').on('click',function(){
            if($(this).attr('off')){
                $(this).removeClass('active').siblings('dd').show()
                $(this).attr('off','')
            }else{
                $(this).addClass('active').siblings('dd').hide()
                $(this).attr('off',true)
            }
        })

    });



</script>


</body>
</html>