<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查询结果</title>
<link href="css/style1.css" rel="stylesheet" type="text/css">
<style type="text/css">
	*{
			margin: 0.5% auto  auto auto;
	}
	td{
		background-color: #E4EFF7;
	}
</style>
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<form action="AdvancedSearch?name=QianDao&path=kaoqin" method="post">
			<table width="95%" border="0" cellspacing="0" cellpadding="0" >
				<tr >
					<td width="12%" style="font-size: 12;">员工工号：</td>
					<td><input type="text" name="uid" value=""/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td width="5%" style="font-size: 12;">部门：</td>
					<td><input type="text" name="udepartname" value=""/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td width="5%" style="font-size: 12;">姓名：</td>
					<td><input type="text" name="uname" value=""/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td width="5%">&nbsp;</td>
					<td width="5%" style="font-size: 12;">统计时间：</td>
					<td><input type="date" name="starttime" value="" id="db"/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input type="date" name="endtime" value="" id="db"/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input type="submit" onclick="" value="查询"/></td>
					<td width="70%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				</tr>
			</table>
	</form>
<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr> 
    <td nowrap class="td_top" width="10%">考勤编号</td>
    <td nowrap class="td_top" width="10%">员工编号</td>
    <td nowrap class="td_top" width="10%">员工姓名</td>
    <td nowrap class="td_top" width="10%">部门</td>
    <td nowrap class="td_top" width="16%">签到时间</td>
    <td nowrap class="td_top" width="16%">签退时间</td>
    <td nowrap class="td_top" width="16%">签到时间</td>
    <td nowrap class="td_top" width="16%">签退时间</td>
  </tr>
  <c:forEach items="${list}" var="sign" varStatus="i">
  <tr> 
    <td class="td_01" width="10%">${i.count }</td>
    <td class="td_01" width="10%">${user.uid}</td>
    <td class="td_01" width="10%">${user.uname}</td>
    <td class="td_01" width="10%">${user.udepartname }</td>
    <td class="td_01" width="16%">${sign.starttime }</td>
    <td class="td_01" width="16%">${sign.endtime }</td>
    <td class="td_01" width="16%">${sign.starttime1 }</td>
    <td class="td_01" width="16%">${sign.endtime1 }</td>
  </tr>
</c:forEach>
</table>
<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr> 
    <td nowrap width="95%" class="td_top"></td>
  </tr>
</table>

</body>
</html>
