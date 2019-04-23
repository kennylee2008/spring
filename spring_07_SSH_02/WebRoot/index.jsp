<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录领航致远消息管理系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
<style type="text/css">
* { margin:0; padding:0;}
#main { width:208px; margin:50px; MARGIN-RIGHT: auto; MARGIN-LEFT: auto;}
#title,.formt { width:208px; height:26px; line-height:26px; text-indent:5px; font-family:verdana, tahoma, sans-serif; font-size:12px; background:#ddd;}
#login { width:208px; height:24px; padding-top:11px; background:url(images/warning.gif) no-repeat 9px 8px; text-indent:28px; font-size: 12px; color:#666; font-weight:100;}
.formt { display:block; font-weight:800; background:#fff;}
.username,.password {
	background:#fff;
	border:1px solid #ccc;
	color:#000;
	font-family:verdana, tahoma, sans-serif;
	font-size:12px;
	width:196px;
	height:22px;
	margin-left:6px;
	padding-left:20px;
	line-height:20px;
}
.username { background:url(images/username.gif) no-repeat 2px 2px;}
.password { background:url(images/password.gif) no-repeat 2px 2px;}
#forget a { width:208px; height:20px; line-height:20px; text-indent:3px; font-family:verdana, tahoma, sans-serif; font-size:10px; color:#f60}
#button { width:208px; height:28px; }
.imgbutton {margin-top:7px; margin-left:132px; }
</style>	
  </head>
  
  <body>
<form action="message/back_index.jsp" method="post" >
<div id="main">
	<h1 id="title">登录领航致远消息管理系统</h1>
	<h2 id="login">请输入您的用户名和密码</h2>
	<p class="formt">用户名</p>
	<p><input name="username" type="text" class="username" value="${username}"></p>
	<p class="formt">密码</p>
	<p><input name="password" type="password" class="password"></p>
	<p id="forget"></p>
	<p id="button"><input type="image" src="images/loginin.gif" class="imgbutton" /></p>
	<p><font color="red">${exception.message}</font></p>
</div>  
</form>
		
		
  </body>
</html>
