<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2> enter email details to send.....</h2>
<form action="sendEmail" method="post">
email<input type="text" name="email"/>
subject<input type="text" name="subject"/>
body<textarea id="body" name="body" rows="4" cols="50">
hey baby location id is: ${location.id } name is: ${location.name } code is ${location.code } and type is: ${location.type }
  </textarea>
<input type="submit" value="send"/>
</form>
${msg }
</div>
</body>
</html>