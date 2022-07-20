<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple Bean JSP</title>
</head>
<body>
<jsp:useBean id="simpleBean" class="action.SimpleBean"/>
<p>The result of<tt>SimpleMethod()</tt>:
<p>
<font color="#FF0000">
<%=simpleBean.simpleMethod() %>
</font>
</body>
</html>