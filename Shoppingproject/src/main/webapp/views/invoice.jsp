<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image:url("https://th.bing.com/th/id/R.198233be22c979954c097839fda4cfa9?rik=gLMrFxf87Txm1g&riu=http%3a%2f%2fwallpapercave.com%2fwp%2fa85gkGy.jpg&ehk=uVTkati0kVixe98kapRv4QyoJM6ozGB%2bYVlLf8ybmyw%3d&risl=&pid=ImgRaw&r=0");
background-repeat:no-repeat;
background-size:cover;
}</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	<%
Enumeration em=session.getAttributeNames();
while(em.hasMoreElements()){
	String a=em.nextElement().toString();
	String b=session.getAttribute(a).toString();
	if(a.equals("shop"))
	{
		
	}else{
	out.println("<h1>"+a+":"+b+"<h1>");
	}
}
%>
</body>
</html>







