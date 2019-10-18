<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Affichage des contacts</title>
</head>
<body>
<h2>Liste de contacts selon vos critères:</h2>
<table>
	<c:forEach items="${contact.adresse }" var="contact">
	<tr><td>${adresse }</td>
	</tr>
	</c:forEach>
</table>
<a href="index.jsp">Retour</a>
</body>
</html>