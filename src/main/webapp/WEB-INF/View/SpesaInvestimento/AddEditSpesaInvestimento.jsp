<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"      "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit SpesaInvestimento</title>
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
<a class="btn btn-light" href="http://localhost:8080/SpesaInvestimento/listaSpesaInvestimento"
	role="button">Indietro</a>
	
<body>
	<div class="container">
		<spring:url value="/SpesaInvestimento/SaveSpesaInvestimento" var="saveURL" />
		<form:form modelAttribute="oggettoSpesaInvestimento" method="post" action="${saveURL}" cssClass="form">
			<form:hidden path="idSpesaInvestimento" />
		
			<div class="form-group">
				<label>SpesaInvestimento</label>
				<form:input path="spesaInvestimento" cssClass="form-control" id="spesaInvestimento" />
						<form:errors path="spesaInvestimento" cssClass="error"/>
			</div>
		
			<div class="form-group">
				<label>Sotto Categoria</label>
				<form:select path="sottoCategoria" cssClass="form-control" id="sottoCategoria">
					<form:option value="0">Seleziona una SottoCategoria:</form:option>
					<form:options items="${elencoSottoCategorie}" itemValue="idSottoCategoria" itemLabel="sottoCategoria" />
				</form:select>
							<form:errors path="sottoCategoria" cssClass="error"/>
			</div>
			


			&nbsp;&nbsp;&nbsp;<button type="submit" class="btn btn-primary">Salva</button>
		</form:form>
	</div>

</body>

</html>