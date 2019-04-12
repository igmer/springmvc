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
<spring:url value="/resources" var="urlPublicRes" />
<link href="${urlPublic}/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${urlPublic}/bootstrap/css/bootstrap-theme.css"
	rel="stylesheet">
	<link href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css"
	rel="stylesheet">
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="${urlPublicRes}/bootstrap/js/bootstrap.js"></script> 
	<script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	
	    <script type="text/javascript">
	$(document).ready(function() {
		$('#tablas').DataTable( {
	        "language": {
	            "lengthMenu": "Display _MENU_ records per page",
	            "zeroRecords": "Nothing found - sorry",
	            "info": "Showing page _PAGE_ of _PAGES_",
	            "infoEmpty": "No records available",
	            "infoFiltered": "(filtered from _MAX_ total records)"
	        }
	    } );

        }); 
	</script>

</head>

<body>
	<jsp:include page="../includes/menu.jsp"></jsp:include>
	<div class="row" style="text-align: center" class="col-md-12 row-fluid">
		<c:if test="${msg !=null }">
			<div class='alert alert-success fade in alert-dismissible'
				role='alert'>${msg}
				<button class="close" type="button" data-dismiss="alert">x</button>
			</div>
		</c:if>
		<h3>Lista de pacientes</h3>
	</div>
	<div class="row-fluid" style="margin-left: 40px; margin-right: 40px;"">
		<div class="row-fluid" style="margin-top: 50px;">
			<div class="table-responsive">
				<table id="tablas"class="table table-hover table-striped table-bordered">
					<tr>
						<th>Nombre</th>
						<th>Sexo</th>
						<th>Expediente</th>
						<th>Fecha Nacimiento</th>
						<th>Telefono</th>
						<th>Direccion</th>
						<th>Opciones</th>
						<th>Crear</th>
					</tr>

					<c:forEach var="paciente" items="${pacientes}">
						<tr>
							<td>${paciente.nombre}${paciente.apellido}</td>

							<td>${paciente.sexo}</td>

							<td>${paciente.expediente}</td>
							<td>${paciente.fechaNacimiento}</td>
							<td>${paciente.telefono}</td>
							<td>${paciente.direccion}</td>

							<td><a
								href="${urlPeliculas}/ademac/paciente/cita/${paciente.id}"
								class="btn btn-primary btn-sm" role="button" title="Cita"><span
									class="glyphicon glyphicon-calendar"></span></a> <a
								href="${urlPeliculas}/ademac/paciente/consulta/${paciente.id}"
								class="btn btn-info btn-sm" role="button" title="Consulta"><span
									class="glyphicon glyphicon-folder-open"></span></a></td>
							<td><a
								href="${urlPeliculas}/ademac/paciente/edit/${paciente.id}"
								class="btn btn-success btn-sm" role="button" title="Editar"><span
									class="glyphicon glyphicon-pencil"></span></a> <a
								href="${urlPeliculas}/ademac/paciente/delete/${paciente.id}"
								onclick='return confirm("¿Estas seguro?")'
								class="btn btn-danger btn-sm" role="button" title="Eliminar"><span
									class="glyphicon glyphicon-trash"></span></a></td>

						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>

</body>
</html>