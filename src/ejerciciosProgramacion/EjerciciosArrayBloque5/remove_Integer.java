package ejerciciosProgramacion.EjerciciosArrayBloque5;
import ejerciciosProgramacion.Utils;
public class remove_Integer {

	public static void main(String[] args) {
		int array[] = new int [] {3,5,7,9,9,4};
		int numero = 9;
		for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + " ");
		}
		System.out.println();
		int arrayResultado[] = removeInteger(array, numero);
		for (int i = 0; i < arrayResultado.length; i++) {
			System.out.print(arrayResultado[i] + " ");
		}
	}
	

	
	public static int[] removeInteger (int array[], int numero) {
		int contador = Utils.countOccurrences(array, numero);
		int j = 0;
		int array1[] = new int [array.length - contador];
		for (int i = 0; i < array.length; i++) {
			if (array[i] != numero) {
				array1[j] = array[i];
				j++;
			}
		}
		return array1;
		}
	
}	
