<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%String x=(String) request.getAttribute("msj");
 String a="";
 if(x!=null)
 a=x;%>
    
    <!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="css3/estilo.css">

</head>
<body>
<section>

<h1> Pizzeria Rapida  </h1>

<div class="contenedor">

	<img src="img/logo.jpg" alt="">

	<form action="ServletUsuario" name="frmSesion" method="post">

		<div class="CajaTexto">
			
				<input type="text" name="txtLogin" placeholder="Nombre Recepción" required>

		</div>


		<div class="CajaTexto">
			

		<input type="password" name="txtPassword" placeholder="contraseña" required>


		</div>

		<input type="submit"  value="Login" class="botonlogin">


<h5 align="center"><%=a %></h5>
	</form>


</div>

</section>
</body>
</html>