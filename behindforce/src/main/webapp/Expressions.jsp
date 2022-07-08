<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expressions</title>
</head>
<body>
<Table border=2>
<tr>
<th>Message</th>
<th>Result</th>
</tr>
<tr>
<td>SQRT of 4</td>
<td><%=Math.sqrt(2) %></td>
</tr>
<tr>
<td> Current time</td>
<td><%=new java.util.Date() %></td>
</tr>
<tr>
<td>Your hostname</td>
<td><%=request.getRemoteHost() %></td>
</tr>
<tr>
<td>Port:</td>
<td><%=request.getRemotePort() %></td>
</tr>
<tr>
<td>Schema</td>
<td><%=request.getScheme() %></td>
</tr>
<tr>
<td>Address</td>
<td><%=request.getServerName() %></td>
</tr>
</Table>


</body>
</html>