package ejercicioHerenciaObjetos.articulosComestibles;

public class Tienda {

	public static void main(String[] args) {
		ArticuloPerecedero Leche = new ArticuloPerecedero("Leche", 3, (float) 1.5, "7/12/2020");
		System.out.println(Leche);
		
		ArticuloPerecedero Jamon = new ArticuloPerecedero("Jamon", 45, (float) 59.99, "31/02/2021");
		System.out.println(Jamon);
		
		ArticuloNoPerecedero Azucar = new ArticuloNoPerecedero("Azucar", 5, 1);
		System.out.println(Azucar);
		
		ArticuloNoPerecedero Vino = new ArticuloNoPerecedero("Vino", 17, (float) 12.70);
		System.out.println(Vino);
	
	}

}
