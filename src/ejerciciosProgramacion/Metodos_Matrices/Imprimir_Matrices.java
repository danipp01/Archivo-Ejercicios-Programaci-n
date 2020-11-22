package Metodos_Matrices;

import ejerciciosProgramacion.Utils;

public class Imprimir_Matrices {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int matriz[][] = new int[5][5];
		Utils.devolverMatriz(matriz);
		ImprimirMatriz(matriz);
	}
	/**
	 * 
	 * @param matriz
	 */
	public static void ImprimirMatriz(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
