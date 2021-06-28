<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<style>
.head {
	display: flex;
	justify-content: space-evenly;
	padding: 30px;
	font-size: 48px;
}

.table {
	align-items: center;
	width: 90%;
}

.table th, td {
	font-size: 32px;
	padding: 0 80px;
}
</style>
</head>
<body>
	<div class="head">

		<a href="/song/new">New Song</a> <a href="/topTen">Top Songs</a>
		<form action="/search">

			<input type="text" name="artist"> <input type="submit"
				value="New Search">
		</form>

	</div>

	<table class="table">
		<tr>
			<th>Name</th>
			<th>Rating</th>
			<th>Actions</th>
		</tr>
		<c:forEach items="${songs}" var="song">
			<tr>
				<td><a href = "/song/${song.id}">${song.title}</a></td>
				<td>${song.rating}</td>
				<td><a href = "lookifies/delete/${song.id}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>