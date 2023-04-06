<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Bine ai venit in lumea Spring MVC!</h1>

	<P>Timpul pe server este: ${serverTime}.</p>

<%--	acesta este un action form care inregistreaza un user name--%>
	<form action="user" method="post">
		<P>Name: </p>
		<input type="text" name="userName"><br>
		<P>Phone number: </p>
		<input type="text" name="phoneNo"><br>
		<P>Email: </p>
		<input type="text" name="email"><br>
		<P>Address: </p>
		<input type="text" name="address"><br>
		<br>
		<input type="submit" value="Login">
	</form>
	<br>
	<a href="about">About</a>

</body>
</html>