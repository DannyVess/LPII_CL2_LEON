package TestEntidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import DaoImp.ClassProveedorcl2Imp;
import Model.TblProveedorcl2;



public class testEntidadProveedorcl2 {
	
	public static void main(String[] args) {
	//instanciamos la respectivas clases
			TblProveedorcl2 tbl=new TblProveedorcl2();
			ClassProveedorcl2Imp crudimp=new ClassProveedorcl2Imp();
			
			
			//asignamos los respectivos valores
//			tbl.setNomproveecl2("Google");
//			tbl.setRucproveecl2("1025252578");
//			tbl.setRsocialproveecl2("Google S.A.C.");
//			tbl.setEmailproveecl2("google@gmail.com");
//			Date fecha=new Date();
//			Date fechasql=new Date(fecha.getTime());
//			tbl.setFeingproveecl2(fechasql);
//			//invocamos el respectivo metodo registrar...
//			crudimp.RegistrarProveedorcl2(tbl);
			
			//******************TESTEANDO EL METODO LISTADO...
			List<TblProveedorcl2> listadoproveedor=crudimp.ListadoProveedorcl2();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

			
			//aplicamos un bucle for..
			for(TblProveedorcl2 prov:listadoproveedor){
				
				//imprimir por pantalla
				System.out.println("idprooveedorcl2=" + prov.getIdprooveedorcl2() + ", nomproveecl2=" + prov.getNomproveecl2()
						+ ", rucproveecl2=" + prov.getRucproveecl2() + ", rsocialproveecl2=" + prov.getRsocialproveecl2() + ", emailproveecl2="
						+ prov.getEmailproveecl2() + ", feingproveecl2=" + format.format(prov.getFeingproveecl2()));
				
			}  //fin de bucle for....
			
			
			
	}
}
