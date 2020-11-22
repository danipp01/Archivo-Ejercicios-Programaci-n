package Metodos_Matrices;

import ejerciciosProgramacion.Utils;

public class Matriz_Traspuesta {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		Utils.devolverMatriz(matriz);
		Utils.ImprimirMatriz(matriz);
		int matriz2[][] = MatrizTraspuesta(matriz);
		System.out.println(" ");
		Utils.ImprimirMatriz(matriz2);
	}

	public static int[][] MatrizTraspuesta(int matriz[][]) {
		int matriz2[][] = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz2[j][i] = matriz[i][j];
			}
		}
		return matriz2;
	}
}
