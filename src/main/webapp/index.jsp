<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacts</title>
<body>
<h2>Bienvenue!</h2>
<form action="AllContactsServlet" method="POST" accept-charset="UTF-8">
<button type="submit">Afficher tous les contacts</button>
</form>
<br>
================================================
<br>
<h2>Créer un contact</h2>
<form action="CreerContactServlet" method="POST">
Civilité<select name="civ" size="1">
<option>M
<option>Mme
<option>Mlle
<option>Dr
<option>Me
<option>Pr
</select>
<br>
Nom<input name="nom" id="nom" size="20">
<br>
Prénom<input name="prenom" id="prenom" size="20">
<br>
<button type="submit">Créer le contact</button>
</form>
</body>
</html>
