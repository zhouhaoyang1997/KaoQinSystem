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
<script language="javascript">
function searchform() {
	var f = document.search;
	f.action = "${pageContext.request.contextPath }/AdvancedSearch?name=User";
	f.submit();
}
function changerole() {
	var f = document.urole;
	f.action = "${pageContext.request.contextPath }/ChangeRole";
	f.submit();
}
	</script>
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
	<form  method="post" name="search">
			<table width="95%" border="0" cellspacing="0" cellpadding="0" >
				<tr >
					<td width="5%">&nbsp;</td>
					<td width="5%" style="font-size: 12;">员工工号：</td>
					<td><input type="text" name="uid" value=""/></td>
					<td width="5%" style="font-size: 12;">姓名：</td>
					<td><input type="text" name="uname" value=""/></td>
					<td width="5%" style="font-size: 12;">部门名称：</td>
					<td width="7%"><input type="text" name="udepartname" value=""/></td>
					<td><input type="hidden" name="starttime" value="" id="db"/></td>
					<td><input type="hidden" name="endtime" value="" id="db"/></td>
					<td  width="7%" >&nbsp;&nbsp;<input type="button" onclick="searchform()" value="检索"/></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					
				</tr>
			</table>
	</form>
		<form  method="post" name="urole">
	
<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr> 
   <td nowrap class="td_top"></td>
    <td nowrap class="td_top">工号</td>
    <td nowrap class="td_top">姓名</td>
    <td nowrap class="td_top">性别</td>
    <td nowrap class="td_top">职位</td>
    <td nowrap class="td_top">部门</td>
    <td nowrap class="td_top" width="5%"><input type="radio" name="urole" id="role" value="普通用户" />普通用户</td>
    <td nowrap class="td_top" width="5%"><input type="radio" name="urole" id="role" value="管理员" />管理员</td>
    <td nowrap class="td_top" width="5%"><input type="button" onclick="changerole()" value="确认"/></td>
    
  </tr>
  <c:forEach items="${list}" var="_users" varStatus="i">
  <tr>
  	<td class="td_01"><input type="checkbox" name="uid" value="${_users.uid }"/></td> 
    <td class="td_01">${_users.uid }</td>
    <td class="td_01">${_users.uname }</td>
    <td class="td_01">${_users.usex }</td>
    <td class="td_01">${_users.uwork }</td>
    <td class="td_01">${_users.udepartname }</td>
    <td class="td_01"></td>
    <td class="td_01">
    </td>
  </tr>
  </c:forEach>
 
</table>
</form>
<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr> 
    <td nowrap width="95%" class="td_top"></td>
  </tr>
</table>


</body>
</html>
