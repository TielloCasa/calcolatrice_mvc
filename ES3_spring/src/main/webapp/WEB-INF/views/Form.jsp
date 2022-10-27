<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>
<center>
<form method="post" action="dati">
  <label for="fname">Primo numero :</label><br>
  <input type="text" id="fname" name="num1"><br>
  <label for="lname">Secondo numero :</label><br>
  <input type="text" id="lname" name="num2"><br>
  <input type="submit" value="Somma">
</form>
</center>
</body>
</html>