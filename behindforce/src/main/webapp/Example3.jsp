<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Example3</title>
</head>
<body>
<table border=3>
<tr><th>Course</th>
<th>Duration</th></tr>
<%
String[]course={"OOAD","JAVA","Internet","Web"};
int[]durn={2,4,3,2};
for(int i=0;i<course.length;i++)
{%>
<tr>
<td><%=course[i] %></td>
<td><%=durn[i] %></td>
</tr>
<%} %>
</table>

</body>
</html>