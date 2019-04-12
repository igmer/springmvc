<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="../includes/menu.jsp"></jsp:include>
<script>
$( document ).ready(function() {
    console.log( "ready!" );
});
function buscarPaciente(){
	var nombre = $('#nombre').val();
	var apellidos = $('#apellidos').val();
	var expediente = $('#expediente').val();
	$.ajax({
        url: 'buscarPaciente',
        dataType: "json",
        type: "GET",
        contentType: 'application/json',
        mimeType: 'application/json',
        data: 'uname1=' + $('#nombre').val(),
        success: function(data){
              alert('success')
        },
        error: function(xhr, status, error) {
               console.log(error)
        }
    });

	
}
</script>
</head>
<body>

<h3 class="text-primary"><span class="fa fa-search"></span> Buscar Registro de Identificación de Personas</h3>

<div class="row">
<section class="content">
	
        <table class="table table-bordered cuadro">
            <tbody>                
                <tr>
                    
                    <td class="sonata-ba-list-field-header "><strong>Nombres: </strong></td>
                    <td><input id="nombre" name="cun" type="text" class="text form-control"></td>
                    <td class="sonata-ba-list-field-header "><strong>Apellidos:</strong></td>
                    <td><input id="apellidos" name="apellidos" class="nombres form-control" type="text" maxlength="25"></td>
                 </tr>
                
                <tr>
                    <td class="sonata-ba-list-field-header "><strong>Telefono:</strong></td>
                    <td><input id="cun" name="cun" type="text" class="fecha form-control"></td>
                    <td class="sonata-ba-list-field-header "><strong>Expediente:</strong></td>
                    <td><input id="expediente" name="expediente" class="nombres form-control" type="text" maxlength="25"></td>
                 

                      </td>
                      <td colspan="2" class="no-bottom-border">
                        <div class="pull-right">

                        <a id="capturar" class="btn btn-info" href="#" onclick="crearPacienteEpisodio()" style="display: none;">
                            <span class="glyphicon glyphicon-plus"></span>Capturar Datos
                        </a>

                            <button id="buscar" class="btn btn-primary" onclick="buscarPaciente()">
                                <span class="glyphicon glyphicon-search"></span>Buscar
                            </button>
                            <a id="limpiar" class="btn btn-primary" href="">
                                <span class="glyphicon glyphicon-trash"></span>Limpiar
                            </a>
                        </div>

                    </td>
                </tr>
            </tbody>
        </table>
            <input id="procedencia" name="procedencia" value="c" type="hidden">
    
    </section>
</div>

</body>
<style>
.content {
    min-height: 250px;
    padding: 15px;
    margin-right: auto;
    margin-left: auto;
    padding-left: 15px;
    padding-right: 15px;
}
</style>
</html>