
public class Ejer0 {

	public static void main(String[] args) {
		// Declaro las variables implicadas en el programa
		int limiteInf, limiteSup;

		// Declaración del array, a través de la sentencia "new"
		int numeros[] = new int[150];
		System.out.println("Introduce un límite inferior:");
		limiteInf = Utils.obtenerEnteroPorScanner();
		System.out.println("Introduce un límite superior:");
		limiteSup = Utils.obtenerEnteroPorScanner();

		// Inicializo el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Utils.obtenerNumeroAzar(limiteInf, limiteSup);
		}

		// Muestro el array en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}

	}

}
