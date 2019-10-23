package servlet.prueba;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;



/**
 * Servlet implementation class controladorServlet
 */
@WebServlet("/controladorServlet")
public class controladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//establecer el dataSource
	@Resource(name="jdbc/productos")
	private DataSource miPool;

    /**
     * Default constructor. 
     */
    public controladorServlet() {
        // TODO Auto-generated constructor stub
    	super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//crear el objeto print writter
		PrintWriter salida=response.getWriter();
		response.setContentType("text/plain");
		 //crear coneccion 
		
		Connection miConeccion=null;
		Statement miStatement=null;
		ResultSet miResultSet=null;
		
		try {
			miConeccion= miPool.getConnection();
			String query ="SELECT * FROM productos";
			miStatement =miConeccion.createStatement();
			miResultSet= miStatement.executeQuery(query);
			
			while(miResultSet.next()) {
				
				String nombre_articulo=miResultSet.getString(3);
				
				salida.println(nombre_articulo);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
