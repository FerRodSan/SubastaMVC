package Modelo;

public class Puja {
	
	private Usuario pujador;
	private int dineroPuja;

	public Puja(Usuario usuario, int dineroPuja) {
		super();
		this.pujador = usuario;
		this.dineroPuja=dineroPuja;
	}

	public Usuario getPujador() {
		return pujador;
	}

	public int getDineroPuja() {
		return dineroPuja;
	}

	@Override
	public String toString() {
		return this.pujador.getNombre() + " " + getDineroPuja() + "€";
	}
}
