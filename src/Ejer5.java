
public class Ejer5 {

	public static void main(String[] args) {
		// Declaración del array, a través de la sentencia "new"
		int numeros[] = new int[150];
		int limiteSup= 100;
		int limiteInf= 0;
		// Inicializo el array
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Utils.obtenerNumeroAzar(limiteSup,limiteInf);
		}
		
		// Muestro el array en pantalla
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		int cont = 0;
		for (int i = 0; i< numeros.length; i++) {
			if (i%2==0) {
				cont = cont + numeros[i];
			}
		}
		System.out.println();
		System.out.println("La suma de los elementos pares es: " + cont);

	}

}
