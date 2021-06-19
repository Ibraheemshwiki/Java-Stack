<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<style>
h3{
color : red;
}</style>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><br><br><br>
<h3><c:out value="${error}"/></h3>
<h2>What is the Code?</h2><br><br>
<form action="/code" method = "POST">
<input type = "text" placeholder = "Here if you dare" name = "code">
<input type = "submit" value = "Try Code">
</form>
</center>
</body>
</html>