<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="header.html" %>
	<link href="estilos/template.css" rel="stylesheet" type="text/css"/>
	<link href="estilos/cuentas.css" rel="stylesheet" type="text/css"/>
<title>Cuentas</title>
</head>
<body>
<div class="container">
		<%-- Encabezado--%>
        <div class="page-header header">
                <h2 class="active">COCASI</h2>
                <p>Desarrollo del Software</p>
        </div>
        <nav class="nav nav-pills">
            <ul class="nav navbar-nav">
                <li><a href="default.jsp">Inicio</a></li>
                <li><a href="login.jsp">Cerrar Sesion</a></li>
            </ul>
        </nav>
         <%--Contenido dividido es dos bloques izq y der--%>
        <div class="row">

           <%-- Izquierda--%>
            
            <div class="col-lg-5 col-sm-12 col-md-12 col-xs-12">
                <h3>Cuenta</h3>
                    <div class="form-group-sm">
                        <label for="nombreTextBox" class="control-label">Nombre </label>
                       <input type="text" class="form-control" id="nombre" placeholder="Nombre" name="nombreTextBox">
                    </div>
                    <div class="form-group-sm">
                        <label for="apellidoTextBox" class="col-sm-2 control-label">Apellido </label>
                        <input type="text" class="form-control" id="apellido" placeholder="Apellido" name="apellidoTextBox">
                    </div>
                    <div class="form-group-sm">
                        <label for="loginTextBox" class="col-sm-2 control-label">Login </label>
                        <input type="text" class="form-control" id="login" placeholder="Login" name="loginTextBox">
                    </div>
                    <div class="form-group-sm">
                        <label for="contrasenaTextBox" class="col-sm-2 control-label">Contraseña </label>
                     	<input type="text" class="form-control" id="contrasena" placeholder="Contraseña" name="contrasenaTextBox">
                    </div>
                   </br>
                   <button id="crearButton" type="submit" class="btn btn-success" value="Crear" formmethod="post" formaction="Crear">Crear</button>
                   <button id="cancelarButton" type="submit" class="btn btn-danger" value="Cancelar" formmethod="post" formaction="Cancelar">Cancelar</button>
            </div>
           
            <%--Derecha--%>
            <div class="col-lg-7 col-sm-12 col-md-12 col-xs-12">
                <h3>Lista de Cuentas</h3>
                <table class="table table-bordered">
			<thead>
				<th>ID</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Departamento</th>
				<th>Acciones</th>
			</thead>
			<tbody>
				<c:forEach items="${usuarios}" var="usuario">
					<tr>
						<td><c:out value="${usuario.getIdUsuario()}"></c:out></td>
						<td><c:out value="${usuario.getRol().getNombre()}"></c:out></td>
						<td><c:out value="${usuario.getNombre()}"></c:out></td>
						<td><c:out
								value="${usuario.getApellido()}"></c:out></td>
						<td><a
							href="#"><span
								class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a> <a
							href="#"><span
								class="glyphicon glyphicon-trash" aria-hidden="true"></span></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
                   
                
            </div>

        </div>




    </div>
</body>
</html>