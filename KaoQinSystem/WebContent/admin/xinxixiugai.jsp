<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	
<title>申请出差</title>
<style type="text/css">
	.main{
		margin: 2% auto  auto 2%;
		background-color: 
	}
	.upline td{
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
</head>

<body class="main">
	<div id="divpagecontent">
			<form action="${pageContext.request.contextPath}/UserSearch?methon=change" method="post">
			<table width="95%" border="0" cellspacing="0" cellpadding="0" >
				<tr >
					<td width="5%">&nbsp;</td>
					<td width="5%" style="font-size: 12;">员工工号：</td>
					<td><input type="text" name="uid" value=""/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input type="submit" onclick="" value="查询"/></td>
					<td width="70%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				</tr>
			</table>
	</form>
								<form action="${pageContext.request.contextPath}/UpdateServlet?role=admin" method="post">
					
									<table width="100%" border="0" cellspacing="5" class="upline"  >
										<tr>
											<td colspan="4" height="80" style="font-size: 50; font-family: '楷体';;"align="center"><p style="margin-left: -15%;">员工信息修改</p></td>
										</tr>
										<tr height="34">
											<td style="text-align:center; width:25%">姓名：</td>
											<td style="width:20%; padding-left:20px"><input type="text" name="uname" id="name" value="${_user.uname }" /></td>
											<td style="text-align:center; width:25%">工号：</td>
											<td style="width:50%; padding-left:20px">${_user.uid}<input type="hidden" name="uid" id="name" value="${_user.uid }" /></td>
										</tr>
										<tr height="34">
											<td style="text-align:center">性别：</td>
											<td style="padding-left:20px"><input type="text" name="usex" id="usex" value="${_user.usex }" /></td>
											<td style="text-align:center">职位：</td>
											<td style="padding-left:20px"><input type="text" name="uwork" id="uwork" value="${_user.uwork }" /></td>
										</tr>
										<tr height="34">
											<td style="text-align:center">入职时间：</td>
											<td style="padding-left:20px"><input type="date" name="uentrytime" id="uentrytime" value="${_user.uentrytime }" /></td>
											<td style="text-align:center">上级领导：</td>
											<td style="padding-left:20px"><input type="text" name="uboss" id="uboss" value="${_user.uboss }" /></td>
										</tr>
										<tr height="34">
											<td style="text-align:center">部门编号：</td>
											<td style="padding-left:20px"><input type="hidden" name="udepartid" id="udepartid" value="${_user.udepartid }" />${_user.udepartid }</td>
											<td style="text-align:center">部门：</td>
											<td style="padding-left:20px"><input type="text" name="udepartname" id="udepartname" value="${_user.udepartname }" /></td>
										</tr>
										<tr height="34"> 
											<td style="text-align:center">联系方式：</td>
											<td style="padding-left:20px"><input type="text" name="utel" id="utel" value="${_user.utel }" /></td>
											<td style="text-align:center">邮箱地址：</td>
											<td style="padding-left:20px"><input type="text" name="umail" id="umail" value="${_user.umail }" /></td>
										</tr>
										<tr height="25">
											<td style="text-align:center">地址：</td>
											<td style="padding-left:20px" colspan="3"><input type="text" name="uaddr" id="uaddr" value="${_user.uaddr }" /></td>
										</tr>
										<tr height="34">
											<td  colspan="2" style="text-align:center"><input type="submit" id="submit" value="提交" style="height:30; width: 100;" /></td>
											<td  colspan="2" style="padding-left:20px" align="center"><input type="reset" value="重置"  style="height:30px;width：120px;" /></td>
										</tr>
									</table>
									<p style="text-align:center">&nbsp;</p>
								</form>
			
	</div>


</body>
</html>
