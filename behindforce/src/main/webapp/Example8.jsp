<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>A Sample From using POST</title>
</head>
<body bgcolor="#fdf5e6">
<h1 ALIGN="CENTER">A Sample FORM using POST</h1>
<form Action="fromTest.jsp" method="post">
Item Number:
<input type="text" name="itemNum"><br>
Quantity:
<input type="text" name="quantity"><br>
Price Each:
<input type="text" name="price" value=$><br>
<hr>
First Name:
<input type="text" name="firstName"><br>
Last Name:
<input type="text" name="lastname"><br>
Middle Initial:
<input type="text" name="intial"><br>
Shipping Address:
<textArea Name="address" rows=3 cols=40></textArea><br>
Credit Card:<br>
<input type="radio" Name="CardType" Value="Visa">Visa<br>
<input type="radio" name="CardType" Value="Master Card">Master Card<br>
<input type="radio" name="CardType" Value="Amex">American Express<br>
<input type="radio" name="CardType" Value="Discover">Discover<br>
<input type="radio" name="CardType" Value="Java SmartCard">Java SmartCard<br>
Credit Card Number:
<input type="password" name="CardNum"><br>
Repeat Credit Card Number:
<input type="password" name="CardNum"><br>
<Center>
<input type="submit" value="Sumbit Order"></Center>
</form>
</body>
</html>