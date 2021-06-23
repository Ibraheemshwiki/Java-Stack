<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ok App</title>
</head>
<body>
	<div>
		<nav>
			<h2>
				<a href="/new">Add Person</a> | <a href="/licenses/new">Add
					License</a>
			</h2>
		</nav>
		<table>
			<thead>
				<tr>
					<th>Name</th>
					<th>License #</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ persons }" var="person">
					<tr>
						<td>${ person.firstName }${ person.lastName }</td>
						<td>${ person.license.getNumberAsString() }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>