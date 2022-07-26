<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:url value="test1.jsp" var="completeURL">  
 <c:param name="trackingId" value="786"/>  
 <c:param name="user" value="Sita"/>  
<c:out value="${completeURl}"></c:out>
</c:url>



