package Modelo;

import java.util.ArrayList;

public class Subasta {

	private String producto;
	private Usuario subastador;
	private boolean estado;
	private ArrayList<Puja> listaPujas;
	private Puja pujaMayor;

	public Subasta(Usuario subastador, String producto) {
		super();
		this.producto = producto;
		this.subastador = subastador;
		this.estado = true;
		this.listaPujas = new ArrayList<>();
	}

	public Usuario getSubastador() {
		return subastador;
	}

	public String getProducto() {
		return producto;
	}

	public Usuario getPujador() {
		return subastador;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public ArrayList<Puja> getListaPujas() {
		return listaPujas;
	}

	public Puja getPujaMayor() {
		if (!listaPujas.isEmpty()) {
			return listaPujas.get(0);
		} else
			return null;
	}

	public void setPujaMayor(Puja pujaMayor) {
		this.pujaMayor = pujaMayor;
	}

}
