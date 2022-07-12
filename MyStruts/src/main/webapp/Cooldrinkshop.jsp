<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red"><center>
<hr>
<jsp:include page="logout.jsp" />
<hr>
<h1>Cooldrinkshop</h1>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="shop" value="shop4">
<input type="checkbox" name="sprite" value="rs50">Sprite
<input type="checkbox" name="Thumsup" value="rs70">Thums up
<input type="checkbox" name="Maaza" value="rs40">Maaza
<input type="submit" value="Next">
</form>
</center>
</body>
</html>