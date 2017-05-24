<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<HTML>
<HEAD>
<meta http-equiv="Content-Language" content="zh-cn">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>公告查看</title>
<style type="text/css">
	*{
			margin: 0.5% auto  auto auto;
	}
	td{
		background-color: #E4EFF7;
	}
</style>
<script>
window.onload = function(){
	if("${msg}"!=""){
		alert("${msg}");
	}
}
</script>
</HEAD>
<body >
	<form action="AdvancedSearch?name=User" method="post">
			<table width="95%" border="0" cellspacing="1" cellpadding="0" >
				<tr >
					<td width="5%">&nbsp;</td>
					<td width="5%" style="font-size: 12;">员工工号：</td>
					<td><input type="text" name="uid" value=""/></td>
					<td width="5%" style="font-size: 12;">姓名：</td>
					<td><input type="text" name="uname" value=""/></td>
					<td width="5%" style="font-size: 12;">部门名称：</td>
					<td><input type="text" name="udepartname" value=""/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input type="submit" onclick="" value="检索"/></td>
				</tr>
			</table>
	</form>
	
</body>
</HTML>

