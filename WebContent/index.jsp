<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta name="format-detection" content="telephone=no" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1,user-scalable=no,maximum-scale=1" />
<title></title>
<link href="css/fire_word_style.css" type="text/css" rel="stylesheet" />
<link href="css/3D_style.css" type="text/css" rel="stylesheet" />
<style type="text/css">
input[type="checkbox"] {
	margin: 0px 0 0;
	line-height: normal;
}

input {
	line-height: 28px !important;
}
</style>
</head>




<body class="bg_fff" style="background-color: #684da3;">
	<form action="login.do" method="post" name="form" id="form">

		<!-- <div style="margin-bottom: 100px;">
			<p style="font-size: 40px;">
				<span data-text="桃">桃</span> <span data-text="园">园</span> <span
					data-text="小">小</span> <span data-text="伙">伙</span> <span
					data-text="伴">伴</span>
			</p>
		</div>


		<div id="container">
			<p>
				<a href="#">桃园小伙伴 </a>
			</p>
		</div> -->

		<div>

			<div style="margin-left: 30px; margin-bottom: 20px;">
				<div>
					<input type="text" placeholder="请输入姓名" name="userName"
						maxlength="19" id="userName"">
				</div>
				<div style="margin: auto 0;">
					<input type="text" placeholder="请输入密码" name="passWord"
						maxlength="6" id="passWord"">
				</div>
			</div>
			<!--按钮-->
			<div style="margin: auto 0;">
				<input onclick="doIt()" id="submitBt" name="submitBt"
					style="background-color: red" type="button" class="xf_buttomhui"
					value="登陆" />
			</div>

		</div>

	</form>

<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
	<script>

		function doIt() {
			if ("" == document.getElementById("userName").value) {
				alert("填姓名了吗？");
				return;
			}
			if ("" == document.getElementById("passWord").value) {
				alert("填密码了吗？");
				return;
			}
			$("#form").submit();

		}

		//切换验证码
	</script>

</body>
</html>
