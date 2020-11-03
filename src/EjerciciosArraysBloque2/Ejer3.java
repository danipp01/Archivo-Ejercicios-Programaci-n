package EjerciciosArraysBloque2;

public class Ejer3 {

	public static void main(String[] args) {
		int numeros[] = new int[150];
		int limiteSup = 100;
		int limiteInf = 0;
		int numero = Utils.obtenerEntero();
		// Inicializo el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Utils.obtenerNumeroAzar(limiteSup, limiteInf);
		}

		// Muestro el array en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");

		}
		System.out.println();
		System.out.println("Números multiplicados por usuario");
		for (int i = 0; i < numeros.length; i++) {

			System.out.print(numeros[i] * (numero) + " ");
		}

	}

}
