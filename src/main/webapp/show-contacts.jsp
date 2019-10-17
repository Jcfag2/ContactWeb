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
	<c:forEach items="${contacts }" var="contacts">
	<tr><td>${contacts.id }</td>
		<td>${contacts.civilite }</td>
		<td>${contacts.nom }</td>
		<td>${contacts.prenom }</td>
		<td><a href="SupprimerContactServlet?id=${contacts.id }">Supprimer le contact</a></td>
		<td><a href="ModifierContactServlet?id=${contacts.id }">Modifier le contact</a></td>
	</tr>
	</c:forEach>
</table>
<a href="index.jsp">Retour</a>
</body>
</html>