package ejercicioHerenciaObjetos.articulosComestibles;

public class ArticuloPerecedero extends Articulo {
	
	protected String fechaCaducidad;
	
	public ArticuloPerecedero() {
		
	}

	public ArticuloPerecedero(String nombre, int codigo, float precio, String fechaCaducidad) {
		super(nombre, codigo, precio);
		this.fechaCaducidad = fechaCaducidad;
	}

	public String toString() {
		return "ArticuloPerecedero [fechaCaducidad=" + fechaCaducidad + ", nombre=" + nombre + ", codigo=" + codigo
				+ ", precio=" + precio + "]";
	}

	
	
	
}
