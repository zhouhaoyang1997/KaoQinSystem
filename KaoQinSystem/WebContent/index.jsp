<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"  errorPage="error.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
		<link href="css/main1.css" type="text/css" rel="stylesheet">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<META HTTP-EQUIV="Pragma" CONTENT="no-cache">
		<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache">
		<title>用户登录</title>
	</head>

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
		}

		function exit() {
			if (confirm("您真的要退出本系统吗？")) {
				window.opener = null;
				window.close();
			}
		}
	</script>

	<body>

		<form name="loginform" method="post" action="${pageContext.request.contextPath}/UserLogin" onsubmit="javascript:return checkform();">
			<table width="1310" border="0" cellpadding="0" cellspacing="0" align="center">
				<!--DWLayoutTable-->
				<tr>
					<td width="1310" height="650" valign="top"><img src="images/bg1.jpg" width="1310" height="650" border="0" style="boder:1px solid #FF00" /></td>
				</tr>
				<div class="login_frame">
					<div class="login_putin">
						<ul>
							<li>
								<font face="楷体" size="5" color="#FFF5EE"><strong>用户名:</strong> <input name="uname" type="text" id="uanme" size="8" style="height: 1;"/>
							</li>
							<li>
								<strong> 密码: <input type="password" name="upwd" id="upwd" size="8" style="height: 1;"></strong>

							</li>
							<li style="font-size: 12;margin-left: -30%;" >
								<input type="radio" name="urole" id="role" value="普通用户" /><span style="margin-left: -30%;">普通用户</span>
								<input type="radio" name="urole" id="role" value="管理员" /><span style="margin-left: -30%;">管理员</span>
								
							</li>
						</ul>
					</div>
					<div class="login_btn">
						&nbsp;&nbsp;&nbsp;<input type="submit" value="登陆" > <p>${user_msg}</p>
					</div>
				</div>
			</table>

		</form>

	</body>

</html>