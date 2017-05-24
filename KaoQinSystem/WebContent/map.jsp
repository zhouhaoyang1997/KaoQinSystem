<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
	<style type="text/css">
		body, html{width: 100%;height: 100%;margin:0;font-family:"微软雅黑";font-size:14px;}
		#allmap {width:100%;height:500px;}
	</style>
    <link rel="stylesheet" href="http://cache.amap.com/lbs/static/main1119.css"/>
    <script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=您申请的key值"></script>
    <script type="text/javascript" src="http://cache.amap.com/lbs/static/addToolbar.js"></script>
    <script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=dX1BsdIWRgRZXSOqlBi8lGbwSA7rY1wf"></script>
    <script type="text/javascript">
/***************************************
由于Chrome、IOS10等已不再支持非安全域的浏览器定位请求，为保证定位成功率和精度，请尽快升级您的站点到HTTPS。
***************************************/
    var map, geolocation;
    //加载地图，调用浏览器定位服务
    map = new AMap.Map('container1', {
        resizeEnable: true
    });
    map.plugin('AMap.Geolocation', function() {
        geolocation = new AMap.Geolocation({
            enableHighAccuracy: true,//是否使用高精度定位，默认:true
            timeout: 10000,          //超过10秒后停止定位，默认：无穷大
            buttonOffset: new AMap.Pixel(10, 20),//定位按钮与设置的停靠位置的偏移量，默认：Pixel(10, 20)
            zoomToAccuracy: true,      //定位成功后调整地图视野范围使定位位置及精度范围视野内可见，默认：false
            buttonPosition:'RB'
        });
        map.addControl(geolocation);
        geolocation.getCurrentPosition();
        AMap.event.addListener(geolocation, 'complete', onComplete);//返回定位信息
        AMap.event.addListener(geolocation, 'error', onError);      //返回定位出错信息
    });
    //解析定位结果
    function onComplete(data) {
        x = data.position.getLng();
        y = data.position.getLat();
     //	alert(str)
        getAddr(x,y);
    }
</script>
<script type="text/javascript">
var xx ,yy;
	function getAddr(x,y){
//		alert(x);
	//alert(yy);
	// 百度地图API功能
	var map = new BMap.Map("allmap");
	var point = new BMap.Point(x+0.011510,y+0.004040);
	map.centerAndZoom(point,20);
	var geoc = new BMap.Geocoder();    

		var pt = point;
		geoc.getLocation(pt, function(rs){
			//alert(x+"\n"+y);
			
			var addComp = rs.addressComponents;
			var uAddr = addComp.province + ", " + addComp.city + ", " + addComp.district + ", " + addComp.street + ", " + addComp.streetNumber+"号";
			var answer = confirm("您的地址为："+uAddr);
			if(answer) //判断是否点击确定
				window.location ="SignIn?uid=${param.uid}&qiandao=签到&addr="+uAddr //确定的话游览器自身跳转
		});        
	}
	
</script>
</head>
<body >
<div id="allmap"></div>

</body>
</html>