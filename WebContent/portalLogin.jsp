<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%String x=(String) request.getAttribute("msj");
 String a="";
 if(x!=null)
 a=x;%>
    
<!DOCTYPE html>
<html lang="es">
<head>
	<title>LogIn</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="./css/main.css">
</head>
<body class="cover" style="background-image: url(./assets/img/fondo.jpg);">
	<form action="ServletUsuario" name="frmSesion" method="post" autocomplete="off" class="full-box logInForm">
		<p class="text-center text-muted"><i class="zmdi zmdi-account-circle zmdi-hc-5x"></i></p>
		<p class="text-center text-muted text-uppercase">Inicia sesión con tu cuenta</p>
		
		
		
		
		<div class="form-group label-floating">
		  <label class="control-label" for="UserDani">DNI</label>
		  <input class="form-control" id="UserDani" type="text"  name="txtLogin">
		  <p class="help-block">Digita tú DNI</p>
		</div>
		
		
		<div class="form-group label-floating">
		  <label class="control-label" for="UserPass">Contraseña</label>
		  <input class="form-control" name="txtPassword" id="UserPass" type="text">
		  <p class="help-block">Escribe tú contraseña</p>
		</div>
		
		
		
		 <div class="form-row">
		<div class="form-group col-md-6">
			<input type="submit" value="Iniciar" class="btn btn-raised btn-danger">
				
		</div>
		<div class="form-group col-md-6">
			<a href="formulario.jsp"  class="btn btn-raised btn-danger" >Registrar</a>
				
		</div>
		
		</div>
		
	</form>
	<!--====== Scripts -->
	<script src="./js/jquery-3.1.1.min.js"></script>
	<script src="./js/bootstrap.min.js"></script>
	<script src="./js/material.min.js"></script>
	<script src="./js/ripples.min.js"></script>
	<script src="./js/sweetalert2.min.js"></script>
	<script src="./js/jquery.mCustomScrollbar.concat.min.js"></script>
	<script src="./js/main.js"></script>
	<script>
		$.material.init();
	</script>
</body>
</html>