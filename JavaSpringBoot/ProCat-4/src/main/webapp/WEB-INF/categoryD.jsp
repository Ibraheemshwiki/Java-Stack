<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>categories</h1>


	<c:forEach items="${allCategoryProducts}" var="item">
		 <p><c:out value="${item.getName()}"/></p>
	</c:forEach>
	

<h2>
all categories
</h2>

<form action="/category/${thisCategoryId}" method="POST">
 <select name="cid" path="product">
	 <c:forEach items="${allNotCategoryProducts}" var="item">
	 <option value="${item.id}">${item.getName()}</option>
	 </c:forEach>
	 <input type="submit" value="submit"/>
 </select> 
 </form>
</body>
</html>