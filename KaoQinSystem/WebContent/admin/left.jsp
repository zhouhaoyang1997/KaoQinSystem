<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<meta charset="UTF-8">
<title>考勤系统</title>
<head>
<style>
body{margin:0;padding:0;overflow-x:hidden;}
html, body{height:100%;}
img{border:none;}
*{font-family:'微软雅黑';font-size:12px;color:#626262;}
dl,dt,dd{display:block;margin:0;}
a{text-decoration:none;}

.container{width:100%;height:100%;margin:auto;}
.leftsidebar_box{width:160px;height:auto !important;overflow:visible !important;position:fixed;height:100% !important;background-color:#3992d0;}
.line{height:2px;width:100%;background-image:url(images/line_bg.png);background-repeat:repeat-x;}
.leftsidebar_box dt{padding-left:40px;padding-right:10px;background-repeat:no-repeat;background-position:10px center;color:#f5f5f5;font-size:14px;position:relative;line-height:48px;cursor:pointer;}
.leftsidebar_box dd{background-color:#317eb4;padding-left:40px;}
.leftsidebar_box dd a{color:#f5f5f5;line-height:20px;}
.leftsidebar_box dt img{position:absolute;right:10px;top:20px;}
.system_log dt{background-image:url(images/system.png)}
.custom dt{background-image:url(images/custom.png)}
.channel dt{background-image:url(images/channel.png)}
.app dt{background-image:url(images/app.png)}
.cloud dt{background-image:url(images/cloud.png)}
.syetem_management dt{background-image:url(images/syetem_management.png)}
.source dt{background-image:url(images/source.png)}
.statistics dt{background-image:url(images/statistics.png)}
.leftsidebar_box dl dd:last-child{padding-bottom:10px;}
</style>
</head>
<body>

<!-- 代码部分begin -->
<div class="container">
  <div class="leftsidebar_box">
    <div class="line"></div>
    <dl class="">
      <dt>公告管理<img src="images/select_xl01.png"></dt>
      <dd class="first_dd"><a href="${pageContext.request.contextPath}/admin/gonggaofabu.jsp" target="mainFrame">公告发布</a></dd>
      <dd><a href="${pageContext.request.contextPath}/GetAllGongGao" target="mainFrame">公告删除</a></dd>
    </dl>
    <dl class="">
      <dt>员工管理<img src="images/select_xl01.png"></dt>
      <dd class="first_dd"><a href="${pageContext.request.contextPath}/GetAllUser" target="mainFrame">员工信息查询</a></dd>
      <dd><a href="${pageContext.request.contextPath}/admin/xinxixiugai.jsp" target="mainFrame">员工信息修改</a></dd>
    </dl>
    <dl class="">
      <dt>考勤管理<img src="images/select_xl01.png"></dt>
      <dd class="first_dd"><a href="${pageContext.request.contextPath}/admin/kaoqinfabu.jsp"  target="mainFrame">考勤制度发布</a></dd>
      <dd><a href="${pageContext.request.contextPath}/GetAllDayOffServlet"  target="mainFrame">员工请假记录</a></dd>
      <dd><a href="${pageContext.request.contextPath}/GetAllChuChaiServlet"  target="mainFrame">员工出差记录</a></dd>
      <dd><a href="${pageContext.request.contextPath}/GetAllJiaBanServlet"  target="mainFrame">员工加班记录</a></dd>
      <dd><a href="${pageContext.request.contextPath}/baobiaodaochu.jsp"  target="mainFrame">导出出勤记录</a></dd>
    
    </dl>
    <dl class="">
      <dt>请假审批<img src="images/select_xl01.png"></dt>
      <dd class="first_dd"><a href="${pageContext.request.contextPath}/DafOffJudge"  target="mainFrame">请假审批</a></dd>
    </dl>
    <dl class="">
      <dt>部门管理<img src="images/select_xl01.png"></dt>
      <dd class="first_dd"><a href="${pageContext.request.contextPath}/GetAllDepartServlet"  target="mainFrame">部门信息</a></dd>
      <dd class="first_dd"><a href="${pageContext.request.contextPath}/bumenxiugai.jsp"  target="mainFrame">信息修改</a></dd>
    </dl>
    <dl class="">
      <dt>权限管理<img src="images/select_xl01.png"></dt>
      <dd class="first_dd"><a href="${pageContext.request.contextPath}/userlist.jsp"  target="mainFrame">权限分配</a></dd>
    </dl>
    
  </div>
</div>
<script src="../js/jquery.min.js"></script>
<script>
$(function(){
	$(".leftsidebar_box dt").css({"background-color":"#3992d0"});
	$(".leftsidebar_box dt img").attr("src","images/select_xl01.png");
	$(".leftsidebar_box dd").hide();
	$(".leftsidebar_box dt").click(function(){
		$(".leftsidebar_box dt").css({"background-color":"#3992d0"})
		$(this).css({"background-color": "#317eb4"});
		$(this).parent().find('dd').removeClass("menu_chioce");
		$(".leftsidebar_box dt img").attr("src","images/select_xl01.png");
		$(this).parent().find('img').attr("src","images/select_xl.png");
		$(".menu_chioce").slideUp(); 
		$(this).parent().find('dd').slideToggle();
		$(this).parent().find('dd').addClass("menu_chioce");
	});
})
</script>
<!-- 代码部分end -->

</body>
</html>