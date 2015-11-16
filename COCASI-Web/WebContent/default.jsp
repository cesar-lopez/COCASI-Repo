<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="estilos/reset.css" rel="stylesheet" type="text/css"/>
	<%@include file="header.html" %>
	<link href="estilos/template.css" rel="stylesheet" type="text/css"/>
	<link href="estilos/default.css" rel="stylesheet" type="text/css"/>
<title>Default</title>
</head>
<body>
<div class="container">

<%-- Encabezado--%>
        <div class="page-header header">
                <h2 class="active">COCASI</h2>
                <p>Desarrollo del Software</p>
        </div>
         
        <%--Menu Navegacion  --%>
        <nav class="nav nav-pills">
            <ul class="nav navbar-nav">
                <li role="presentation" class="disabled"><a href="#">Inicio</a></li>
                <li><a href="login.jsp">Cerrar Sesion</a></li>
            </ul>
        </nav>
            
		 <%--Principal  --%>
		<div class="row">
		<div class="col-lg-12 col-md-12 principal">
		<a href="#"><div class="panel panel-default">
				<div class="panel-heading" style="background-color: #9074a5">
					<h3 class="panel-title">Cuentas</h3>
				</div>
				<div class="panel-body">
					<p>Para Gestionar Cuentas</p>
					<h5>Click Aqui!</h5>
				</div>
			</div></a> 
		<a href="#"><div class="panel panel-default">
				<div class="panel-heading" style="background-color: #20ac1a">
					<h3 class="panel-title">Fallas</h3>
				</div>
				<div class="panel-body">
					<p>Para Configurar Fallas</p>
					<h5>Click Aqui!</h5>
				</div>
			</div></a> 
		<a href="#"><div class="panel panel-default">
				<div class="panel-heading" style="background-color: #ff6a00">
					<h3 class="panel-title">Eventos</h3>
				</div>
				<div class="panel-body">
					<p>Para Gestionar Eventos</p>
					<h5>Click Aqui!</h5>
				</div>
			</div></a>
		 <a href="#"><div class="panel panel-default">
				<div class="panel-heading" style="background-color: #3ee1e6">
					<h3 class="panel-title">Reportes</h3>
				</div>
				<div class="panel-body">
					<p>Para Ver Reportes</p>
					<h5>Click Aqui!</h5>
				</div>
			</div></a>
			
			</div>
			</div>

		<%-- Pie de pagina--%>
      
       <footer>
             <hr />
                <small>Diseñado por: Robinson, Gretzi, Cesar y Willy - 2015</small><br />
                 <small>Todos los Derechos Reservados</small>
        </footer>
       
        
</div>


</body>
</html>