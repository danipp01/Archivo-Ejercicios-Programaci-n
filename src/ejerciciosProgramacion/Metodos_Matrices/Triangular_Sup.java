package Metodos_Matrices;

import ejerciciosProgramacion.Utils;

public class Triangular_Sup {

	public static void main(String[] args) {
		int matriz [][] = new int [][] {{1, 0, 9, 0, 1},
            							{0, 7, 14, 3, 0},
            							{0, 0, 13, 0, 7},
            							{0, 0, 0, 19, 18},
            							{0, 0, 0, 0, 25}};
            
        Utils.ImprimirMatriz(matriz);                  
        boolean diagonal = TriangularSup(matriz);
        if (diagonal == true) {
        	System.out.print("la matriz es triangular superior");	 
        }
        else {
        	System.out.print("la matriz no es triangular superior");
        }
	}


	public static boolean TriangularSup (int matriz[][]) {
		boolean diagonal = true;
		for (int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) {
				if (j < i && matriz[i][j] != 0) {
					diagonal = false;
				}
			}
		}
		return diagonal;
	}

}
