<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查询结果</title>
<link href="css/style1.css" rel="stylesheet" type="text/css">

</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">

<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr> 
    <td nowrap class="td_top">请假编号</td>
    <td nowrap class="td_top">请假时间</td>
    <td nowrap class="td_top">审批时间</td>
    <td nowrap class="td_top">结束时间</td>
    <td nowrap class="td_top">员工编号</td>
    <td nowrap class="td_top">员工姓名</td>
    <td nowrap class="td_top">操作</td>
    <td nowrap class="td_top"></td>
  </tr>
  <c:forEach items="${qingjia}" var="dos" varStatus="i">
  <tr> 
    <td class="td_01">${i.count }</td>
    <td class="td_01">${dos.starttime}</td>
    <td class="td_01">${dos.agreetime}</td>
    <td class="td_01">${dos.endtime}</td>
    <td class="td_01">${dos.uname}</td>
    <td class="td_01">${dos.uid}</td>
    <td class="td_01"><a href="AgreeDayOff?uid=${dos.uid}&starttime=${dos.starttime}">批准</a></td>
    <td class="td_01"></td>
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
