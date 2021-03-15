package EjerciciosBaseDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import excepciones.ImparException;

public class MenuBaseDatos {

	private static boolean LOG = true;
	private static int CONT_NOTIFICACION_INSERCION = 10;

	public static void main(String[] args) {
		int opcion;
		do {
			opcion = menu();
			
			switch (opcion) {
			case 0: 
				System.out.println("HAS ABANDONADO LA APLICACIÓN.");
				break;
			case 1: 
				pruebaConsultaBasica();
				break;
			case 2: 
				BorrarFabricante();
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (opcion != 0);
	}
	
	
	public static int menu() {
		String strMenu; 
		strMenu = JOptionPane.showInputDialog(
				"\n\nMenú"
				+ "\n0.- Salir"
				+ "\n1.- ListaFabricante"
				+ "\n2.- BorrarFabricante"
				+ "\n3.- AgregarFabricante");
		int opcion = Integer.parseInt(strMenu);
		return opcion;
	}
	
	private static void pruebaConsultaBasica () {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		   
																												
		
			Statement s = (Statement) conexion.createStatement(); 
			
			
			ResultSet rs = s.executeQuery ("select * from fabricante");
		   

			while (rs.next()) { 
				System.out.println (rs.getInt("id") + " " + rs.getString (2)+ 
						" " + rs.getString(3)); 
			}
	
			rs.close();
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	
	private static void BorrarFabricante() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			
			Connection conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		   
																												
		
			Statement s = (Statement) conexion.createStatement(); 
			
			
			int ResultSet = s.executeUpdate ("delete from fabricante where id=5");
			s.close();
			conexion.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	private static void creacionDatosFabricantes () throws SQLException, ImparException {
		Connection conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		Statement s = (Statement) conn.createStatement();
		int registrosInsertados;
		int contRegistrosInsertados = 0;		
		
		if (LOG)
			System.out.println("\nInsertando registros de en la tabla fabricante");

			String cif;
			cif = JOptionPane.showInputDialog("Introduce el cif");
			String nombre;
			nombre = JOptionPane.showInputDialog("Introduce el nombre");
			String sql = "INSERT INTO tutorialjavacoches.fabricante (id, cif, nombre) " +
					"VALUES  (" + nextIdEnTabla(conn, "fabricante") + ", '" + cif + "', '" + nombre + "')";
			registrosInsertados = s.executeUpdate(sql);
			if (registrosInsertados != 1) {
				throw new SQLException ("No ha sido posible la inserci�n con la cadena:\n" + sql);
			}
			contRegistrosInsertados++;
			if (contRegistrosInsertados % CONT_NOTIFICACION_INSERCION == 0 && LOG) {
				System.out.println("\t" + contRegistrosInsertados + " registros insertados en tabla fabricante");
			}
		
		s.close();
	}

	private static int nextIdEnTabla (Connection conn, String tabla) throws SQLException {
		return maxIdEnTabla(conn, tabla) + 1;
	}
	
	private static int maxIdEnTabla (Connection conn, String tabla) throws SQLException {
		Statement s = (Statement) conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches." + tabla;
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max;
	
	}
	

}
