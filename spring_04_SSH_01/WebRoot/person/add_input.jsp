<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add_input.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
	<form action="system/person!add.action" method="post">
		姓名：<input type="text" name="name"> <br/>
		地址：<input type="text" name="address"> <br/>
		QQ： <input type="text" name="qq"> <br/>
		组：
		<select name="group.id">
			<s:iterator value="#groups">
			<option value="<s:property value="id"/>"> <s:property value="name"/> </option>
			</s:iterator>
		</select> <br/>
		<input type="submit" name="submit" value="保存人员">
	</form>
  </body>
</html>
