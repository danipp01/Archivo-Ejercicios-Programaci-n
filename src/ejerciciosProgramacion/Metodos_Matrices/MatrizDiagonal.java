package Metodos_Matrices;

import ejerciciosProgramacion.Utils;

public class MatrizDiagonal {

	public static void main(String[] args) {
		int matriz [][] = new int [][] {{1, 0, 0, 0, 1},
						                {0, 7, 0, 0, 0},
						                {0, 0, 13, 0, 0},
						                {0, 0, 0, 19, 0},
						                {0, 0, 0, 0, 25}};
						                
		Utils.ImprimirMatriz(matriz);                  
		boolean diagonal = Matriz_Diagonal(matriz);
		if (diagonal == true) {
			System.out.print("la matriz es diagonal");	 
			}
		else {
			System.out.print("la matriz no es diagonal");
		}
	}
			     
			    
	public static boolean Matriz_Diagonal (int matriz[][]) {
		boolean diagonal = true;
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j && matriz[i][j] != 0) {
					diagonal = false;
				}
			}
		}
		return diagonal;
	}

}


