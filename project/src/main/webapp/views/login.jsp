<h1>Welcome Login</h1>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/form/register1" method="POST">

	Name:<input type="text" name="uname" required="required"><br>
	Password:<input type="password" name="pass" required="required"><br>
	<input type="submit" value="click...">
	
</form:form>