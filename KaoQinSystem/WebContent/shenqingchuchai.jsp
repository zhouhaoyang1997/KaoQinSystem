<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	
<title>申请出差</title>
<style type="text/css">
	.main{
		margin: 1% auto  auto 0.5%;
	}
	.upline td{
		background-color: #E4EFF7;
	}
</style>
<script>
window.onload = function(){
	if("${msg}"!=""){
		alert("${msg}");
	}
}
</script>
</head>

<body class="main">
	<div id="divpagecontent">
				
								<form action="CreatChuChai" method="post">
					
									<table width="100%" border="0" cellspacing="5" class="upline"  >
										<tr>
											<td colspan="4" height="80" style="font-size: 50; font-family: '楷体';"align="center">出差申请</td>
										</tr>
										<tr height="34">
											<td style="text-align:center; width:25%">姓名：</td>
											<td style="width:20%; padding-left:20px">
												<input type="hidden" name="uname" value="${user.uname}">
											<input type="hidden" name="udepartname" value="${user.udepartname}">
											<input type="hidden" name="uid" value="${user.uid }"style="width: 353;">${user.uname}</td>
										</tr>
										<tr height="50">
											<td style="text-align:center">申请原因：</td>
											<td style="padding-left:20px" ><textarea name="reason" rows="5" cols="50"></textarea></td>
										</tr>
										<tr height="34">
											<td style="text-align:center">出差地点：</td>
											<td style="padding-left:20px"><input type="text" name="addr" style="width: 353;"></td>
										</tr>
										<tr height="34">
											<td style="text-align:center">现在时间：</td>
											<td style="padding-left:20px"><input type='date' name='starttime' /></td>
										</tr>
										<tr height="34">
											<td style="text-align:center">出差时间：</td>
											<td style="padding-left:20px"><input type="date" name="endtime"></td>
										</tr>
										<tr height="34">
											<td style="text-align:center"><input type="submit" id="submit" value="提交" style="height:30; width: 100;" /></td>
											<td style="padding-left:20px" align="center"><input type="reset" value="重置"  style="height:30; width: 100;" /></td>
										</tr>
									</table>
								</form>
			
	</div>


</body>
</html>
