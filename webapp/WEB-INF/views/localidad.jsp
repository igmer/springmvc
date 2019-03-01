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
	<title>CineSite | Bienvenido</title>
	<spring:url value="/resources" var="urlPublic" />
	<spring:url value="/" var="urlRoot" />	
		
	<link href="${urlPublic}/bootstrap/css/bootstrap.min.css" rel="stylesheet">		
	<link href="${urlPublic}/bootstrap/css/bootstrap-theme.css" rel="stylesheet">
	
	</head>

<body>
<jsp:include page="includes/menu.jsp"></jsp:include>

<table class="table-bordered">

</table>
</body>
</html>