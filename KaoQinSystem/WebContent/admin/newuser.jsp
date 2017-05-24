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
					<form action="${pageContext.request.contextPath}/AddUser" method="post">
					
									<table width="100%" border="0" cellspacing="5" class="upline"  >
										<tr>
											<td colspan="4" height="80" style="font-size: 50; font-family: '楷体';;"align="center"><p style="margin-left: -15%;">员工信息修改</p></td>
										</tr>
										<tr height="34">
											<td style="text-align:center; width:25%">姓名：</td>
											<td style="width:20%; padding-left:20px"><input type="text" name="uname" id="name" value="" /></td>
											<td style="text-align:center; width:25%">工号：</td>
											<td style="width:50%; padding-left:20px">${_user.uid}<input type="hidden" name="uid" id="name" value="" /></td>
										</tr>
										<tr height="34">
											<td style="text-align:center">性别：</td>
											<td style="padding-left:20px"><input type="text" name="usex" id="usex" value="" /></td>
											<td style="text-align:center">职位：</td>
											<td style="padding-left:20px"><input type="text" name="uwork" id="uwork" value="" /></td>
										</tr>
										<tr height="34">
											<td style="text-align:center">入职时间：</td>
											<td style="padding-left:20px"><input type="date" name="uentrytime" id="uentrytime" value="" /></td>
											<td style="text-align:center">上级领导：</td>
											<td style="padding-left:20px"><input type="text" name="uboss" id="uboss" value="" /></td>
										</tr>
										<tr height="34">
											<td style="text-align:center">部门编号：</td>
											<td style="padding-left:20px"><input type="text" name="udepartid" id="udepartid" value="" /></td>
											<td style="text-align:center">部门：</td>
											<td style="padding-left:20px"><input type="text" name="udepartname" id="udepartname" value="" /></td>
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
