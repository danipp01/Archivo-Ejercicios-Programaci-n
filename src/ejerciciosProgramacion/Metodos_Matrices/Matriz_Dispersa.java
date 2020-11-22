package Metodos_Matrices;

import ejerciciosProgramacion.Utils;

public class Matriz_Dispersa {

	public static void main(String[] args) {
		int matriz[][] = {{ 7, 2, 0 }, 
						  { 0, 4, 9 }, 
				          { 8, 7, 0 }};
		Utils.ImprimirMatriz(matriz);
		boolean hayCero = MatrizDispersa(matriz);
		if (hayCero == true) {
			System.out.println("La matriz es dispersa");
		} else {
			System.out.println("La matriz no es dispersa");
		}
	}

	public static boolean MatrizDispersa(int matriz[][]) {
		boolean hayCero = false; 
		for(int i = 0;i<matriz.length;i++) {
			hayCero = false;
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 0) {
					hayCero = true;
					break;
				}
			}
			if (hayCero == false) {
				return false;
			}
		}
		
		for (int j = 0; j < matriz.length; j++) {
			hayCero = false;
			for (int i = 0; i < matriz[j].length; i++) {
				if (matriz[i][j] == 0) {
					hayCero = true;
					break;
				}
			}
			if (hayCero == false) {
				return false;
			}
		}
		return true;

	}
}
