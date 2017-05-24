<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	
<title>公告发布</title>
<style type="text/css">
	.main{
		margin: 0.3% auto  auto 0.5%;
		background-color: 
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
function checkform() {
	var f = document.form;
	if (f.name.value == "") {
		alert("标题不能为空！");
		f.name.focus();
		return false;
	}
	if (f.time.value == "") {
		alert("请选择时间！");
		f.time.focus();
		return false;
	}

}

</script>
</head>

<body class="main">
								<form action="../CreatGongGao" method="post" name="form" onsubmit="javascript:return checkform();">
					
									<table width="100%" border="0" cellspacing="5" class="upline"  >
										<tr>
											<td colspan="4" height="80" style="font-size: 50; font-family: '楷体';;"align="center"><p style="margin-left: -15%;">公告发布</p></td>
										</tr>
										<tr height="34">
											<td style="text-align:center; width:10%">标题</td>
											<td style="width:20%; padding-left:20px" colspan="3"><input type="text" name="name" id="name" value="" style="width: 353;"/></td>
										</tr>
							
										<tr height="34"> 
											<td style="text-align:center">发布时间</td>
											<td style="padding-left:20px" colspan="3"><input type="date" name="time" id="time" value="" /></td>
										</tr>
										<tr height="34">
											<td colspan="2" style="text-align:center">内容</td>
										</tr>
										<tr height="400">
											<td colspan="2" style="text-align:center"><textarea name = "text" style="height: 100%; width: 80%;"></textarea></td>
										</tr>
										<tr height="50">
											<td  colspan="4" align="center"><input type="submit" id="submit" value="提交" style="height:30; width: 100; margin-left: -15%; " /><input type="reset" value="重置"  style="height:30; width: 100; margin-left: 5%;"/></td>

										</tr>
									</table>
								</form>

</body>
</html>
