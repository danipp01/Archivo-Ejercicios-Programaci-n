package Metodos_Matrices;

import ejerciciosProgramacion.Utils;

public class Matriz_Opuesta {

	public static void main(String[] args) {
		int matriz[][] = new int [5][5];
		Utils.devolverMatriz(matriz);
		Utils.ImprimirMatriz(matriz);
		int matriz2[][] = MatrizOpuesta(matriz);
		System.out.println(" ");
		Utils.ImprimirMatriz(matriz2);
		
	
	}
	
	
	public static int[][] MatrizOpuesta(int matriz[][]) {
		int matriz2[][] = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz2[i][j] = ~matriz[i][j] + 1;
			}
		}
		return matriz2;
	}

}
