<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, td, th{
border: 2px outset black;
border-radius:8px;
padding: 40px;
}

th,td{

font-size:36px;
}
</style>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
<h1><a href = "/dashboard">Dashboard</a></h1>
<table>
<tr>
<th>Title</th>
<td><c:out value="${song.title}"/></td>
</tr>

<tr>
<th>Artist</th>
<td><c:out value="${song.artist}"/></td>
</tr>

<tr>
<th>Rating(1~10)</th>
<td><c:out value="${song.rating}"/></td>
</tr>

</table>
</body>
</html>