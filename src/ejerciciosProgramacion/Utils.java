package ejerciciosProgramacion;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Utils {

	/**
	 * Método que obtiene y devuelve un número al azar, entre 0 y 100.
	 * 
	 * @return Número generado al azar entre 0 y 100
	 */
	public static int obtenerNumeroAzar() {
		return (int) Math.round(Math.random() * 100);
	}

	/**
	 * 
	 * @param min Límite inferior de generación del número al azar
	 * @param max Límite superior de generación del número al azar
	 * @return Número generado al azar entre dos límites.
	 */
	public static int obtenerNumeroAzar(int min, int max) {
		return (int) Math.round(Math.random() * (max - min)) + min;
	}

	/**
	 * Obtiene un número entero introducido por el usuario, por el método de
	 * InputStreamReader
	 * 
	 * @return Número entero introducido por el usuario.
	 */
	public static int obtenerEnteroPorInputStreamReader() {
		int numero = 0;
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			numero = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return numero;
	}

	/**
	 * Obtiene un número entero a través de un objeto Scanner
	 * 
	 * @return Número entero introducido por el usuario.
	 */
	public static int obtenerEnteroPorScanner() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public static int countOccurrences(int array[], int numero) {
		int sumatorio = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				sumatorio++;
			}
		}
		return sumatorio;

	}
	
	
	public static void devolverMatriz (int matriz [][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar();
			}
		}
		
	}
	public static void ImprimirMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
