<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="/form/register" method="POST" modelAttribute="userObj">
	UserId:<form:input path="uid"/><br>
	UserName:<form:input path="uname"/><br>
	<form:errors path="uname"></form:errors><br>
	PassWord:<input type="password" name="pass1"/><br>
	Re-Enter PassWord:<input type="password" name="pass2"/><br>
	City:<form:input path="city"/><br>
	Flag:<form:input path="flag"/><br>	
	Address:<form:input path="address"/><br>	
	PhoneNumber:<form:input path="phonenumber"/><br>
	Image:<form:input type="file" path="image"/><br>		
	<input type="submit" value="click...">
</form:form>






