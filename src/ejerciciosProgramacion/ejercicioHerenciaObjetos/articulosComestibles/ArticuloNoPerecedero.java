package ejercicioHerenciaObjetos.articulosComestibles;

public class ArticuloNoPerecedero extends Articulo {

	public ArticuloNoPerecedero() {
		
	}

	public ArticuloNoPerecedero(String nombre, int codigo, float precio) {
		super(nombre, codigo, precio);
		
	}

	
	public String toString() {
		return "ArticuloNoPerecedero [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + "]";
	}
	
	

}
