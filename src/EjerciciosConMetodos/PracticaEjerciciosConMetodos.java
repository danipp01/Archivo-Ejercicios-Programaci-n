package EjerciciosConMetodos;

import javax.swing.JOptionPane;  


public class PracticaEjerciciosConMetodos {

	
	public static void main(String[] args) {
		
		//primer ejercicio
		float resultado1 =media(1, 3, 5, 7.2f);
		System.out.println(resultado1);
		String str = JOptionPane.showInputDialog("Obtener maximo1");
		
		//segundo ejercicio.
		int resultado2 = obtenerNumeroDeUsuarioEntreMinimoYMaximo(2,9);
		System.out.println(resultado2); 
		String str = JOptionPane.showInputDialog("Obtener maximo1");
		int n1 = Integer.parseInt(str); 
		String str1 = JOptionPane.showInputDialog("Obtener maximo2");
		int n2 = Integer.parseInt(str1);
		
		//tercer ejercicio.
		int resultado3 =maximo (n1,n2);
		System.out.println(resultado3);
		
		//cuarto ejercicio.
		int resultado4 =numeroImparEntreLimites (4,9);
		System.out.println(resultado4);
		
		//quinto ejercicio.
		String resultado5 = getStringFromEntero (5);
		System.out.println(resultado5);
		
		//sexto ejercicio.
		imprimeMinimoAMaximo(7, 5, 8);
		
		//septimo ejercicio.
		fibonacci(3);
		
		//octavo ejercicio.
		int array[]= {1, 0, 4, 4, 2, 7, 3, 13, 10, 9, 12};
		imprimeArray(array);
		
		//noveno ejercicio.
		recorte(array, 2, 7);
		
		//decimo ejercicio.
		recursividad(6);
		}
		
	
		public static float media (int num1, int num2, int num3, float num4) {
			float resultado = (num1 + num2 + num3 + num4)/ 4;
			return resultado;
		}
		
		
		public static int obtenerNumeroDeUsuarioEntreMinimoYMaximo (int min, int max) {
			String str = JOptionPane.showInputDialog("Introducir valor");
			int valor = Integer.parseInt(str);
			for (int i=0; i<1000000; i++) {
			if (valor>=min && valor<= max) {
					return valor;
			}
			else {
				str = JOptionPane.showInputDialog("Introducir valor");
				valor = Integer.parseInt(str);
			}
			}
			return valor;
					
		}
		
		
		public static int maximo (int valor, int valor1) {
			if(valor>valor1) {
				return valor;
			}
			else {
				return valor1;
			}
		}
		
		
		public static int numeroImparEntreLimites(int LimInf, int LimSup) {
			float numero = Math.round(Math.random()*100);
			for (int i = 0; i < 10000000; i++) {
				if (numero>=LimInf && numero <= LimSup && numero % 2 !=0) {
					return (int) numero;
				}
				else {
					numero = Math.round(Math.random()*100);
				}	
		}
			return (int) numero;
		}
		
		
		public static String getStringFromEntero(int numero) {
			String n = "cero";
			if(numero==1) {
				n = "uno";
			}
			if(numero==2) {
				n = "dos";
			}
			if(numero==3) {
				n = "tres";
			}
			if(numero==4) {
				n = "cuatro";
			}
			if(numero==5) {
				n = "cinco";
			}
			if(numero==6) {
				n = "seis";
			}
			if(numero==27) {
				n = "siete";
			}
			if(numero==8) {
				n = "ocho";
			}
			if(numero==9) {
				n = "nueve";
			}
			if(numero==10) {
				n = "diez";
			}
			return (String) n;
			 
		}
		
		
		public static void imprimeMinimoAMaximo(int n1, int n2, int n3) {
			int array []= new int [3];
			if (n1<n2 && n1<n3 && n2<n3) {
				array[0] = n1;
				array[1] = n2;
				array[2] = n3;
			}
			if (n1<n2 && n1<n3 && n3<n2) {
				array[0] = n1;
				array[1] = n3;
				array[2] = n2;
			}
			if (n2<n1 && n2<n3 && n1<n3) {
				array[0] = n2;
				array[1] = n1;
				array[2] = n3;
			}
			if (n2<n1 && n2<n3 && n3<n1) {
				array[0] = n2;
				array[1] = n3;
				array[2] = n1;
			}
			if (n3<n1 && n3<n2 && n1<n2) {
				array[0] = n3;
				array[1] = n1;
				array[2] = n2;
			}
			if (n3<n1 && n3<n2 && n2<n1) {
				array[0] = n3;
				array[1] = n2;
				array[2] = n1;
			}	
			for (int i=0; i<3; i++) {
				System.out.print(array[i]+ " ");	
				}
			return;
			
			
		}
		
		
		public static void fibonacci (int serie) {
			int num1=1;
			int num2=1;
			int suma=1;
			System.out.println();
			System.out.println(num1);
			for(int i = 1; i<serie; i++) {
				System.out.println(suma);
				suma= num1+num2;
				num1=num2;
				num2=suma;
			}
		}
	
		
		public static void imprimeArray(int[] array) {
			int numeros[]= new int[array.length]; 
			for(int i=0; i<numeros.length; i++) {
				numeros[i] = array[i];
				System.out.print(numeros[i]+ " "); 
			}
			System.out.println();
			}
		
		
		public static void recorte (int[] array, int PrimerIndice, int SegundoIndice) {
			int array1[]= new int[array.length]; 
			for(int i = PrimerIndice; i <= SegundoIndice; i++) {
				array1[i] = array[i];
				System.out.print(array1[i]+ " ");
			}
			System.out.println();
		}
			
		
		public static void recursividad(int numero) {
			System.out.print(numero + " ");
			if (numero<100) {
				recursividad(numero+1);
			}
		}
				

}


