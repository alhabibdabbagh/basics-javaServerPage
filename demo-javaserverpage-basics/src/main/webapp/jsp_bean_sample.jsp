<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Bean Usage</title>
</head>
<body>


	<jsp:useBean id="userInfo" class="demo.jsp.bean.User" />
	
	<jsp:setProperty name="userInfo" property="name" value="<%=request.getParameter(\"name\")%>" />
	<jsp:getProperty name="userInfo" property="name" />

	<jsp:setProperty name="userInfo" property="surname" value="<%=request.getParameter(\"surname\")%>" />
	<jsp:getProperty name="userInfo" property="surname" />


</body>
</html>