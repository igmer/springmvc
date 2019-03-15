<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Clinica | Bienvenido</title>
<spring:url value="/resources" var="urlPublic" />
<spring:url value="/" var="urlRoot" />
<spring:url value="/paciente/save" var="urlForm" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="${urlPublic}/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${urlPublic}/bootstrap/css/bootstrap-theme.css"
	rel="stylesheet">


</head>
<body>

	<jsp:include page="../includes/menu.jsp"></jsp:include>

	<div class="container">
		<form:form action="${urlForm}" method="POST" modelAttribute="mntPaciente">
			<div class="row-fluid">
				<div class="col-md-12">
					<div class="box box-primary">
						<div class="box-header">
							<h3 class="text-center header">Registro de pacientes</h3>
						</div>
						<div class="box-body">
							<div class="row-fluid">
							  <form:hidden class="form-control" path="id"/>
								<div class="form-group">
									<form:input type="text" class="form-control" path="nombre"
										id="nombre" placeholder="Nombre" required="required" />
								</div>
							</div>
							<div class="row-fluid">
								<div class="form-group">
									<form:input type="text" class="form-control" path="apellido"
										id="apellido" placeholder="Apellido" required="required" />
								</div>
							</div>
							<div class="row-fluid">
								<div class="form-group">
									<form:input type="text" class="form-control" path="direccion"
										id="direccion" placeholder="Direccion" required="required" />
								</div>
							</div>
							<div class="row-fluid">
								<div class="form-group">
									<form:input type="text" class="form-control" path="fechaNacimiento"
										id="fechaNacimiento" placeholder="Fecha Nacimiento" required="required" />
								</div>
							</div>
							<div class="row-fluid">
								<div class="form-group has-feedback" style="align:center">
									<label for="sel1">Genero:</label> 
									<form:select id='sexo' path="sexo" name='sexo' class="form-control" required="required" >
										<form:option value="M">Masculino</form:option>
                						<form:option value="F">Femenino</form:option>
									 </form:select> 
								</div>								
							</div>
							<div class="row-fluid">
								<div class="form-group has-feedback" style="align:center">
									<label for="sel1">Estado Civil:</label> 
									<form:select id='estadoCivil' path="estadoCivil" name='estadoCivil' class="form-control" required="required" >
										<form:option value="1">Soltero</form:option>
                						<form:option value="2">Casado</form:option>
									 </form:select> 
								</div>								
							</div>
							<div class="row-fluid">
								<div class="form-group">
									<form:input type="text" class="form-control" path="ocupacion"
										id="ocupacion:" placeholder="ocupacion" required="required" />
								</div>
							</div>
							<div class="row-fluid">
								<div class="form-group">
									<form:input type="text" class="form-control" path="telefono"
										id="telefono:" placeholder="telefono" required="required" />
								</div>
							</div>
							<div class="row-fluid">
								<div class="form-group">
									<form:input type="text" class="form-control" path="lugarTrabajo"
										id="lugarTrabajo:" placeholder="Lugar de Trabajo" required="required" />
								</div>
							</div>
							
							
							
							
						
							<div class="row-fluid"><button type="submit" class="btn btn-primary">Guardar</button></div>
						</div>
					</div>
				</div>
			</div>
		</form:form>
	</div>
</body>
<script>
      $(function () {
         $("#fechaNacimiento").datepicker({dateFormat: 'dd-mm-yy'});       
        }
      );
    </script>
</html>