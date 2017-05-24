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
    <td nowrap class="td_top">工号：</td>
    <td nowrap class="td_top">姓名</td>
    <td nowrap class="td_top">性别</td>
    <td nowrap class="td_top">职位：</td>
    <td nowrap class="td_top">部门：</td>
    <td nowrap class="td_top"></td>
    <td nowrap class="td_top">操作</td>
  </tr>
  <c:forEach items="${_users}" var="_users" varStatus="i">
  
  <tr> 
    <td class="td_01">${_users.uid }</td>
    <td class="td_01">${_users.uname }</td>
    <td class="td_01">${_users.usex }</td>
    <td class="td_01">${_users.uwork }</td>
    <td class="td_01">${_users.udepartname }</td>
    <td class="td_01"></td>
    <td class="td_01">
    <a href="UserSearch?uid=${_users.uid }&methon=Info">查看 </a>
    <a href="DeleteUser?uid=${_users.uid }">删除 </a>
    </td>
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
