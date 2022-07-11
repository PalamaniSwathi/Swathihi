<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<h1>Vegtable Shop</h1>
<form action="purchase.do" method="post">
<input type="hidden" name="action" value="purchase">
<input type="hidden" name="shop" value="VegetableShop">
<input type="checkbox" name="carrot" value="rs50">Carrot
<input type="checkbox" name="Potato" value="rs70">Potato
<input type="checkbox" name="beans" value="rs40">Beans
<input type="submit" value="Next">
</form>
</center>
</body>
</html>