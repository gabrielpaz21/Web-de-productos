package servlet.prueba;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class ModeloProductos {
	
	private DataSource origenDatos;
	
	public ModeloProductos(DataSource origenDatos) {
		
		this.origenDatos=origenDatos;
	}
	
	
	public List<Productos> getProductos() throws Exception {
		
		List<Productos> misProductos = new ArrayList<Productos>();
		
		Connection miConeccion =null;
		Statement miStatement =null;
		ResultSet miResultSet =null;
		
		// establecer la coneccion
		miConeccion=origenDatos.getConnection();
		
		//crear sentencia y Statement
		String query ="SELECT * FROM productos";
		miStatement =miConeccion.createStatement();
		
		//ejecutar query
		miResultSet=miStatement.executeQuery(query);
		
		while(miResultSet.next()) {
			
			String CODIGOARTICULO=miResultSet.getString("CODIGOARTICULO");
			String	SECCION=miResultSet.getString("SECCION");
			String NOMBREARTICULO=miResultSet.getString("NOMBREARTICULO");
			double PRECIO=miResultSet.getDouble("PRECIO");
			String FECHA=miResultSet.getString("FECHA");
			String IMPORTADO=miResultSet.getString("IMPORTADO");
			String PAISDEORIGEN=miResultSet.getString("PAISDEORIGEN");
			
			
			Productos temPro=new Productos(CODIGOARTICULO, SECCION,
					NOMBREARTICULO, PRECIO,FECHA,IMPORTADO,PAISDEORIGEN);
			
			misProductos.add(temPro);
		}
		
		return misProductos;
	}


	public void agregarElNuevoProducto(Productos productoNuevo) {
		
		Connection miConeccion = null;
		
		PreparedStatement miStatement =null;
		
		try {
			//obtener la coneccion
			miConeccion=origenDatos.getConnection();
			
			// crear la query para ejecutarla
			String query = "INSERT INTO productos (CODIGOARTICULO,SECCION,NOMBREARTICULO,PRECIO,FECHA,IMPORTADO,PAISDEORIGEN) VALUES (?,?,?,?,?,?,?)";
			
			// EXECURTAR LA QUERY PREPARADA 
			miStatement=miConeccion.prepareStatement(query);
			
			// establecer la query preparada 	//establecer parametros para el producto
			miStatement.setString(1, productoNuevo.getCODIGOARTICULO());
			miStatement.setString(2, productoNuevo.getSECCION());
			miStatement.setString(3, productoNuevo.getNOMBREARTICULO());
			miStatement.setDouble(4, productoNuevo.getPRECIO());
			miStatement.setString(5, productoNuevo.getFECHA());
			miStatement.setString(6, productoNuevo.getIMPORTADO());
			miStatement.setString(7, productoNuevo.getPAISDEORIGEN());
			
			miStatement.execute();
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}		
	
	}

	public Productos getProductoCargar(String cODIGOARTICULO){
		
		Productos elProducto=null;
		Connection miConeccion =null;
		PreparedStatement miStatement =null;
		ResultSet miResultSet=null;
		try {

			miConeccion=origenDatos.getConnection();
			String query="SELECT * FROM productos WHERE CODIGOARTICULO=?";
			miStatement=miConeccion.prepareStatement(query);
			miStatement.setString(1,cODIGOARTICULO);
			miResultSet=miStatement.executeQuery();
			if(miResultSet.next()) {
				
				String	CODIGOARTICULO=miResultSet.getString("CODIGOARTICULO");
				String	SECCION=miResultSet.getString("SECCION");
				String NOMBREARTICULO=miResultSet.getString("NOMBREARTICULO");
				double PRECIO=miResultSet.getDouble("PRECIO");
				String FECHA=miResultSet.getString("FECHA");
				String IMPORTADO=miResultSet.getString("IMPORTADO");
				String PAISDEORIGEN=miResultSet.getString("PAISDEORIGEN");
				elProducto=new Productos(CODIGOARTICULO,SECCION,NOMBREARTICULO,PRECIO,FECHA,IMPORTADO,PAISDEORIGEN);
			}else {
				
				throw new Exception("no hemos encontrado el producto con codigo articulo="+cODIGOARTICULO);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return elProducto;
	}


	public void actualizarProducto(Productos productoActualizado) throws Exception {
		
		Connection miConeccion =null;
		PreparedStatement miStatement =null;
		
		miConeccion=origenDatos.getConnection();
		String query="UPDATE productos SET SECCION=?,NOMBREARTICULO=?,PRECIO=?,FECHA=?,IMPORTADO=?,PAISDEORIGEN=? WHERE CODIGOARTICULO=?";
		miStatement=miConeccion.prepareStatement(query);
		miStatement.setString(1, productoActualizado.getSECCION());
		miStatement.setString(2, productoActualizado.getNOMBREARTICULO());
		miStatement.setDouble(3, productoActualizado.getPRECIO());
		miStatement.setString(4, productoActualizado.getFECHA());
		miStatement.setString(5, productoActualizado.getIMPORTADO());
		miStatement.setString(6, productoActualizado.getPAISDEORIGEN());
		miStatement.setString(7, productoActualizado.getCODIGOARTICULO());
		miStatement.execute();
	}


	public void eliminarProducto(String cODIGOARTICULO) {
		Connection miConeccion=null;
		PreparedStatement miStatement=null;
		
		
		try {
			miConeccion =origenDatos.getConnection();
			String query ="DELETE FROM productos WHERE CODIGOARTICULO=?";
			miStatement =miConeccion.prepareStatement(query);
			miStatement.setString(1, cODIGOARTICULO);
			miStatement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
