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
<spring:url value="/user/save" var="urlForm" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="${urlPublic}/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${urlPublic}/bootstrap/css/bootstrap-theme.css"
	rel="stylesheet">


</head>
<body>

	<jsp:include page="includes/menu.jsp"></jsp:include>

	<div class="container">
		<form:form action="${urlForm}" method="POST" modelAttribute="myUser">
			<div class="row">
				<div class="col-md-12">
					<div class="box box-primary">
						<div class="box-header">
							<h3 class="text-center header">Registro de usuarios</h3>
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
									<form:input id="password" path="password" name="password"
										type="text" placeholder="Contraseña" class="form-control" required="required" />
								</div>
							</div>
							<div class="row-fluid">
								<div class="form-group">
									<form:input id="email" path="email" name="email" type="email"
										placeholder="Correo ELectronico" class="form-control" required="required"  />
								</div>
							</div>
							<div class="row-fluid">
								<div class="form-group">
									<form:input id="telefono" path="telefono" name="telefono"
										type="text" placeholder="Telefono" class="form-control" required="required" />
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
									<label for="sel1">Tipo Empleado:</label> 
									<form:select id='tipoEmpleado' path="tipoEmpleado.id" name='tipoEmpleado' class="form-control" 
									required="required"  items="${idTipoEmpleado}" itemLabel="tipo"  itemValue="id">
										
									 </form:select> 
								</div>								
							</div>
							<div class="row-fluid">
								<div class="form-group has-feedback" style="align:center">
									<div class="form-check">
								 	   <form:checkbox path="habilitado" value="1" class="custom-control-input" id="exampleCheck1"/>
								 	   <label class="form-check-label" for="exampleCheck1">Habilitado</label>
								  </div>
									 									
								</div>
							</div>
							<div class="row-fluid">
								<div class="form-group has-feedback" style="align:center">
									<div class="form-check">
								 	   <form:select id="idEstablecimiento" path="establecimiento.id" class="form-control" items="${idEstablecimiento}"
								 	   itemLabel="nombre"  itemValue="id">
								 	    </form:select>
								  </div>
									 									
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
</html>