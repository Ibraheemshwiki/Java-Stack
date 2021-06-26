<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>
		<c:out value="${dojo}" />
	</h1>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
		</tr>
		<c:forEach items="${ dojoNinja }" var="p">
			<tr>
				<td>${p.firstName}</td>
				<td>${p.lastName}</td>
				<td>${p.age}</td>
			</tr>
		</c:forEach>
	</table>
	</center>
</body>
</html>