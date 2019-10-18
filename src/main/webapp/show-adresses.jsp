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
<h2>Liste des adresses de ${contact.prenom }  ${contact.nom } :</h2>

<table>
<c:forEach items="${adresse }" var="adresses">
		<tr><td>${adresses }</td></tr>
		</c:forEach>
</table>		



<a href="index.jsp">Retour à l'index</a><br>
<a href="AllContactsServlet">Voir tous les contacts</a>
</body>
</html>