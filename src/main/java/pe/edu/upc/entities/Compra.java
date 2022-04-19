package pe.edu.upc.entities;

import java.util.Date;

public class Compra {

	private int IdCompra;
	private double Total;
	private Date FechaCompra;
	private String MetodoPago;

	// CONSTRUCTOR SIN PARÁMETROS
	public Compra() {
		super();
		// TODO Auto-generated constructor stub
	}

	// CONSTRUCTOR CON PARÁMETROS
	public Compra(int idCompra, double total, Date fechaCompra, String metodoPago) {
		super();
		this.IdCompra = idCompra;
		this.Total = total;
		this.FechaCompra = fechaCompra;
		this.MetodoPago = metodoPago;
	}

	// GENERAR GETTER'S A SETTER'S
	public int getIdCompra() {
		return IdCompra;
	}

	public void setIdCompra(int idCompra) {
		this.IdCompra = idCompra;
	}

	public double getTotal() {
		return Total;
	}

	public void setTotal(double total) {
		Total = total;
	}

	public Date getFechaCompra() {
		return FechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		FechaCompra = fechaCompra;
	}

	public String getMetodoPago() {
		return MetodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		MetodoPago = metodoPago;
	}

}
