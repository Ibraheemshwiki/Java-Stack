<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
<style>
.firstRow {
display:flex;
justify-content:space-between;
}
#btn {
float:right;
}
.container{
display:flex;
flex-direction:column;
justify-content:center;
width:337px;
height:420px;
border: 2px solid black;
padding : 10px;
margin-top: 9%;
}
body{
display:flex;
justify-content:center;
}
</style>
</head>
<body>
	<div class="container">
		<form action="/apply" method = "POST">
			<div class="firstRow">
				<div>
					<h4>Your Name:</h4>
					<h4>Dojo Location:</h4>
					<h4>Favorite Language:</h4>
				</div>
				<div>
					<br><input type="text" name="name"><br> <br><select name="location">
						<option value="sanJose">San Jose</option>
						<option value="ramallah">Ramallah</option>
						<option value="germany">Germany</option>
					</select><br> <br><select name="lang">
						<option value="python">Python</option>
						<option value="doth">Dothraki</option>
						<option value="java">Java</option>
					</select><br><br>
				</div>
			</div>
			<div class="secondRow">
				<h4>Comment (optional):</h4>
				<br>
				<textarea name="comment" rows = "7" cols = "40"></textarea>
			</div><br>
			<div class="thirdRow">
				<input type="submit" value="Button" id="btn">
			</div>
		</form>
	</div>
</body>
</html>