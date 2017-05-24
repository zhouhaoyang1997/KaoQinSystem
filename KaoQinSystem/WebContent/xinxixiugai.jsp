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
</head>

<body class="main">
	<div id="divpagecontent">
								<form action="${pageContext.request.contextPath}/UpdateServlet" method="post">
					
									<table width="100%" border="0" cellspacing="5" class="upline"  >
										<tr>
											<td colspan="4" height="80" style="font-size: 50; font-family: '楷体';;"align="center"><p style="margin-left: -15%;">个人信息修改</p></td>
										</tr>
										<tr height="34">
											<td style="text-align:center; width:25%">姓名：</td>
											<td style="width:20%; padding-left:20px"><input type="text" name="uname" id="uname" value="${user.uname}" /></td>
											<td style="text-align:center; width:25%">工号：</td>
											<td style="width:50%; padding-left:20px"><input type="hidden" name="uid" value="${user.uid}" />${user.uid}</td>
										</tr>
										<tr height="34">
											<td style="text-align:center">性别：</td>
											<td style="padding-left:20px"><input type="hidden" name="usex" value="${user.usex}" />${user.usex}</td>
											<td style="text-align:center">职位：</td>
											<td style="padding-left:20px"><input type="hidden" name="uwork" value="${user.uwork}" />${user.uwork}</td>
										</tr>
										<tr height="34">
											<td style="text-align:center">入职时间：</td>
											<td style="padding-left:20px"><input type="hidden" name="uentrytime" value="${user.uentrytime}" />${user.uentrytime}</td>
											<td style="text-align:center">上级领导：</td>
											<td style="padding-left:20px"><input type="hidden" name="uboss" value="${user.uboss}" />${user.uboss}</td>
										</tr>
										<tr height="34">
											<td style="text-align:center">部门编号：</td>
											<td style="padding-left:20px"><input type="hidden" name="udepartid" value="${user.udepartid}" />${user.udepartid}</td>
											<td style="text-align:center">部门名称：</td>
											<td style="padding-left:20px"><input type="hidden" name="udepartname" value="${user.udepartname}" />${user.udepartname}</td>
										</tr>
										<tr height="34"> 
											<td style="text-align:center">联系方式：</td>
											<td style="padding-left:20px"><input type="text" name="utel" id="utel" value="${user.utel}" /></td>
											<td style="text-align:center">邮箱地址：</td>
											<td style="padding-left:20px"><input type="text" name="umail" id="umail" value="${user.umail }" /></td>
										</tr>
										<tr height="25">
											<td style="text-align:center">地址：</td>
											<td style="padding-left:20px" colspan="3"><input type="text" name="uaddr" id="uaddr" value="${user.uaddr}" /></td>
										</tr>
										<tr height="34">
											<td  colspan="2" style="text-align:center"><input type="submit" id="submit" value="提交" style="height:30; width: 100;" /></td>
											<td  colspan="2" style="padding-left:20px" align="center"><input type="reset" value="重置"  style="height:30px;width：120px;" /></td>
										</tr>
											<input type="hidden" name="upwd" value="${user.upwd}" />
									</table>
									<p align="center">${msg}</p>
								</form>
					
	</div>


</body>
</html>
