<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.container{
display:flex;
flex-direction:column;
width:337px;
height:420px;
border: 1px solid black;
padding : 25px;
margin-top: 9%;
}
body{
display:flex;
justify-content:center;
}
.yes{
display:flex;
justify-content:space-between;}
h3 {
  text-decoration: underline;
}
a{
float:right;
}
</style>
</head>
<body>
	<div class="container">
		<div>
			<h3>Submitted Info</h3>
		</div>
		<div class = "yes">
			<div>
				<h4>Name:</h4>
				<h4>Dojo Location:</h4>
				<h4>Favorite Language:</h4>
				<h4>Comments:</h4>
			</div>
			<div>
				<h4>
					<c:out value="${name}" />
				</h4>
				<h4>
					<c:out value="${location}" />
				</h4>
				<h4>
					<c:out value="${lang}" />
				</h4>
				<h4>
					<c:out value="${comment}" />
				</h4>
			</div>

		</div>
		<div><br><br><br><a href = "/"> Go Back</a></div>
	</div>
</body>
</html>