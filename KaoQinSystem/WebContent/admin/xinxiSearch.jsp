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
<script>
window.onload = function(){
	if("${msg}"!=""){
		alert("${msg}");
	}
}
</script>
</style>
</HEAD>
<body >
	<form action="${pageContext.request.contextPath}\UserAdvancedSearch?methon=search" method="post">
			<table width="95%" border="0" cellspacing="0" cellpadding="0" >
				<tr >
					<td width="2%">&nbsp;</td>
					<td width="12%" style="font-size: 12;">员工工号：</td>
					<td><input type="text" name="uid" value=""/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td width="5%" style="font-size: 12;">部门：</td>
					<td><input type="text" name="udepartname" value=""/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td width="5%" style="font-size: 12;">姓名：</td>
					<td><input type="text" name="uname" value=""/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input type="submit" onclick="" value="查询"/></td>
					<td width="70%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td width="5%"><input type="button" onclick="javascrtpt:window.location.href='admin/newuser.jsp'" value="新增"/></td>
				</tr>
			</table>
	</form>
	<jsp:include page="userlist.jsp"></jsp:include>
</body>
</HTML>

