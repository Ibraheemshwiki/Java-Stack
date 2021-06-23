<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ok App</title>
</head>
<body>
	<div>
		<h2>New License</h2>
		<form:form action="/licenses" method="POST" modelAttribute="license">
			<div>
		        <form:label path="person">Person</form:label>
		        <form:select path="person">
		        <form:errors path="person"/>
		        <c:forEach items="${ persons }" var="p">
		        	<form:option value="${ p.id }">${ p.firstName } ${ p.lastName }</form:option>
		        </c:forEach>
		        </form:select>
		    </div>
			<div>
		        <form:label path="state">State</form:label>
		        <form:input path="state"/>
		        <form:errors path="state"/>
		    </div>
		    <div>
		        <form:label path="expirationDate">Expiration Date</form:label>
		        <form:input type="date" path="expirationDate"/>
		        <form:errors path="expirationDate"/>
		    </div>
		    <button>Add License</button>
		</form:form>
	</div>
</body>
</html>