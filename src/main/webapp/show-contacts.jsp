<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Affichage des contacts</title>
</head>
<body>
<h2>Liste de contacts selon vos critères:</h2>
<c:forEach items="${contacts }" var="contact">
	<tr><td>${contact.nom }</td>
		<td>${contact.prenom }</td>
	</tr>
	</c:forEach>
</body>
</html>