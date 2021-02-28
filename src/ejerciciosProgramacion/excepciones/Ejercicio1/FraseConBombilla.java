package excepciones;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class FraseConBombilla {

	public static void main(String[] args) {
		FraseBombilla();
	}
	
	public static void FraseBombilla() {
		String frase;
		try {
			frase = JOptionPane.showInputDialog("Introduzca una frase: ");
			Arrays fraseBombilla[] = new Arrays[frase.length()];
			System.out.println(fraseBombilla);
			
		}catch (Exception e) {
			
		}
	}
}
