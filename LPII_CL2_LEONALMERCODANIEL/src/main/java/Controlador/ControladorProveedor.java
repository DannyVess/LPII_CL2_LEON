package Controlador;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    }  //fin del constructor producto...

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//instanciamos la respectiva clase...
		ClassProveedorcl2Imp crudimp=new ClassProveedorcl2Imp();
		TblProveedorcl2 tblprov=new TblProveedorcl2();
		//recuperamos el listado de productos de la BD..
		List<TblProveedorcl2> listadoproveedor = crudimp.ListadoProveedorcl2();
		//enviamos hacia la vista...
		//almacenamos en el respectivo metodo...
		request.setAttribute("listado",listadoproveedor);
		
		//declaramos una variable de tipo string...
		//recibimos el valor segun la accion..
		String accion=request.getParameter("accion");
		//aplicamos una condicion...
		if(accion!=null){
			//aplicamos un switch..
			switch(accion){
			case "Modificar":
				//obtenemos el codigo
				int cod=Integer.parseInt(request.getParameter("cod"));
				//asignamos el codigo
				tblprov.setIdprooveedorcl2(cod);
				//buscamos el codigo a actualizar...
				TblProveedorcl2 prov=crudimp.BuscarProveedorcl2(tblprov);
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				//asignamos los valores
              //para enviarlos hacia la vista (formulario actualizar)
				request.setAttribute("codigo",prov.getIdprooveedorcl2());
				request.setAttribute("nombre",prov.getNomproveecl2());
				request.setAttribute("ruc",prov.getRucproveecl2());
				request.setAttribute("razonsocial",prov.getRsocialproveecl2());
				request.setAttribute("email",prov.getEmailproveecl2());
				request.setAttribute("fechaingreso",format.format(prov.getFeingproveecl2()));
				//redireccionamos
				request.getRequestDispatcher("/FrmActualizarProveedor.jsp").forward(request, response);
				//salimos
				break;
			case "Registrar":
				//redireccionamos hacia la vista(.jsp)
				request.getRequestDispatcher("/FrmRegistrarProveedor.jsp").forward(request, response);
				//salimos
				break;
			case "Eliminar":
				//obtenemos el codigo
				int codelim=Integer.parseInt(request.getParameter("cod"));
				//asignamos el codigo
				tblprov.setIdprooveedorcl2(codelim);
				//invocamos al metodo a eliminar...
				crudimp.EliminarProveedorcl2(tblprov);
				List<TblProveedorcl2> listado=crudimp.ListadoProveedorcl2();
				//enviamos hacia la vista
				request.setAttribute("listado",listado);
				//redireccionamos
				request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
				break;
			case "Listar":
				//redireccionamos hacia la vista(.jsp)
				request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);
				//salimos
				break;
			}  //fin del switch.....
		} //fin de la condicion..
		
		
	}  //fin del metodo doget...

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//recuperamos los datos del formulario...
		String codigo=request.getParameter("codigo");
		String nombre=request.getParameter("nombre");
		String ruc=request.getParameter("ruc");
		String razonsocial=request.getParameter("razonsocial");
		String email=request.getParameter("email");
		
		Date fecha=new Date();
		Date fechasql=new Date(fecha.getTime());
		//hacer las respectivas instancias....
		TblProveedorcl2 tblprov=new TblProveedorcl2();
		ClassProveedorcl2Imp climp=new ClassProveedorcl2Imp();
		//asignamos los valores
		tblprov.setNomproveecl2(nombre);
		tblprov.setRucproveecl2(ruc);
		tblprov.setRsocialproveecl2(razonsocial);
		tblprov.setEmailproveecl2(email);
		tblprov.setFeingproveecl2(fechasql);
		//aplicamos una condicion...
		if(codigo!=null){
			int cod=Integer.parseInt(codigo);
			//luego asignamos el codigo a actualizar...
			tblprov.setIdprooveedorcl2(cod);
			//invocamos el metodo a actualizar...
			climp.ActualizarProveedorcl2(tblprov);
		//invocamos el metodo registrar.
		}else{
		climp.RegistrarProveedorcl2(tblprov);
		}
		//actualizamos el listado...
		List<TblProveedorcl2> listado=climp.ListadoProveedorcl2();
		//enviamos hacia la vista
		request.setAttribute("listado",listado);
		//redireccionamos
		request.getRequestDispatcher("/MenuPrincipal.jsp").forward(request, response);		
	}   //fin del metodo dopost...

}  //fin de controlador producto...
