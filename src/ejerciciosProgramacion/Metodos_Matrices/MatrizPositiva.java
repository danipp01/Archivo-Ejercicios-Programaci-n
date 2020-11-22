package Metodos_Matrices;

import ejerciciosProgramacion.Utils;

public class MatrizPositiva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				 int matriz [][] = new int [5][5];
			     Utils.devolverMatriz(matriz);
			     Utils.ImprimirMatriz(matriz);
			     System.out.println(Matriz_Positiva(matriz) + " positivo ");
			}
	public static boolean Matriz_Positiva (int matriz[][]) {
			boolean positivo = true;
			for (int i = 0; i < matriz.length; i++) { 
				for (int j = 0; j < matriz[i].length; j++) {
					if (matriz[i][j] < 0) {
						positivo = false;
					}
				}
			}
			return positivo;
	}


}


