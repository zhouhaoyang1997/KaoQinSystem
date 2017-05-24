<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>考勤系统</title>
<head>
<script type="text/javascript">
var win = null;
function NewWindow(mypage,myname,w,h,scroll){
LeftPosition = (screen.width) ? (screen.width-w)/2 : 0;
TopPosition = (screen.height) ? (screen.height-h)/2 : 0;
settings =
'height='+h+',width='+w+',top='+TopPosition+',left='+LeftPosition+',scrollbars='+scroll+',resizable'
win = window.open(mypage,myname,settings)
}
</script>
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
      <dt>个人中心<img src="images/select_xl01.png"></dt>
      <dd class="first_dd"><a href="${pageContext.request.contextPath}/myAccount.jsp" target="mainFrame">个人信息</a></dd>
      <dd><a href="${pageContext.request.contextPath}/xinxixiugai.jsp" target="mainFrame">信息修改</a></dd>
      <dd><a href="${pageContext.request.contextPath}/mimaxiugai.jsp" target="mainFrame">密码修改</a></dd>
    </dl>
    <dl class="">
      <dt>考勤管理<img src="images/select_xl01.png"></dt>
      
      <dd class="first_dd"><a href="qiandao.jsp" onclick="NewWindow(this.href,'opwd','400','300','no','center');return false" onfocus="this.blur()">签到</a></dd>
      <dd><a href="qiantui.jsp" onclick="NewWindow(this.href,'opwd','400','300','no','center');return false" onfocus="this.blur()">签退</a></dd>
      <dd><a href="${pageContext.request.contextPath}/GetSignServlet" target="mainFrame">考勤记录</a></dd>
      <dd><a href="${pageContext.request.contextPath}/GetKaoQinServlet" target="mainFrame">考勤制度</a></dd>
    </dl>
    <dl class="">
      <dt>请假管理<img src="images/select_xl01.png"></dt>
      <dd class="first_dd"><a href="${pageContext.request.contextPath}/shenqingjiaqi.jsp"  target="mainFrame">请假申请</a></dd>
      <dd><a href="${pageContext.request.contextPath}/GetDayOffServlet"  target="mainFrame">销假操作</a></dd>
    </dl>
    <dl class="">
      <dt>加班管理<img src="images/select_xl01.png"></dt>
      <dd><a href="${pageContext.request.contextPath}/GetJiaBanServlet"  target="mainFrame">加班记录</a></dd>
    </dl>
    <dl class="">
      <dt>部门管理<img src="images/select_xl01.png"></dt>
      <dd class="first_dd"><a href="${pageContext.request.contextPath}/bumenxinxi.jsp"  target="mainFrame">部门信息</a></dd>
      <dd class="first_dd"><a href="${pageContext.request.contextPath}/GetAllGongGao"  target="mainFrame">部门公告</a></dd>
    </dl>
    <dl class="">
      <dt>出差管理<img src="images/select_xl01.png"></dt>
      <dd class="first_dd"><a href="${pageContext.request.contextPath}/shenqingchuchai.jsp"  target="mainFrame">出差申请</a></dd>
      <dd><a href="${pageContext.request.contextPath}/GetChuChaiServlet"  target="mainFrame">出差查询</a></dd>
    </dl>
    <dl class="">
      <dt>报表管理<img src="images/select_xl01.png"></dt>
      <dd class="first_dd"><a href="${pageContext.request.contextPath}/chuqinlist.jsp"  target="mainFrame">出勤统计</a></dd>
      <dd><a href="${pageContext.request.contextPath}/baobiaodaochu.jsp" target="mainFrame">报表导出</a></dd>
    </dl>
  </div>
</div>
<script src="js/jquery.min.js"></script>
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