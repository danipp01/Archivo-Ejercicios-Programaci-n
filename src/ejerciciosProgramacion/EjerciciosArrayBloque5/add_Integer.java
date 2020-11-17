package ejerciciosProgramacion.EjerciciosArrayBloque5;

public class add_Integer {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int[] { 10, 5, 3, 28, 47 };
		int numero = 5;
		System.out.println(" Array original :");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(" Array añadido :");
		int mostrar[] = addInteger(array, numero);
		for (int i = 0; i < mostrar.length; i++) {
			System.out.println(mostrar[i] + " ");
		}
	}
	
	/**
	 * 
	 * @param array
	 * @param numero
	 * @return
	 */
	public static int[] addInteger(int array[], int numero) {
		int array2[] = new int[] { 10, 5, 3, 28, 47, 0 };
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] == 0) {
				array2[i] = 5;
			}

		}
		return array2;
	}

}
