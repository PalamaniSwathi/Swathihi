<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="rn" class="action.RationalBean" />
<jsp:setProperty name="rn" property="*" />
<h3>Number in reduced form is : </h3>
<jsp:getProperty name="rn" property="reduced"/>
</body>
</html>

