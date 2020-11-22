package Metodos_Matrices;

import ejerciciosProgramacion.Utils;

public class Array_Unidimensional {

	public static void main(String[] args) {
		int matriz[][] = new int [5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Utils.obtenerNumeroAzar();
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
		ArrayUnidimensional(matriz);
	}
		
		
		
	
	public static int[] ArrayUnidimensional(int[][] matriz) {
		int contador = 0;
		int array2[] = new int[matriz.length * matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array2[contador] = matriz[i][j];
				contador++;	
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("\n" + array2[i] + " ");
		}
		
	}

}
