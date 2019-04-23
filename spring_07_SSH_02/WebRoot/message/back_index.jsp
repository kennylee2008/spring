<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/message/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎使用领航致远消息管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="领航致远,SSH,Spring,Hibernate,Struts,消息管理系统">
	<meta http-equiv="description" content="领航致远,SSH,Spring,Hibernate,Struts,消息管理系统">
	<link rel="stylesheet" type="text/css" href="styles.css">
  </head>
  
  <body>
<%@include file="/common/header.jsp" %>
 <div id=content>
  <div id=sm>
  	欢迎使用消息管理系统！
  	您有【0】条新的短消息
  </div>

   <div>
    <p>&nbsp;</p>
    <p><strong>本系统基于SSH技术开发，主要目的在于理解基本的项目开发过程，以及SSH集成开发技术！</strong></p>
    <ul>
  
    	<li>项目开发基本过程：
    		<ul>
    			<li>1、需求：从客户角度理解需求</li>
    			<li>2、分析：对需求进行分析，得到概念模型</li>
    			<li>3、设计：进一步对概念模型进行细化，运用依赖倒置原则（从上到下）设计（主要工具：顺序图）各个层次的接口及其职责的分配</li>
    			<li>4、实现：自底向上、从被依赖的部分开始实现
    				<ul>
    					<li>4.1 实体类的定义及其映射</li>
    					<li>4.2 数据库表的创建</li>
    					<li>4.3 根据设计结果定义DAO接口和Service接口</li>
    					<li>4.4 DAO接口和Service接口的实现</li>
    					<li>4.5 对关键的实现进行单元测试</li>
    					<li>4.6 考虑呈现层的实现
    						<ul>
    							<li>4.6.1 构思呈现层的页面流程，规范各种页面和Action及Result的命名</li>
    							<li>4.6.2 定义Action类以及它的依赖关系</li>
    							<li>4.6.3 在Action类中定义所有需要定义的方法</li>
    							<li>4.6.4 逐个实现这些方法及其对应的视图</li>
    						</ul>
    					</li>
    				</ul>
    			</li>
    		</ul>
    	</li>

    </ul>
   </div>

 </div>
  </body>
</html>
