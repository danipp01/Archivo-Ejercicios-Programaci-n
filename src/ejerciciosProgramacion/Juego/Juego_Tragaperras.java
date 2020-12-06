package Juego1;

import ejerciciosProgramacion.Utils;

public class Juego_Tragaperras {

	public static void main(String[] args) {
		int array[] = new int[3];

		// Recorre el array, mostramos el menu, y le damos los valores al array en caso
		// de que elijan la opción 1.
		for (int i = 0; i < array.length; i++) {
			int opcionUsuario = menu();
			System.out.println("opcion: " + opcionUsuario);
			if (opcionUsuario != 0 && opcionUsuario <= 1) {
				array[i] = Utils.obtenerNumeroAzar(1, 4);
				mostrarJugadas(array);
				System.out.println(" ");
				acumulador(array);
			} else {
				break;
			}
		}
	}

	// Método que muestra el array
	public static void mostrarJugadas(int jugadas[]) {
		for (int i = 0; i < jugadas.length; i++) {
			System.out.print(jugadas[i] + " ");
		}
	}

	// Método que muestra el menú y le da el valor a la variable
	public static int menu() {
		String strMenu = "\n\nMenú" + "\n0.- Salir" + "\n1.- Obtener numeros azar" + "\n\nIntroduzca su opción: ";
		System.out.println(strMenu);
		int opcionUsuario = Utils.obtenerEnteroPorScanner();
		return opcionUsuario;
	}

	// Método en el que sumo puntos o los resto en caso de que los números del array sean diferentes
	public static void acumulador(int[] array1) {
		int numero = 0;
		if (array1[0] == array1[1] && array1[1] == array1[2]) {
			numero += 1000;
			if (array1[0] == 4) {
				numero += 3000;
			}

		} else {
			numero -= 100;
		}
		System.out.println(numero);
	}

}
