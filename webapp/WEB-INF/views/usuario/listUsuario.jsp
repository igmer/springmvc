<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
		
	<link href="${urlPublic}/bootstrap/css/bootstrap.min.css" rel="stylesheet">		
	<link href="${urlPublic}/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
	
	</head>

<body>
	<jsp:include page="../includes/menu.jsp"></jsp:include>
	<div class="row" style="text-align: center" class="col-md-12 row-fluid" >
	<c:if test="${msg !=null }">        
        		<div class='alert alert-success fade in alert-dismissible' role='alert'>${msg}
        			<button class="close" type="button" data-dismiss="alert">x</button>
        		</div>
        </c:if>
		<h3>Lista de Usuarios</h3>
	</div>
	<div class="table-responsive">
	        <table class="table table-hover table-striped table-bordered">
	          <tr>
	              <th>Nombre</th>
	              <th>Correo</th>
	              <th>Sexo</th>
	              <th>Habilitado</th>
	              <th>Telefono</th>
	              <th>Tipo Empleado</th>
	              <th>Establecimiento</th>
	              <th>Opciones</th>
	          </tr>
	
				<c:forEach var="usuario" items="${usuarios}">
					<tr>
						<td>${usuario.nombre}</td>
						<td>${usuario.email}</td>
						<td>${usuario.sexo}</td>
						<c:choose>
							<c:when test="${usuario.habilitado eq 1}">
								<td><span class="label label-success">SI</span></td>
							</c:when>
							<c:otherwise>
								<td><span class="label label-danger">NO</span></td>
							</c:otherwise>
						</c:choose>
						<td>${usuario.telefono}</td>
						<td>${usuario.tipoEmpleado.tipo}</td>
						<td>${usuario.establecimiento.nombre}</td>
						<td>
							<a href="${urlPeliculas}/comasagua/user/edit/${usuario.id}" class="btn btn-success btn-sm" role="button" title="Edit"><span class="glyphicon glyphicon-pencil"></span></a>
							<a href="${urlPeliculas}/comasagua/user/delete/${usuario.id}" onclick='return confirm("�Estas seguro?")' class="btn btn-danger btn-sm" role="button" title="Eliminar"><span class="glyphicon glyphicon-trash"></span></a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>

</body>
</html>