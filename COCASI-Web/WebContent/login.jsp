<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="estilos/reset.css" rel="stylesheet" type="text/css"/>
<%@include file="header.html" %>
	<link href="estilos/template.css" rel="stylesheet" type="text/css"/>
	<link href="estilos/login.css" rel="stylesheet" type="text/css"/>
<title>Login</title>
</head>
<body>
<div class ="container">
        <%-- Encabezado--%>
        <div class="page-header header">
                <h2 class="active">COCASI</h2>
                <p>Desarrollo del Software</p>
        </div>
          <%--Principal  --%>

		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8 bienvenido">
				<br />
				<h3>Bienvenido a COCASI</h3>
				<p>
					Conectate para gestionar fallas, cuentas, eventos y mas...
				</p>
			</div>
			<div class="col-md-2"></div>
		</div>
		<form id="login">
			<div class="form-group">
				<label for="usuarioTextBox">Usuario</label>
				<input type="text" class="form-control" id="nombre" placeholder="Nombre" name="usuarioTextBox">
			</div>
			<div class="form-group">
				<label for="contrasenaTextBox">Contraseña</label>
				<input type="password" class="form-control" id="contrasena" placeholder="Contraseña" name="contrasenaTextBox">
			</div>
			<button type="submit" class="btn btn-primary" value="Iniciar" formmethod="post" formaction="demo_post.asp">Iniciar</button>
		</form>
		<label></label>

		<%-- Pie de pagina--%>
       <br />
        <footer>
             <hr />
                <small>Diseñado por: Robinson, Gretzi, Cesar y Willy - 2015</small><br />
                 <small>Todos los Derechos Reservados</small>
        </footer>
   </div>
</body>
</html>