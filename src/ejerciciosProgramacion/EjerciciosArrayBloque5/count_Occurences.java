package ejerciciosProgramacion.EjerciciosArrayBloque5;

public class count_Occurences {

	public static void main(String[] args) {
		int array[] = new int[] {10, 5, 10, 28, 10};
		int numero = 10;
		int sumatorio = countOccurrences(array, numero); 
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		System.out.println("El número de veces repetidas el número 10 es :" + sumatorio);
	}
	
	public static int countOccurrences(int array[],int numero) {
		int sumatorio = 0; 
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				sumatorio++;
			}
		}
		return sumatorio;
		
	}
}
