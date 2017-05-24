<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	
<title>申请出差</title>
<style type="text/css">
	.main{
		margin: 1% auto  auto 1%;
		background-color: 
	}
	.upline td{
		background-color: #E4EFF7;
	}
</style>
</head>

<body class="main">
	<div id="divpagecontent">
				
					
									<table width="100%" border="0" cellspacing="5" class="upline"  >
										<tr>
											<td colspan="4" height="80" style="font-size: 50; font-family: '楷体';"align="center"><p style="margin-left: -20%;">个人信息</p></td>
										</tr>
										<tr height="34">
											<td style="text-align:center; width:20%">姓名：</td>
											<td style="width:20%; padding-left:20px">${_user.uname}</td>
											<td style="text-align:center; width:25%">工号：</td>
											<td style="width:50%; padding-left:20px">${_user.uid}</td>
										</tr>
										<tr height="34">
											<td style="text-align:center">性别：</td>
											<td style="padding-left:20px">${_user.usex}</td>
											<td style="text-align:center">职位：</td>
											<td style="padding-left:20px">${_user.uwork}</td>
										</tr>
										<tr height="34">
											<td style="text-align:center">入职时间：</td>
											<td style="padding-left:20px">${_user.uentrytime}</td>
											<td style="text-align:center">上级领导：</td>
											<td style="padding-left:20px">${_user.uboss}</td>
										</tr>
										<tr height="34">
											<td style="text-align:center">部门编号：</td>
											<td style="padding-left:20px">${_user.udepartid}</td>
											<td style="text-align:center">部门：</td>
											<td style="padding-left:20px">${_user.udepartname}</td>
										</tr>
										<tr height="34"> 
											<td style="text-align:center">联系方式：</td>
											<td style="padding-left:20px">${_user.utel}</td>
											<td style="text-align:center">邮箱地址：</td>
											<td style="padding-left:20px">${_user.umail}</td>
										</tr>
										<tr height="25">
											<td style="text-align:center">地址：</td>
											<td style="padding-left:20px" colspan="3">${_user.uaddr}</td>
										</tr>
									</table>
									<p style="text-align:center">&nbsp;</p>
			
	</div>


</body>
</html>
