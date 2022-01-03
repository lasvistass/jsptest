<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<head>
    <meta charset="ISO-8859-1">
    <title>Servizi</title>
    <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css"
          rel="stylesheet" />
    <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>

</head>



<body>
<div class="container text-center">
    <h2>Lista Servizi</h2> <br> <br>

    <a class="btn btn-light" href="http://localhost:8080/Area/listaAree" role="button">Lista Aree</a> <br> <br>
    <a class="btn btn-light" href="http://localhost:8080/SottoCategoria/listaSottoCategorie" role="button">Lista SottoCategorie</a> <br> <br>
    <a class="btn btn-light" href="http://localhost:8080/SpesaInvestimento/listaSpesaInvestimento" role="button">Lista SpesaInvestimento</a> <br> 
  
</div>

</body>
</html>