package ejerciciosProgramacion.EjerciciosArrayBloque5;

public class find_and_Replace {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int[] {10, 5, 3, 28, 47};
		int Buscar = 10;
		int Reemplazar = 25;
		findAndReplace(array, Buscar, Reemplazar);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	/**
	 * 
	 * @param array1
	 * @param Buscar
	 * @param Reemplazar
	 */
	public static void findAndReplace(int array1[] ,int Buscar, int Reemplazar) {
		int i;
		for (i = 0; i < array1.length; i++) {
			if (array1[i] == Buscar){
				array1[i] = Reemplazar;
				
			}
			
		}
		
		}
	
	
}