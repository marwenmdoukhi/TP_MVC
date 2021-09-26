

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="Controller.php" method="post">

		<td>Mot Clé :</td>
		<td><input type="text" name="motcle" value="${modele.motcle}" /></td> <input
			type="submit" value="ok">

	</form>
	<table border="1" width="80%">
		<tr>
			<th>Id</th>
			<th>nom</th>
			<th>prix</th>
		</tr>
		<c:forEach items="${modele.produits}" var="p">

			<tr>
				<td>${p.idProduit }</td>
				<td>${p.nomProduit }</td>
				<td>${p.prix }</td>
			</tr>


		</c:forEach>
	</table>


</body>
</html>