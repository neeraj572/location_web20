<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<div align="center">
<h2>location details are....</h2>
Id: ${location.id }</br>
Name: ${location.name }</br>
Code: ${location.code }</br>
Type: ${location.type }</br></br></br>
<form action="saveLoc" method="post">
<pre>
<input type="text" name="id" value="${location.id }"/>
<input type="text" name="name" value="${location.name }"/>
<input type="text" name="code" value="${location.code }"/>
<input type="text" name="type" value="${location.type}"/>
<input type="submit" value="update"/>
</pre>
</form>
</br></br>
<form action="compose" method="post">
<pre>
<input type="hidden" name="id" value="${location.id }"/>
<input type="hidden" name="name" value="${location.name }"/>
<input type="hidden" name="code" value="${location.code }"/>
<input type="hidden" name="type" value="${location.type}"/>
<input type="submit" value="send email"/>
</pre>
</form>
</div>
</body>
</html>