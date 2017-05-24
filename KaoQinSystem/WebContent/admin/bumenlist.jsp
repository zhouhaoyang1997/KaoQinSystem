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
    <td nowrap class="td_top">部门编号</td>
    <td nowrap class="td_top">部门名字</td>
    <td nowrap class="td_top">部门职责</td>
    <td nowrap class="td_top">部门负责人</td>
    <td nowrap class="td_top">联系电话</td>
    <td nowrap class="td_top"> </td>
    <td nowrap class="td_top">操作</td>
    <td nowrap class="td_top"><input type="button" onclick="javascrtpt:window.location.href='admin/newdepart.jsp'" value="新增"/></td>
  </tr>
  <c:forEach items="${depart}" var="depart" varStatus="i">
  
  <tr> 
    <td class="td_01">${depart.udepartid }</td>
    <td class="td_01">${depart.udepartname }</td>
    <td class="td_01">${depart.duty }</td>
    <td class="td_01">${depart.boss }</td>
    <td class="td_01">${depart.tel }</td>
    <td class="td_01"></td>
     <td class="td_01">
    <a href="DepartSearch?udepartname=${depart.udepartname  }&methon=Info">查看 </a>
    <a href="DeleteDepart?udepartname=${depart.udepartname  }">删除 </a>
    </td>
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
