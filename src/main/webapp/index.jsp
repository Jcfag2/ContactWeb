<html>
<title>Contacts</title>
<body>
<h2>Bienvenue!</h2>
<form action="AllContactsServlet" method="POST">
<button type="submit">Afficher tous les contacts</button>
</form>
<br>
================================================
<br>
<h2>Cr�er un contact</h2>
<form action="CreerContactServlet" method="POST">
Civilit�<select name="civ" size="1">
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
Pr�nom<input name="prenom" id="prenom" size="20">
<br>
<button type="submit">Cr�er le contact</button>
</form>
</body>
</html>
