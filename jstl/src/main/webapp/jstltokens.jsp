<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forTokens items="Rama-Sita-Rani" delims="-" var="name">
<c:out value="${name}"/><br>
</c:forTokens>