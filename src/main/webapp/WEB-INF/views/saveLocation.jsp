<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<%@include file="menu.jsp" %>
<h2>enter location details to save.....</h2>
<form action="saveLoc" method="post">
<pre>
id<input type="text" name="id"/>
name<input type="text" name="name"/>
code<input type="text" name="code"/>
type
urban<input type="radio" name="type" value="urban"/>
rural<input type="radio" name="type" value="rural"/>
<input type="submit" name="save"/>
</pre>
</form>
${msg }
</div>
</body>
</html>