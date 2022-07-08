<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	buffer="15kb"
	autoFlush="false"
	errorPage="err.jsp"
	%>
<hr>
<%@ include file="header1.jsp" %>
<hr>
<jsp:include page="header1.jsp">
	<jsp:param name="cname" value="Anound Technologies...."/>
</jsp:include>
<hr>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(int i=0;i<1000;i++){
		//out.println("Hello");
	} %>
	<%
	Date d;
	List list;
	ArrayList al;
	%>
	மாலை வணக்கம்
	
	<%="Welcome to JSP........"%>
	<%=application.getRealPath("")%>
	<%
	String uname = request.getParameter("uname");
	%>
	<h1>
		<%
		out.println(uname);
		met();
		%>
	</h1>
	<h2>
		<%=uname%><%=value%>
	</h2>
	<%!String value = "hello world...";
	void met() {
		System.out.println("called....");
	}%>
</body>
</html>
<hr>
<%@ include file="footer1.jsp" %>









