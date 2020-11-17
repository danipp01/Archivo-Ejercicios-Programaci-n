package EjerciciosArrayBloque4;

public class longitud_impar_media {

	public static void main(String[] args) {
		int longitud;
		int mitad = 0;
		System.out.println("Introduzca la longitud del array: ");
		longitud = Utils.obtenerEntero();
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			System.out.print(array[i] + " ");	
		}
		System.out.println();
		boolean finalizar;
		do {
			finalizar = false;
			if (longitud % 2 == 1) {
				mitad = array.length / 2;
				finalizar = true;
			} else {
				array[mitad] = -1;
				finalizar = true;
			} 
			System.out.println(array[mitad]);
		}while(!finalizar);
		
	}
	

}
