<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:catch var="catchtheException">
 <%int x=2/0;%>
 </c:catch>
 
 <c:if test="${catchtheException!=null}">
 
 <p>The type of exception is:${catchtheException}<br>
 There is an exception:${catchtheException.message}</p>
 
 </c:if>

