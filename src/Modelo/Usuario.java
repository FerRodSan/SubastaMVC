package Modelo;

import java.util.ArrayList;

public class Usuario implements Comparable<Usuario>{
	
	private String nombre;
	private int credito;

	public Usuario(String nombre, int credito) {
		super();
		this.nombre = nombre;
		this.credito = credito;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCredito() {
		return credito;
	}

	public void incrementarCredito(int credito) {
		this.credito += credito;
	}

	public void decrementarCredito(int credito) {
		this.credito -= credito;
	}
	
	@Override
	public String toString() {
		return this.nombre + " y tiene "+this.getCredito()+" € ";
	}

	@Override
	public int compareTo(Usuario o) {
		return this.nombre.compareTo(o.getNombre());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Usuario) {
			return this.nombre.equals(((Usuario) obj).getNombre());
		}
		return false;
	}

}
