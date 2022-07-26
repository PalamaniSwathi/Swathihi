<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
	<c:set var="url" value="0" scope="request"/>
	<c:if test="${url<1}">
	  <c:redirect url="test1.jsp"></c:redirect>
	</c:if>
	<c:if test="${url>1}">
	  <c:redirect url="jstlif.jsp"></c:redirect>
	  </c:if>