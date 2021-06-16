<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="css/style.css" rel="stylesheet" ></link>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="js/datejs.js"></script>
</head>
<body>
<h1>
		<c:out value="${dayFormat}" />
		, the 

		<c:out value="${date}" />
		
	</h1>
</body>
</html>