<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>查询结果</title>
<link href="css/style1.css" rel="stylesheet" type="text/css">
<script language="javascript">
		function checkform() {
			var f = document.search;
			if (f.month.value == "") {
				alert("请选择日期");
				return false;
			}
			if (f.depart.value == "") {
				alert("请选择部门！");
				return false;
			}
			f.submit();
		}

	</script>
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
<form action="GetChuQin" method="post" name="search">
			<table width="95%" border="0" cellspacing="0" cellpadding="0" >
				<tr >
					<td width="5%">&nbsp;</td>
					<td width="5%" style="font-size: 12;">统计时间：</td>
					<td><input type="month" name="month" value="" /></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
										<td width="5%" style="font-size: 12;">公司部门：</td>
									<td><select name="depart">
										<option value="开发部">开发部</option>
										<option value="营销部">营销部</option>

										<option value="人力资源部">人力资源部</option>

										<option value="财务部">财务部</option>

									</select></td>

					
					<td><input type="submit" onclick="return checkform()" value="查询"/></td>
					<td width="70%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				</tr>
			</table>
	</form>
	
<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td nowrap class="td_top" width="10%">天数\类型</td>
    <td nowrap class="td_top">姓名</td>
    <td nowrap class="td_top">出差</td>
    <td nowrap class="td_top">请假</td>
    <td nowrap class="td_top">上班</td>
    <td nowrap class="td_top">总计</td>
    <td nowrap class="td_top"></td>
    <td nowrap class="td_top"></td>
	<td nowrap class="td_top">全勤/缺勤</td>	
  </tr>
  <c:forEach items="${list}" var="list" varStatus="i">
  <tr> 
 	 <td class="td_01"></td>
    <td class="td_01">${ list.value.uname}</td>
    <td class="td_01">${ list.value.chuchaiday}</td>
    <td class="td_01">${ list.value.qingjiaday}</td>
    <td class="td_01">${ list.value.shangbanday}</td>
    <td class="td_01">${ list.value.chuchaiday + list.value.qingjiaday+list.value.shangbanday}</td>
    <td class="td_01"></td>
    <td class="td_01"></td>
    <td class="td_01">
    <c:if test="${ list.value.chuchaiday + list.value.qingjiaday+list.value.shangbanday <30}" >缺勤</c:if>
    <c:if test="${ list.value.chuchaiday + list.value.qingjiaday+list.value.shangbanday >=30}" >全勤</c:if>
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
