<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		
	<link href="${urlPublic}/bootstrap/css/bootstrap.min.css" rel="stylesheet">		
	<link href="${urlPublic}/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
	<link href="${urlPublic}/css/local.css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<script>
	var demoButtons;

	function start () {
	  
	  // Add event "click" to "demo buttons"
	  demoButtons = document.querySelectorAll ('.js-modify');
	  for (var i = 0; i < demoButtons.length; i++) {
	    demoButtons[i].addEventListener ('click', toggleEffect);
	  }
	  
	  // Add event "click" to "save buttons"
	  var saveButtons = document.querySelectorAll ('.js-save');
	  for (var i = 0; i < saveButtons.length; i++) {
	    saveButtons[i].addEventListener ('click', toggleActive);
	  }
	  
	}

	// Toggle "effect" classes
	function toggleEffect () {
	  var target = document.querySelector (this.dataset.target);
	      target.dataset.effect = this.dataset.effect;
	  
	  for (var i= 0; i < demoButtons.length; i++) {
	    demoButtons[i].classList.remove ('active');
	  }
	  
	  toggleActive.call (this);
	}

	// Toggle "active" class
	function toggleActive () {
	  this.classList.toggle ('active');
	}

	// Invoke "start ()" function
	window.addEventListener ('load', start);
	</script>
		
	</head>

<body>
<jsp:include page="includes/menu.jsp"></jsp:include>

	<div class="row" style="padding-left:40px;">
		<div class="card">
  <img src="img_avatar.png" alt="Avatar" style="width:100%">
  <div class="container">
    <h4><b>Ingresar Paciente</b></h4> 
    <p>Ingresar datos para <br>expediente de paciente</p> 
  </div>
  <a href="/ademac/paciente/register">Ir</a>
</div>
	</div>
</body>