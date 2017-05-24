<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
<title>申请出差</title>
<style type="text/css">
.main {
	margin: 4% auto auto 5%;
	background-color:
}

.upline td {
	background-color: #E4EFF7;
}
</style>
</head>

<body class="main">
	<div id="divpagecontent">
		<form action="${pageContext.request.contextPath}/CreateDepartServlet" method="post">

			<table width="58%" border="0" cellspacing="5" class="upline">
				<tr>
					<td colspan="4" height="80"
						style="font-size: 50; font-family: '楷体';" align="center"><p
							style="margin-left: -15%;">新建部门</p></td>
				</tr>
				<tr height="34">
					<td style="text-align: center; width: 25%">部门名称：</td>
					<td style="width: 50%; padding-left: 20px"><input type="text"
						name="udepartname" id="udepartname" value="${depart.udepartname }" /></td>
					<td></td>
				</tr>
				<tr height="34">
					<td style="text-align: center">部门负责人：</td>
					<td style="padding-left: 20px"><input type="text" name="duty"
						id="usex" value="${depart.duty }" /></td>
					<td></td>

				</tr>
				<tr height="34">
					<td style="text-align: center">部门职责：</td>
					<td style="padding-left: 20px"><input type="text" name="boss"
						id="uwork" value="${depart.boss }" /></td>
					<td></td>

				</tr>
				<tr height="34">
					<td style="text-align: center">部门电话：</td>
					<td style="padding-left: 20px"><input type="text" name="tel"
						id="uentrytime" value="${depart.tel }" /></td>
					<td style="padding-left: 20px">&nbsp;</td>
				</tr>

				<tr height="34">
					<td colspan="2" style="text-align: center"><input
						type="submit" id="submit" value="提交"
						style="height: 30; width: 100;" /><input type="reset" value="重置"
						style="height: 30; width: 100;" /></td>
					<td></td>

				</tr>
			</table>
			<p style="text-align: center">&nbsp;</p>
		</form>

	</div>


</body>
</html>
