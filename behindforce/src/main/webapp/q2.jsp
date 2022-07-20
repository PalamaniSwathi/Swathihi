<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page 2</title>
</head>
<body>
<%@ page language="java" %>
<%! String name=""; %>
<% 
name = request.getParameter("thename");
session.putValue("thename", name); 
%>
The name is <%= name %>
<p>

<FORM METHOD=POST ACTION="q3.jsp">
What is your favorite food? 
<INPUT TYPE=TEXT NAME="food">
<P>
<INPUT TYPE=SUBMIT VALUE="SUBMIT">
</FORM>
</body>
</html>