<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Add Image Detail</h1>
<div align="center">
<form action="AddImage" method="post" enctype="multipart/form-data">
<input type="text" name="imageName" >
Select Image:
<input type="file" name="">
<input type="submit" value="Add Image">
</form>
</div>
</body>
</html>