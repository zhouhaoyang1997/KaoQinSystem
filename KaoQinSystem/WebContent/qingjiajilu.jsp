<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script>
window.onload = function(){
	var d = new Date();
	var str = d.getFullYear()+"-"+(d.getMonth()+1)+"-"+d.getDate();
            document.getElementById("Clock").value=str;
}
</script>
<title>公告查看</title>
<style type="text/css">
	.main td{
		background-color: #E4EFF7;
	}
</style>
</HEAD>
<body >
	<table width="100%" border="0" cellspacing="5" class="main" >
		<tr>
			<td align="center" style="font-family: '楷体';font-size:30;">请假记录</td>
		</tr>
		<c:forEach items="${gonggao}" var="i">
		<tr>
			<td align="center" style="font-family: '楷体';font-size:30;"></td>
			<td class="Clock"></td>
		</tr>	
		</c:forEach>
	</table>
</body>
</HTML>

