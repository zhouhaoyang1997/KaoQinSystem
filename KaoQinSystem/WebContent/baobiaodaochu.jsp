<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
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
<body>
<form action="GetChuQin?methon=daochu" method="post" name="search">
			<table width="95%" border="0" cellspacing="0" cellpadding="0" >
				<tr >
					<td width="5%">&nbsp;</td>
					<td width="10%" style="font-size: 12;">统计时间：</td>
					<td><input type="month" name="month" value="" /></td>
					<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
										<td width="10%" style="font-size: 12;">公司部门：</td>
									<td><select name="depart">
										<option value="开发部">开发部</option>
										<option value="营销部">营销部</option>

										<option value="人力资源部">人力资源部</option>

										<option value="财务部">财务部</option>

									</select></td>

					
					<td><input type="submit" onclick="return checkform()" value="导出"/></td>
					<td width="70%">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
				</tr>
			</table>
	</form>
</body>
</html>