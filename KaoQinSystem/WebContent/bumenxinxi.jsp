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
				
								<form action="modifyUserInfoSuccess.jsp" method="post">
					
									<table width="100%" border="0" cellspacing="5" class="upline"  >
										<tr>
											<td colspan="4" height="80" style="font-size: 50; font-family: '楷体';"align="center">部门信息</td>
										</tr>
										<tr height="34">
											<td style="text-align:center; width:20%">部门编号：</td>
											<td style="width:20%; padding-left:20px">${dt.udepartid}</td>
										</tr>
										<tr height="34">
											<td style="text-align:center">部门名称：</td>
											<td style="padding-left:20px">${dt.udepartname}</td>
										</tr>
										<tr height="34">
											<td style="text-align:center">部门职责：</td>
											<td style="padding-left:20px">${dt.duty}</td>
										</tr>
										<tr height="34">
											<td style="text-align:center">部门负责人：</td>
											<td style="padding-left:20px">${dt.boss}</td>
										</tr>
										<tr height="34"> 
											<td style="text-align:center">联系方式：</td>
											<td style="padding-left:20px">${dt.tel}</td>
										</tr>
									</table>
								</form>
			
	</div>


</body>
</html>
