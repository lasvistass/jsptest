<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddEditArea</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" />
<script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<a class="btn btn-light" href="http://localhost:8080/Menu/List" role="button">Home</a> 
<a class="btn btn-light" href="http://localhost:8080/Area/ListaAule" role="button">Indietro</a> 
<body>
	<div class="container">
		<spring:url value="/Area/SaveArea/" var="saveURL" />
		<h2>Add Edit Area</h2>
		<form:form modelAttribute="oggettoArea" method="post"
			action="${saveURL}" cssClass="form">
			<form:hidden path="idArea"/>
			<div class="form-group">
				<label>Codice</label>
				<form:input path="codice" cssClass="form-control" id="codice" />
					<form:errors path="codice" cssClass="error"/>
			</div>
			<div class="form-group">
			<label>Area</label>
			<form:input path="area" cssClass="form-control" id="area" />
			<form:errors path="area" cssClass="error"/>
			</div>
			<button type="submit" class="btn btn-primary">Salva</button>
		</form:form>
	</div>
</body>
</html>