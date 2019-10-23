package servlet.prueba;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class ControladorProductos
 */
@WebServlet("/ControladorProductos")
public class ControladorProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ModeloProductos modeloProducto;

	@Resource(name = "jdbc/productos")
	private DataSource miPool;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {

		try {
			modeloProducto = new ModeloProductos(miPool);

		} catch (Exception e) {
			throw new ServletException(e);
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// obtener parametro del formulario
		String caso = request.getParameter("instruccion");

		if (caso == null)
			caso = "listar";

		switch (caso) {
		case "listar":
			listarProductos(request, response);
			break;
		case "cargar":
			try {
				cargarProductos(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "insertar":
			insertarProductos(request, response);
			break;
		case "actualizar":
			try {
				actualizarProductos(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		case "eliminar":
			try {
				eliminarProducto(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}

	}

	private void eliminarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String CODIGOARTICULO = request.getParameter("CODIGOARTICULO");
		
		modeloProducto.eliminarProducto(CODIGOARTICULO);
		
		listarProductos(request, response);
	}

	private void actualizarProductos(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String CODIGOARTICULO = request.getParameter("CODIGOARTICULO");
		String SECCION = request.getParameter("SECCION");
		String NOMBREARTICULO = request.getParameter("NOMBREARTICULO");
		double PRECIO = Double.parseDouble(request.getParameter("PRECIO"));
		String FECHA = request.getParameter("FECHA");
		String IMPORTADO = request.getParameter("IMPORTADO");
		String PAISDEORIGEN = request.getParameter("PAISDEORIGEN");

		Productos productoActualizado = new Productos(CODIGOARTICULO, SECCION, NOMBREARTICULO, PRECIO, FECHA, IMPORTADO,
				PAISDEORIGEN);

		modeloProducto.actualizarProducto(productoActualizado);

		listarProductos(request, response);
	}

	private void cargarProductos(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String CODIGOARTICULO = request.getParameter("CODIGOARTICULO");

		Productos elProducto = modeloProducto.getProductoCargar(CODIGOARTICULO);

		request.setAttribute("productoActualizar", elProducto);

		RequestDispatcher miDispatcher = request.getRequestDispatcher("/CargarProducto.jsp");

		miDispatcher.forward(request, response);

	}

	private void insertarProductos(HttpServletRequest request, HttpServletResponse response) {

		String CODIGOARTICULO = request.getParameter("CODIGOARTICULO");
		String SECCION = request.getParameter("SECCION");
		String NOMBREARTICULO = request.getParameter("NOMBREARTICULO");
		double PRECIO = Double.parseDouble(request.getParameter("PRECIO"));
		String FECHA = request.getParameter("FECHA");
		String IMPORTADO = request.getParameter("IMPORTADO");
		String PAISDEORIGEN = request.getParameter("PAISDEORIGEN");

		Productos productoNuevo = new Productos(CODIGOARTICULO, SECCION, NOMBREARTICULO, PRECIO, FECHA, IMPORTADO,
				PAISDEORIGEN);

		modeloProducto.agregarElNuevoProducto(productoNuevo);

		listarProductos(request, response);

	}

	private void listarProductos(HttpServletRequest request, HttpServletResponse response) {

		List<Productos> productos;

		try {

			// obtener la lista de productos del modelo
			productos = modeloProducto.getProductos();

			// agregar la lista de productos al request
			request.setAttribute("losProductos", productos);

			// enviar ese request a la pagina jsp
			RequestDispatcher miDispatcher = request.getRequestDispatcher("/ListaProductos.jsp");

			miDispatcher.forward(request, response);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
