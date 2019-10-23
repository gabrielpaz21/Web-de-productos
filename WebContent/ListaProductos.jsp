<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		
		<style>
			.cabecera{
				font-size:1.2em;
				font-weight:bold;
				color:#FFFFFF;
				background-color:#08088A;
			}
			
			.filas{
				
				text-align:center;
				background-color:#5882FA;
				
			}
			
			#contenedorBoton{
				
			
			}
			
			table{
				float:left;
			
			}
		
		</style>
	</head>
	<body>
	
		<table>
	
			<tr>
				<td class="cabecera">CÓDIGOARTÍCULO:</td>
				<td class="cabecera">SECCIÓN:</td>
				<td class="cabecera">NOMBREARTÍCULO:</td>
				<td class="cabecera">PRECIO:</td>
				<td class="cabecera">FECHA:</td>
				<td class="cabecera">IMPORTADO:</td>
				<td class="cabecera">PAÍSDEORIGEN:</td>
				<td class="cabecera">ACCION:</td>
			</tr>
			
			
			
			<c:forEach var="temPro" items="${losProductos}">
			
				<c:url var="linkTem" value="ControladorProductos" > 
				
					<c:param name="instruccion" value="cargar"></c:param>
					<c:param name="CODIGOARTICULO" value="${temPro.CODIGOARTICULO}"></c:param>
				
				</c:url>
				
				<c:url var="linkTemEliminar" value="ControladorProductos" > 
				
					<c:param name="instruccion" value="eliminar"></c:param>
					<c:param name="CODIGOARTICULO" value="${temPro.CODIGOARTICULO}"></c:param>
				
				</c:url>
				
				<tr >
				
					<td class="filas">${temPro.CODIGOARTICULO}</td>
					<td class="filas">${temPro.SECCION}</td>
					<td class="filas">${temPro.NOMBREARTICULO}</td>
					<td class="filas">${temPro.PRECIO}</td>
					<td class="filas">${temPro.FECHA}</td>
					<td class="filas">${temPro.IMPORTADO}</td>
					<td class="filas">${temPro.PAISDEORIGEN}</td>
					<td class="filas">><a href="${linkTem}">actualizar</a>&nbsp;  &nbsp;<a href="${linkTemEliminar}">eliminar</a></td> 			
					
				</tr>
			</c:forEach>	
		</table>
		
		<div id="contenedorBoton">
		
			<input type="button" value="Insertar Registro" onclick="window.location.href='inserta_producto.jsp'"/> 
		
		</div>

	</body>
</html>