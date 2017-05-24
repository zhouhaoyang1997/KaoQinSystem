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
<jsp:include page="search.jsp" ></jsp:include>

<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr> 
    <td nowrap class="td_top">请假编号</td>
    <td nowrap class="td_top">请假时间</td>
    <td nowrap class="td_top">批准时间</td>
    <td nowrap class="td_top">结束时间</td>
    <td nowrap class="td_top">员工编号</td>
    <td nowrap class="td_top"></td>
    <td nowrap class="td_top"></td>
    <td nowrap class="td_top"></td>
  </tr>
  <c:forEach items="${dayoffs}" var="dos" varStatus="i">
  <tr> 
    <td class="td_01">${i.count }</td>
    <td class="td_01">${dos.begintime}</td>
    <td class="td_01">${dos.agreetime}</td>
    <td class="td_01">${dos.endtime}</td>
    <td class="td_01">${user.uid}</td>
    <td class="td_01"></td>
    <td class="td_01"></td>
    <td class="td_01"></td>
  </tr>
</c:forEach>
</table>
<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr> 
    <td nowrap width="95%" class="td_top"></td>
  </tr>
</table>
<table width="95%"  border="0" cellpadding="0" cellspacing="0" class="table02" align="center">
  <tr>
    <td height="30" align="right"><img src="images/1.gif" width="4" height="5" align="absmiddle">  上一页　 <img src="images/2-2.gif" width="3" height="5" align="absmiddle"> 下一页　 　　共 1 页 1 条记录</td>
  </tr>
</table>
</body>
</html>
