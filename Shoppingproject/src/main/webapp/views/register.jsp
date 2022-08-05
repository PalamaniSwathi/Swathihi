<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<style>
body{
background-image:url("https://th.bing.com/th/id/R.35a92a99df5d5d51b037ba5fa9102e04?rik=l8fTY2vSouRekg&riu=http%3a%2f%2fwallpapercave.com%2fwp%2fshDUNb6.jpg&ehk=OEaGJ47fyGcv%2bpBW%2bZqcgwoX9jjKlGcmDGGKPdqiKcw%3d&risl=&pid=ImgRaw&r=0");
background-size:cover;
}
</style>
<center>
<h1>Register form</h1>

<form:form action="/sc/reg" method="POST" modelAttribute="userObj">

	UserName:<form:input path="name"/><br>
	<form:errors path="name"></form:errors><br>
	PassWord:<input type="password" name="pass"/><br>
	Re-Enter PassWord:<input type="password" name="pass2"/><br>
	City:<form:input path="city"/><br>
	Flag:<form:input path="flag"/><br>	
	Address:<form:input path="address"/><br>	
	PhoneNumber:<form:input path="phonenumber"/><br>
		
	<input type="submit" value="click...">
</form:form></center>



