<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
		<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<title>申请出差</title>
<style type="text/css">
.main {
	margin: 2% auto auto 2%;
	background-color:
}

.upline td {
	background-color: #E4EFF7;
}

</style>
</head>

<body class="main">
	<div id="divpagecontent">

			<table width="100%" border="0" cellspacing="5" class="upline">
				<tr>
					<td colspan="4" height="80"
						style="font-size: 50; font-family: '楷体';" align="center"><p
							style="margin-left: -15%;">部门信息</p></td>
				</tr>
				<tr height="34">
					<td style="text-align: center; width: 25%">部门编号：</td>
					<td style="width: 20%; padding-left: 20px">${depart.udepartid }</td>
					<td style="text-align: center; width: 25%">部门名称：</td>
					<td style="width: 50%; padding-left: 20px">${depart.udepartname }</td>
				</tr>
				<tr height="34">
					<td style="text-align: center">部门负责人：</td>
					<td style="padding-left: 20px">${depart.duty }</td>
					<td style="text-align: center">部门职责：</td>
					<td style="padding-left: 20px">${depart.boss }</td>
				</tr>
				<tr height="34">
					<td style="text-align: center">部门电话：</td>
					<td style="padding-left: 20px">${depart.tel }</td>
					<td style="text-align: center">&nbsp;</td>
					<td style="padding-left: 20px">&nbsp;</td>
				</tr>

			</table>
			<p style="text-align: center">&nbsp;</p>

	</div>


</body>
</html>
