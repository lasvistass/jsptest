<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"      "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit SottoCategoria</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" />

<script src="../../webjars/jquery/3.4.1/js/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="../../webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>

 <link rel="stylesheet" href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
  <script src="http://code.jquery.com/jquery-1.8.3.js"></script>
  <script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
  <script>
$(function() {
    $( "#datepicker" ).datepicker(
    		{
    			 dateFormat: "dd/mm/yy",
                 showOtherMonths: true,
                 selectOtherMonths: true,
                 showButtonPanel: true,
                 changeMonth: true,
                 changeYear: true,
                 gotoCurrent: true,
    		}).datepicker("setDate", new Date());
});
</script>

</head>
<a class="btn btn-light" href="http://localhost:8080/Menu/List"
	role="button">Home</a>
<a class="btn btn-light" href="http://localhost:8080/SottoCategoria/listaSottoCategorie"
	role="button">Indietro</a>
	
<body>
	<div class="container">
		<spring:url value="/SottoCategoria/SaveSottoCategoria" var="saveURL" />
		<form:form modelAttribute="oggettoSottoCategoria" method="post" action="${saveURL}" cssClass="form">
			<form:hidden path="idSottoCategoria" />
		
			<div class="form-group">
				<label>Codice</label>
				<form:input path="codice" cssClass="form-control" id="codice" />
						<form:errors path="codice" cssClass="error"/>
			</div>

			<div class="form-group">
				<label>Sotto Categoria</label>
				<form:input path="sottoCategoria" cssClass="form-control" id="sottoCategoria" />
						<form:errors path="sottoCategoria" cssClass="error"/>
			</div>
			
			<div class="form-group">
				<label>Budget</label>
				<form:input path="budget" cssClass="form-control" id="budget" />
						<form:errors path="budget" cssClass="error"/>
			</div>
			
			<div class="form-group">
				<label>Budget Spesa</label>
				<form:input path="budgetSpesa" cssClass="form-control" id="budgetSpesa" />
						<form:errors path="budgetSpesa" cssClass="error"/>
			</div>
			
			
			<div class="form-group">
				<label>Area</label>
				<form:select path="area" cssClass="form-control" id="area">
					<form:option value="0">Seleziona un Area:</form:option>
					<form:options items="${elencoArea}" itemValue="idArea" itemLabel="area" />
				</form:select>
							<form:errors path="area" cssClass="error"/>
			</div>
			


			&nbsp;&nbsp;&nbsp;<button type="submit" class="btn btn-primary">Salva</button>
		</form:form>
	</div>

</body>

</html>