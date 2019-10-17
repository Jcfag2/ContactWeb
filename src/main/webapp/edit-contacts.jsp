<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modification de contact</title>
</head>
<body>
<h2>Modification du contact:</h2>

<form action="ModifierContactServlet2" method="POST" accept-charset="UTF-8">
Civilité<select name="civ" size="1">
<option>M
<option>Mme
<option>Mlle
<option>Dr
<option>Me
<option>Pr
</select>
<br>
<input name="id" id="id" size="20" value=${contact.id } hidden="">
Nom<input name="nom" id="nom" size="20" value=${contact.nom }>
<br>
Prénom<input name="prenom" id="prenom" size="20" value=${contact.prenom }>
<br>
<button type="submit">Modifier le contact</button>
</form>


<a href="index.jsp">Retour</a>
</body>
</html>