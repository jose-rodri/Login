<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<title>Resgistro</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="./css/main.css">
</head>
<body class="cover" style="background-image: url(./assets/img/loginFont.jpg);">
	<form action="ServletRegistroUsuario" method="post"   class="full-box logInForm">
		<p class="text-center text-muted"><i class="zmdi zmdi-account-circle zmdi-hc-5x"></i></p>
		<p class="text-center text-muted text-uppercase">CREAR CUENTA NUEVA</p>
		
		 
		
		<div class="form-group label-floating">
		  <label class="control-label" for="">Nombre</label>
		  <input class="form-control" id="" name="txtnombre" type="text">
		  <p class="help-block">Ingresa tú Nombre</p>
		</div>
		
		<div class="form-group label-floating">
		  <label class="control-label" for="">Apellido</label>
		  <input class="form-control" id="" name="txtapellido" type="text">
		  <p class="help-block">Ingresa tú Apellido</p>
		</div>
		
		
		
		<div class="form-group label-floating">
		  <label class="control-label" for="">Email</label>
		  <input class="form-control" id=""  name="txtemail" type="text">
		  <p class="help-block">Ingresa tú Email</p>
		</div>
		
		
		<div class="form-group label-floating">
		  <label class="control-label" for="">Movil</label>
		  <input class="form-control" id="" name="txtmovil" type="text">
		  <p class="help-block">Ingresa tú Movil</p>
		</div>
		
		<div class="form-group label-floating">
		  <label class="control-label" for="">Dni</label>
		  <input class="form-control" id="" name="txtdni" type="text">
		  <p class="help-block">Ingresa tú Dni</p>
		</div>
		
		<div class="form-group label-floating">
		  <label class="control-label" for="">Clave</label>
		  <input class="form-control" id="" name="txtclave" type="text">
		  <p class="help-block">Ingresa tú Clave</p>
		</div>
		
		
		
		
		<div class="form-group text-center">
		 <input type="hidden" name="accion" value="1">
			<input type="submit" value="Crear cuenta" class="btn btn-raised btn-danger">
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