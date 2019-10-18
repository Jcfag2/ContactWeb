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
<br>
-----------------------------
<h3>Ajouter une adresse</h3>
<form action="AjouterAdressesServlet?id=${contact.id }" method="POST" accept-charset="UTF-8">
<input name="id2" id="id2" size="20" value=${contact.id } hidden="">
Rue<input name="rue" id="rue" size="20" value="rue">
<br>
Code Postal<input name="cp" id="cp" size="20" value="00000">
<br>
Ville<input name="ville" id="ville" size="20" value="ville">
<br>
Pays<input name="pays" id="pays" size="20" value="pays">
<br>
<button type="submit">Ajouter l'adresse</button>
</form>

<br>
-----------------------------
<br>
<a href="index.jsp">Retour à l'index</a><br>
<a href="AllContactsServlet">Voir tous les contacts</a>
</body>
</html>