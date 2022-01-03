<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ListaSottoCategorie</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<a class="btn btn-light" href="http://localhost:8080/Menu/List" role="button">Indietro</a> 
<body>
	<div class="container">
		<h2>List SottoCategorie</h2>
		<table class="table table-striped">
			<thead>
				<th scope="row">Id</th>
				<th scope="row">Codice</th>
				<th scope="row">Sotto Categoria</th>
				<th scope="row">Budget</th>
				<th scope="row">Budget Spesa</th>
				<th scope="row">Area</th>
				<th></th>
				<th></th>
			</thead>
			<tbody>
				<c:forEach items="${elencoSottoCategorie}" var="elenco">
					<tr>
						<td>${elenco.idSottoCategoria}</td>
						<td>${elenco.codice}</td>
						<td>${elenco.sottoCategoria}</td>
						<td>${elenco.budget}</td>
						<td>${elenco.budgetSpesa}</td>
						<td>${elenco.area.area}</td>
						<td><spring:url value="/SottoCategoria/EditSottoCategoria/${elenco.idSottoCategoria}" var="editURL"/><a href="${editURL}" role="button" class="btn btn-primary">Modifica</a></td>
						<td><spring:url value="/SottoCategoria/DeleteSottoCategoria/${elenco.idSottoCategoria}" var="deleteURL"/><a href="${deleteURL}" role="button" class="btn btn-primary">Elimina</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<spring:url value="/SottoCategoria/AddEditSottoCategoria/" var="addURL"/><a href="${addURL}" role="button" class="btn btn-primary">Nuova SottoCategoria</a>
	</div>

</body>
</html>