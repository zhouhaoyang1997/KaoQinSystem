<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	
<title>申请出差</title>
<style type="text/css">
	.main{
		margin: 2% auto  auto 2%;
		background-color: 
	}
	.upline td{
		background-color: #E4EFF7;
	}
</style>
<script language="javascript">
		function checkform() {
			var f = document.loginform;
			if (f.uname.value == "") {
				alert("请输入您的用户名！");
				f.uname.focus();
				return false;
			}
			if (f.upwd.value == "") {
				alert("请输入密码！");
				f.upwd.focus();
				return false;
			}
			if (f.upwd.value != f.upwd2.value) {
				alert("两次密码不一致！");
				f.upwd2.focus();
				return false;
			}
		}

	</script>
</head>

<body class="main">
							<form name="loginform" method="post" action="${pageContext.request.contextPath}/UpdatePwd" onsubmit="javascript:return checkform();">
	
									<table width="100%" border="0" cellspacing="5" class="upline"  >
										<tr>
											<td colspan="4" height="80" style="font-size: 50; font-family: '楷体';;"align="center"><p style="margin-left: -15%;">个人信息修改</p></td>
										</tr>
										<tr height="34">
											<td style="text-align:center; width:10%">姓名：</td>
											<td style="width:20%; padding-left:20px" colspan="3"><input type="text" name="uname" id="uname" value="${user.uname }" style="width: 353;"/></td>
										</tr>
							
										<tr height="34"> 
											<td style="text-align:center">密码：</td>
											<td style="padding-left:20px" colspan="3"><input type="password" name="upwd" id="upwd" value="" style="width: 353;"/></td>
										</tr>
										<tr height="34">
											<td style="text-align:center">再次输入密码：</td>
											<td style="padding-left:20px" colspan="3"><input type="password" name="upwd2" id="upwd2" value="" style="width: 353;"/></td>
										</tr>
										<tr height="34">
											<td  colspan="4"><input type="submit" id="submit" value="提交" style="height:30; width: 100; margin-left: 27%; margin-top: 0.4%;" /><input type="reset" value="重置"  style="height:30; width: 100; margin-left: 5%;"/></td>
										</tr>
									</table>
									<p align="center">${msg}</p>
								</form>

</body>
</html>
