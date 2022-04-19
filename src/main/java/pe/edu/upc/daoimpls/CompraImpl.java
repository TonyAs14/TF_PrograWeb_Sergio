package pe.edu.upc.daoimpls;

import java.util.List;

import pe.edu.upc.daointerfaces.ICompraDao;
import pe.edu.upc.entities.Compra;

public class CompraImpl implements ICompraDao {

	@Override
	public void insert(Compra c) {

		try {
			// SENTENCIAS SI VA BIEN

		} catch (Exception e) {
			// SENTENCIAS EN CASO DE ERROR

		}
	}

	@Override
	public List<Compra> list() {
		try {

		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
