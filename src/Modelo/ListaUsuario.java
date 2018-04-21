package Modelo;

import java.util.ArrayList;

public class ListaUsuario {
	
	private ArrayList<Usuario> lista = new ArrayList<>();
	
	public void agregarUsuario(String nombre, int credito) {
		this.lista.add(new Usuario(nombre, credito));
	}

	public ArrayList<Usuario> getLista() {
		return lista;
	}
}
