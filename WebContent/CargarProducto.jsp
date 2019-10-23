<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Actualizar Producto</h1>
		
		<form action="ControladorProductos" method="get">
			
			<input type="hidden" name="instruccion" value="actualizar"></input>	
			<input type="hidden" name="CODIGOARTICULO" value="${productoActualizar.CODIGOARTICULO}"></input>	
		  <table>
		    
		    <tr>
		      <td><label for="SECCION">SECCIÓN: </label></td>
		      <td><input type="text" name="SECCION" id="SECCION" value="${productoActualizar.SECCION}" required></td>
		    </tr>
		    
		    <tr>
		      <td><label for="NOMBREARTICULO">NOMBREARTÍCULO: </label></td>
		      <td><input type="text" name="NOMBREARTICULO" id="NOMBREARTICULO" value="${productoActualizar.NOMBREARTICULO}" required></td>
		    </tr>
		    
		    <tr>
		      <td><label for="PRECIO">PRECIO: </label></td>
		      <td><input type="number" name="PRECIO" id="PRECIO" step="any" value="${productoActualizar.PRECIO}" required></td>
		    </tr>
		    
		    <tr>
		      <td><label for="FECHA">FECHA: </label></td>
		      <td><input type="text" name="FECHA" id="FECHA" value="${productoActualizar.FECHA}" required></td>
		    </tr>
		    
		    <tr>
		      <td> <label for="IMPORTADO">IMPORTADO:</label></td>
		      <td>
			      <select name="IMPORTADO" id="IMPORTADO">
			        <option>VERDADERO</option>
			        <option>FALSO</option>
			      </select>
		      </td>
		    </tr>
		    
		    <tr>
		      <td><label for="PAISDEORIGEN">PAÍSDEORIGEN: </label></td>
		      <td><input type="text" name="PAISDEORIGEN" id="PAISDEORIGEN" value="${productoActualizar.PAISDEORIGEN}" required></td>
		    </tr>
		    
		    <tr>
		      <td colspan="2" align="center"><input type="submit" name="button" id="button" value="Actualizar"></td>
		    </tr>
		    
		  </table>
		  
		</form>
	</body>
</html>