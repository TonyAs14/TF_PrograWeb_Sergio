package pe.edu.upc.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Compra;
import pe.edu.upc.serviceinterfaces.ICompraService;

@Named
@RequestScoped
public class CompraController {
	@Inject
	private ICompraService cService;

//atributos
	private Compra c;
	List<Compra> listaCompras;

	// m�todos
	@PostConstruct
	public void init() {
		this.listaCompras = new ArrayList<Compra>();
		this.c = new Compra();
	}

	public String newCompra() {
		this.setC(new Compra());
		return "compra.xhmtl";
	}

	public void insert() {
		try {
			cService.insert(c);
		} catch (Exception e) {
			System.out.println("Error ocurrio en el controlador de compra al insertar");
		}
	}

	public void list() {
		try {
			cService.list();
		} catch (Exception e) {
			System.out.println("Error al listar compras en el controller");
		}
	}

	// getter's & setter's
	public Compra getC() {
		return c;
	}

	public void setC(Compra c) {
		this.c = c;
	}

	public List<Compra> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(List<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}

}
