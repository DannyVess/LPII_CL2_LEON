package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DaoImp.ClassProveedorcl2Imp;
import Model.TblProveedorcl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProveedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProveedor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//instanciamos las respectivas clases....
		ClassProveedorcl2Imp crudimp=new ClassProveedorcl2Imp();
		//recuperamos el listado de proveedores de la bd...
		List<TblProveedorcl2> listadoproveedor=crudimp.ListadoProveedorcl2();
		//enviamos hacia la vista...
		//almacenamos en el respectivo metodo...
		System.out.println("Lista de proveedores: " + listadoproveedor);
		request.setAttribute("listado", listadoproveedor);
		//redireccionamos hacia la vista .jsp
		request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
	}  // fin del metodo doget

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
