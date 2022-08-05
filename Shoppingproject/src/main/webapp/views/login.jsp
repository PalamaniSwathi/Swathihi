<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<center>
<style>
body{
background-image:url("https://images.freecreatives.com/wp-content/uploads/2016/04/Awesome-Website-Background1.jpg")}</style>
<h1>Welcome Login</h1>
<form:form action="/sc/forms1" method="POST">

	Name:<input type="text" name="name" required="required"><br><br>
	Password:<input type="password" name="pass" required="required"><br><br>
	<input type="submit" value="click...">
	
</form:form>
</center>