package Interfaces;

import java.util.List;

import Model.TblProveedorcl2;

public interface IProveedorcl2 {
	void RegistrarProveedorcl2(TblProveedorcl2 tblproveedor);
	void ActualizarProveedorcl2(TblProveedorcl2 tblproveedor);
	void EliminarProveedorcl2(TblProveedorcl2 tblproveedor);
	List<TblProveedorcl2> ListadoProveedorcl2();
	TblProveedorcl2 BuscarProveedorcl2(TblProveedorcl2 tblproveedor);
}
