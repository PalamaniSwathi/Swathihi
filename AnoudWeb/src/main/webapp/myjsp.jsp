<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form action="/bs/hello2" method="get">
  
User name:<form:input path="name"/>
Password:<form:input path="pass"/>
  <input type="submit" value="click...">

</form:form>