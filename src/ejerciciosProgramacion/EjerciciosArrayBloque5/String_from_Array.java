package ejerciciosProgramacion.EjerciciosArrayBloque5;

public class String_from_Array {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int [] {13, 5, 7, 28, 42};
		String str = stringFromArray(array);
		System.out.println(str);
	}

	/**
	 * 
	 * @param array1
	 * @return
	 */
	public static String stringFromArray(int array1[]) {
		String str = " " ;
		for (int i = 0; i < array1.length; i++) {
			str += array1[i] + " " ;
		}
		return str;

	 }
}