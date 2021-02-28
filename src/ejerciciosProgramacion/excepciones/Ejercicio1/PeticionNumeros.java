package excepciones;

import javax.swing.JOptionPane;

public class PeticionNumeros {
	public static void main(String[] args) {
		pideNumeroPar();
		
	}
	
	public static void pideNumeroPar() {
		int numero2;
		String str;
		try {
		str = JOptionPane.showInputDialog("Introduzca un número par");
		numero2 = Integer.parseInt(str);	
		
			if (numero2 % 2==0) {
			    System.out.println("El número es par");
			}
			else {
			    System.out.println("El número es impar");
			    throw new ImparException ("El número introducido es impar");
			}
			System.out.println("El numero introducido es: " + numero2);
		}catch (ImparException e) {
			System.out.println(e);
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
