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
    <td nowrap class="td_top">公告编号</td>
    <td nowrap class="td_top">标题</td>
    <td nowrap class="td_top">发布时间</td>
    <td nowrap class="td_top"></td>
    <td nowrap class="td_top"></td>
    <td nowrap class="td_top">操作</td>
    <td nowrap class="td_top"></td>
    <td nowrap class="td_top"></td>
  </tr>
  <c:forEach items="${gonggao}" var="gg" varStatus="i">
  <tr> 
    <td class="td_01">${i.count }</td>
    <td class="td_01"><a href="GetGongGao?name=${gg.name}">${gg.name}</a></td>
    <td class="td_01">${gg.time}</td>
    <td class="td_01"></td>
    <td class="td_01"></td>
    <td class="td_01"><a href="DeleteGongGao?name=${gg.name}">删除</a></td>
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
